import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ============================================================
 * CLASS - DequeStrategy
 * ============================================================
 *
 * Implements palindrome check using Deque.
 */

public class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}