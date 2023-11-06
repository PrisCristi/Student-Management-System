package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private String userRole;
    private String login;

    public User(String userName, String login, String userRole) {
        this.userName = userName;
        this.login = login;
        this.userRole = userRole;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getUserRole() {
        return userRole;
    }
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}

