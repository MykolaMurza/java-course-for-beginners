import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("username", "password");
        users.put("admin", "root");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scan.nextLine();

        if (users.containsKey(username)) {
            System.out.print("Enter your password: ");
            // ...
        } else {
            throw new UserNotFoundException();
        }
    }
}
