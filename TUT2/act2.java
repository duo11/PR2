package TUT2;
import java.util.Scanner;
public class act2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of quarters: ");
        int quarters = scanner.nextInt();

        System.out.print("Enter the number of dimes: ");
        int dimes = scanner.nextInt();

        System.out.print("Enter the number of nickels: ");
        int nickels = scanner.nextInt();

        System.out.print("Enter the number of pennies: ");
        int pennies = scanner.nextInt();

        scanner.close();

        double totalDollars = (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01);

        System.out.println("Total amount: $" + totalDollars);
    }
}
