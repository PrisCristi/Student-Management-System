package org.example;

import java.util.AbstractMap;
import java.util.HashMap;

public class User {
    private String userName;
    private String login;

    public User(String userName, String login) {
        this.userName = userName;
        this.login = login;
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
}

