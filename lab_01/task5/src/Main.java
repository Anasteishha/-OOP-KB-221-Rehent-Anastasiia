import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть швидкість підйому равлика (a): ");
        int a = scanner.nextInt();

        System.out.print("Введіть швидкість сповзання равлика (b): ");
        int b = scanner.nextInt();

        System.out.print("Введіть висоту дерева (h): ");
        int h = scanner.nextInt();

        if (a <= b) {
            System.out.println("Impossible");
            return;
        }

        int days = (h - b) / (a - b);
        if ((h - b) % (a - b) != 0) {
            days++;
        }

        System.out.println("Равлик дістанеться до вершини дерева за " + days + " днів.");
    }
}