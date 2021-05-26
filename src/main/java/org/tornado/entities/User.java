package org.tornado;

class User {
    private String name;
    private String email;
    
    public constructor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() { return this.email; }
    public String getName() { return this.name; }
}