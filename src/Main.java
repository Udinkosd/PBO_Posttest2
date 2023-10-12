import Crud.Menu;
import Crud.Login;
import Database.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "user", "userpass", "user"));
        users.add(new User(2, "admin", "adminpass", "admin"));

        System.out.println("Selamat Datang, Silahkan Login");
        System.out.print("Masukkan Username: ");
        String username = input.nextLine();
        System.out.print("Masukkan Password: ");
        String password = input.nextLine();

        boolean isAdmin = false;

        if (Login.verifyLogin(username, password, users)) {
            for (User user : users) {
                if (user.getUsername().equals(username) && user.getRole().equals("admin")) {
                    isAdmin = true;
                    break;
                }
            }
            Menu.run(isAdmin);
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }
    }
}
