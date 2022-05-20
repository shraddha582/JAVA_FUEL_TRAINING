package com.example.demomethods;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Student {
    public Student() {

    }

    public Student(int id, String name) {

        this.id = id;
        this.name = name;
    }

    @Id
    private int id;
    private String name;

    // getter and setter methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

}
