package com.curd.Project.model;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id

    private int id;
    @Column(name = "First_Name")
    private String firstname;
    @Column     (name="Last_Name")
    private String lastname;
    @Column(name = "Class")
    private String className;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
