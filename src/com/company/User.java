package com.company;

/**
 * Created by java1 on 2017.12.04..
 */
public class User {

    //adattagok
    private int id;
    private String firstname;
    private String lastname;
    private String password;
    private int age;

    ///alap konstruktor
    public User() {
    }

    //konstruktor 1.típus
    public User(int id, String firstname, String lastname, String password, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.age = age;
        this.id = id;
    }

    //konstruktor 2.típus
    public User(User user) {
        this.age = user.age;
        this.firstname = user.firstname;
        this.lastname = user.lastname;
        this.password = user.password;
    }

    //getterek
    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    //Setterek
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
