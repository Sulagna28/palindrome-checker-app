import java.util.Scanner;

public class Main {

    public static boolean isSimplePalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }

    public static boolean isCaseInsensitivePalindrome(String str) {
        String original = str.toLowerCase();
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        return original.equals(reversed);
    }

    public static boolean isIgnoringSpacesPalindrome(String str) {
        String original = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        return original.equals(reversed);
    }

    public static boolean isIgnoringNonAlphanumericPalindrome(String str) {
        String original = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App ===");
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        System.out.println("\nChoose checking method:");
        System.out.println("1. Simple palindrome check");
        System.out.println("2. Case-insensitive palindrome check");
        System.out.println("3. Ignore spaces and check");
        System.out.println("4. Ignore special characters, spaces, and case");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        boolean result = false;

        switch (choice) {
            case 1:
                result = isSimplePalindrome(input);
                break;
            case 2:
                result = isCaseInsensitivePalindrome(input);
                break;
            case 3:
                result = isIgnoringSpacesPalindrome(input);
                break;
            case 4:
                result = isIgnoringNonAlphanumericPalindrome(input);
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        if (result) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }

        sc.close();
    }
}