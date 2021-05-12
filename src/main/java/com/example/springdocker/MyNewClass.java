package com.example.springdocker;

public class MyNewClass {
    public String firstname;
    public String lastname;

    public int getAge() {
        return 25;
    }

    public String getNameAndAge() {
        return firstname + " " + lastname + " is: " + getAge() + " years old.";
    }
}
