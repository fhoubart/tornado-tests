package org.tornado.entities;

public class User {
    private String name;
    private String email;
    
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() { return this.email; }
    public String getName() { return this.name; }
}