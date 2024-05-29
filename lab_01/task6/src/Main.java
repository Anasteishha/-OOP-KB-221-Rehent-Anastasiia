import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть загальну суму рахунку: ");
        int totalAmount = scanner.nextInt();

        System.out.print("Введіть кількість друзів: ");
        int numFriends = scanner.nextInt();

        if (totalAmount < 0) {
            System.out.println("Некоректна сума рахунку!");
            return;
        } else if (numFriends <= 0) {
            System.out.println("Некоректна кількість друзів!");
            return;
        }

        double tip = totalAmount * 0.1;
        double totalWithTip = totalAmount + tip;
        double portion = totalWithTip / numFriends;

        System.out.println("Розмір частини оплати: " + portion);
    }
}