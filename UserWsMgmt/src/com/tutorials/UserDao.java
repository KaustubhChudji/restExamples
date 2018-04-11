package com.tutorials;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    @SuppressWarnings("unchecked")
    public List<User> getAllUsers() {

        List<User> userList = null;
        try {
            final File file = new File("Users.dat");
            if (!file.exists()) {
                final User user = new User(1, "Test", "Coder");
                userList = new ArrayList<>();
                userList.add(user);
                saveUserList(userList);
            }
            else {
                final FileInputStream fis = new FileInputStream(file);
                final ObjectInputStream ois = new ObjectInputStream(fis);
                userList = (List<User>) ois.readObject();
                ois.close();
            }
        }
        catch (final IOException e) {
            e.printStackTrace();
        }
        catch (final ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userList;
    }

    private void saveUserList(final List<User> userList) {
        try {
            final File file = new File("Users.dat");
            FileOutputStream fos;
            fos = new FileOutputStream(file);
            final ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(userList);
            oos.close();
        }
        catch (final FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (final IOException e) {
            e.printStackTrace();
        }
    }
}
