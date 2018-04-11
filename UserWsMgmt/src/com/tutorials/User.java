package com.tutorials;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User implements Serializable {
    private static final long serialVersionUID = 4261887195766006382L;

    private int id;
    private String name;
    private String profession;

    public User() {
    }

    public User(final int id, final String name, final String profession) {
        super();
        this.id = id;
        this.name = name;
        this.profession = profession;
    }

    public int getId() {
        return this.id;
    }

    @XmlElement
    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    @XmlElement
    public void setName(final String name) {
        this.name = name;
    }

    public String getProfession() {
        return this.profession;
    }

    @XmlElement
    public void setProfession(final String profession) {
        this.profession = profession;
    }

}
