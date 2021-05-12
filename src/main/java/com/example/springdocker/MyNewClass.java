package com.example.springdocker;

public class MyNewClass {
    public String firstname;
    public String lastname;

    public int getAge() {
        return 10;
    }

    public String getNameAndAge() {
        return firstname + " " + lastname + " is: " + getAge() + " years old.";
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
