package Crud;

import Database.User;

import java.util.ArrayList;

public class Login {
    public static boolean verifyLogin(String username, String password, ArrayList<User> users) {
        return users.stream().anyMatch(user -> user.getUsername().equals(username) && user.getPassword().equals(password));
    }
}
