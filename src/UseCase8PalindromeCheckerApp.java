/**
 * ============================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 8: Palindrome using Singly Linked List
 *
 * Description:
 * Converts the string into a singly linked list and checks
 * whether it is a palindrome using fast/slow pointer and
 * in-place reversal technique.
 *
 * @author Developer
 * @version 8.0
 */

public class UseCase8PalindromeCheckerApp {

    // Node class for Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        String input = "level";

        // Convert string into linked list
        Node head = null;
        Node tail = null;

        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Find middle using fast & slow pointer
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half of linked list
        Node prev = null;
        Node current = slow;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Compare halves
        Node firstHalf = head;
        Node secondHalf = prev;

        boolean isPalindrome = true;

        while (secondHalf != null) {

            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}