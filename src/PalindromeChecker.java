/**
 * ============================================================
 * CLASS - PalindromeChecker
 * ============================================================
 *
 * Description:
 * Encapsulates the palindrome checking logic.
 * Uses a simple character comparison method.
 *
 * Concepts:
 * Encapsulation
 * Single Responsibility Principle
 *
 * @author Developer
 * @version 11.0
 */

public class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}