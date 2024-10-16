package org.launchcode.models;

import java.time.LocalDate;
import java.util.Date;

public class User {

    private int id;                      // Studio Bonus Mission #1
    private static int nextId = 1;              // Studio Bonus Mission #1

    private String userName;
    private String email;
    private String password;

    //private Date dateToday;    // Deprecated Class due to poor handling of methods & time zones
    private final LocalDate dateToday; // Studio Bonus Mission #2 - Adding date

    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.id=nextId;
        nextId++;
        //dateToday = new Date();                 // Studio Bonus Mission #2 - Adding date
        dateToday = LocalDate.now();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateToday() {
        return dateToday;
    }
}
