import java.util.Scanner;

/**
 * ============================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 10: Ignore Spaces and Case Palindrome Checker
 *
 * Description:
 * This program checks whether a string is a palindrome
 * after ignoring spaces and letter case.
 *
 * Key Concepts:
 * - String preprocessing
 * - Regular expressions
 * - Two pointer comparison
 *
 * @author Developer
 * @version 10.0
 */

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Original Input : " + input);
        System.out.println("Processed Input: " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}