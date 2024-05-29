import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxValue = Integer.MIN_VALUE;

        while (true) {
            int currentValue = scanner.nextInt();
            if (currentValue == 0) {
                break;
            }
            if (currentValue > maxValue) {
                maxValue = currentValue;
            }
        }

        System.out.println("Максимальне значення: " + maxValue);
    }
}