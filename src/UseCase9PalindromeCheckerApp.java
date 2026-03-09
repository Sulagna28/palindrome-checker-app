import java.util.Scanner;

/**
 * ============================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 9: Palindrome Check using Recursion
 *
 * @author Developer
 * @version 9.0
 */

public class UseCase9PalindromeCheckerApp {

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}