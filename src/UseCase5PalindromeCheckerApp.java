import java.util.Scanner;
import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * @author Developer
 * @version 5.0
 */

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}