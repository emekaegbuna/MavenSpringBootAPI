package com.example.mavenproject5.user;


import javax.persistence.*;

@Entity
public class User {


    @Id
    private String userID;
    private String name;
    private String email;


    public User() {

    }

    public User(String userID, String name, String email) {
    this.userID = userID;
    this.name = name;
    this.email = email;
    }

    public String getuserID() {
    return userID;
    }
    public void setuserID(String userID) {
    this.userID = userID;
    }

    public String getName() {
    return name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public String getEmail() {
    return email;

    }
    public void setEmail(String email) {
    this.email = email;

    }
}
