import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 13: Performance Comparison of Palindrome Algorithms
 *
 * Description:
 * This program takes user input, runs multiple palindrome
 * checking approaches, measures execution time using
 * System.nanoTime(), and displays the results.
 *
 * Key Concepts:
 * - System.nanoTime()
 * - Algorithm comparison
 * - Stack
 * - Deque
 * - Two-pointer technique
 *
 * @author Developer
 * @version 13.0
 */

public class UseCase13PalindromeCheckerApp {

    // Method 1: Two-pointer approach
    public static boolean checkUsingTwoPointer(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Stack approach
    public static boolean checkUsingStack(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Method 3: Deque approach
    public static boolean checkUsingDeque(String input) {
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

    // Method 4: Reverse string approach
    public static boolean checkUsingReverse(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        return input.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        // Normalize input: ignore spaces and case
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Two-pointer timing
        long start1 = System.nanoTime();
        boolean result1 = checkUsingTwoPointer(normalized);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Stack timing
        long start2 = System.nanoTime();
        boolean result2 = checkUsingStack(normalized);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Deque timing
        long start3 = System.nanoTime();
        boolean result3 = checkUsingDeque(normalized);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        // Reverse string timing
        long start4 = System.nanoTime();
        boolean result4 = checkUsingReverse(normalized);
        long end4 = System.nanoTime();
        long time4 = end4 - start4;

        System.out.println("\nOriginal Input   : " + input);
        System.out.println("Processed Input  : " + normalized);

        System.out.println("\n===== Performance Comparison =====");
        System.out.println("1. Two-Pointer  -> Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("2. Stack        -> Result: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("3. Deque        -> Result: " + result3 + " | Time: " + time3 + " ns");
        System.out.println("4. Reverse      -> Result: " + result4 + " | Time: " + time4 + " ns");

        sc.close();
    }
}