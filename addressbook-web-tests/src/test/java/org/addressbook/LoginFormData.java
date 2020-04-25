package org.addressbook;

public class LoginFormData {
    private final String username;
    private final String password;

    public LoginFormData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
