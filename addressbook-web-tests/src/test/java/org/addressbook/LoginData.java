package org.addressbook;

public class LoginData {
    private final String user;
    private final String pass;

    public LoginData(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
}
