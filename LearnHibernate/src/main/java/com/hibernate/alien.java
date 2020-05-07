package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class alien {
    @Id
    private String aname;

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }
    private String color;
    private int aid;

    @Override
    public String toString() {
        return "alien{" +
                "aname='" + aname + '\'' +
                ", color='" + color + '\'' +
                ", aid=" + aid +
                '}';
    }
}
