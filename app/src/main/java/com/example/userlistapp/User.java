package com.example.userlistapp;

public class User {
    private int id;
    private String name;
    private String username; // ✅ BỔ SUNG
    private String email;

    // Constructor (rất quan trọng nếu bạn tạo fake data)
    public User(int id, String name, String username, String email) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getUsername() { return username; } // ✅ BỔ SUNG GETTER
    public void setUsername(String username) { this.username = username; } // ✅

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
