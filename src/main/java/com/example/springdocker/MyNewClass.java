package com.example.springdocker;

public class MyNewClass {
    public String firstname;
    public String lastname;

    public int getAge() {
        return 10;
    }

    public String getNameAndAge() {
        return lastname + " is: " + getAge() + " old.";
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
