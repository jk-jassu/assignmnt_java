import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int palindromeCount = 0;
        int nonPalindromeCount = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter the string: ");
            String input = scanner.nextLine();

            if (isPalindrome(input)) {
                System.out.println("String is Palindrome");
                palindromeCount++;
            } else {
                System.out.println("String is not Palindrome");
                nonPalindromeCount++;
            }
        }

        System.out.println("\nString was Palindrome " + palindromeCount + " times.");
        System.out.println("String was not Palindrome " + nonPalindromeCount + " times.");
    }

    public static boolean isPalindrome(String input) {
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = processedInput.length() - 1;

        while (left < right) {
            if (processedInput.charAt(left) != processedInput.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
