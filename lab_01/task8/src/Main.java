import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            int currentValue = scanner.nextInt();
            if (currentValue == 0) {
                break;
            }
            sum += currentValue;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("Середнє значення: " + (int) Math.round(average));
    }
}