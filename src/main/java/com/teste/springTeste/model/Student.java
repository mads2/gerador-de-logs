package com.teste.springTeste.model;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Student(String name) {
        this.name = name;
    }

}
