import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість незнайомців: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Кількість незнайомців не може бути від'ємною!");
            return;
        }
        else if (number == 0) {
            System.out.println("Ви не зустрінетеся з ніким.");
            return;
        }

        for (int i = 0; i < number; i++) {
            System.out.print("Введіть ім'я незнайомця " + (i + 1) + ": ");
            String name = scanner.next();
            System.out.println("Привіт, " + name + "!");
        }
    }
}