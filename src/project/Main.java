package project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double customerIncome = scanner.nextDouble();

        double incomeSum = (customerIncome >= 0 && customerIncome <= 10_000) ? ((customerIncome * 2.5) / 100) :
                (customerIncome > 10_000 && customerIncome <= 25_000) ? ((customerIncome * 4.3) / 100) :
                        ((customerIncome * 6.7) / 100);

        System.out.printf("The amount of tax: %.2f", incomeSum);

        scanner.close();
    }
}
