import java.util.Scanner;

public class Main {
    final static int password = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть пароль: ");
        int userInput = scanner.nextInt();
        if (userInput == password) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}