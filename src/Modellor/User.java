package Modellor;

import javax.management.relation.Role;

public class User {
    private String username;
    private String userId;
    private Role role;

    public User(String username, String userId, Role role) {
        this.username = username;
        this.userId = userId;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getUserId() {
        return userId;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userId='" + userId + '\'' +
                ", role=" + role +
                '}';
    }
}
