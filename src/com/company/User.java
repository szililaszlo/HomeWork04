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

    //Setterek
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    //metódus mely véletlen jelszót generál
    public String generatePassword(int length) {
        String password = "";
        char actualCharacter;

        //használható karakterek
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789%!?";

        //for ciklussal történő karakter feltöltés
        for (int i = 0; i < length; i++) {
            int postition = (int) (Math.random() * ((characters.length() - 0) + 0));

            //a véletlen generált pozicióba található karakter kimentése
            actualCharacter = characters.charAt(postition);
            //majd a hozzáírás a jelszóhoz
            password += actualCharacter;
        }
        return password;
    }
}
