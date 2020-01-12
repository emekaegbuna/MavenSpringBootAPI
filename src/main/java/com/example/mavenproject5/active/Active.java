package com.example.mavenproject5.active;


import com.example.mavenproject5.user.User;import javax.persistence.Entity;import javax.persistence.Id;import javax.persistence.ManyToOne;

@Entity
public class Active {

    @Id
    private String activeID;
    private String name;
    @ManyToOne
    private User user;

    public User getUser() {
    return user;

    }
    public void setUser(User user) {
    this.user = user;

    }

    public Active(String activeID, String name, String userID) {
        super();
        this.activeID = activeID;
        this.name = name;
        this.user = new User(userID, "", "");
    }

    public Active() {

    }

    public String getactiveID() {
        return activeID;
    }

    public void setactiveID(String activeID) {
        this.activeID = activeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
