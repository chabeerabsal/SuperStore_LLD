package Modellor;

import Modellor.User.User;

public class Login {
    private User user;
    private String username;
    private String password;
    public Login(User user, String username, String password) {
        this.user = user;
        this.username = username;
        this.password = password;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;

    }
    public String getPassword() {
        return password;
    }

}
