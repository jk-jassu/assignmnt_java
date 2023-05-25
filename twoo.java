import java.util.Scanner;

public class twoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first string: ");
            String firstString = scanner.nextLine();

            if (firstString == null) {
                throw new IllegalArgumentException("First string cannot be null.");
            }

            System.out.print("Enter the second string: ");
            String secondString = scanner.nextLine();

            if (secondString == null) {
                throw new IllegalArgumentException("Second string cannot be null.");
            }

            int firstStringLength = firstString.length();
            System.out.println("Length of the first string: " + firstStringLength);

            String concatenatedString = firstString.concat(secondString);
            System.out.println("Concatenated string: " + concatenatedString);

            String reversedFirstString = reverseString(firstString);
            System.out.println("Reversed first string: " + reversedFirstString);

            String reversedSecondString = reverseString(secondString);
            System.out.println("Reversed second string: " + reversedSecondString);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String reverseString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }

        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
