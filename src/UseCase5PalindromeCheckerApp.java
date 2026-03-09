import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This program uses a Stack to reverse characters
 * and check whether the string is a palindrome.
 *
 * @author Developer
 * @version 5.0
 */

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        // Declare and initialize the input string
        String input = "noon";

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare characters by popping from stack
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}