import java.util.Scanner;

public class onee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three double numbers separated by spaces:");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double maximum = findMaximum(num1, num2, num3);

        System.out.println("The maximum number is: " + maximum);
    }

    public static double findMaximum(double num1, double num2, double num3) {
        double maximum = num1;

        if (num2 > maximum) {
            maximum = num2;
        }

        if (num3 > maximum) {
            maximum = num3;
        }

        return maximum;
    }
}
