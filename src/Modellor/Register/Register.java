package Modellor.Register;

import Modellor.User.User;

import java.io.Serializable;

public class Register {
    private User user;
    private String username;
    private String password;

    public Register(User user, String username, String password) {
        this.user = user;
        this.username = username;
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
