import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * ============================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * @author Developer
 * @version 7.0
 */

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}