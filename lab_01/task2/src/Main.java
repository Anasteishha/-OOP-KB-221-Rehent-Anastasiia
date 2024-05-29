import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int seconds = scanner.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secondsRemaining = seconds % 60;
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, secondsRemaining);
    }
}