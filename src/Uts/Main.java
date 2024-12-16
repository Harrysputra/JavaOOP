package Uts;

import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false; // Jika input null atau kosong
        }


        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleanedInput.length() - 1;

        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Masukan Kata : ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Input adalah palindrom.");
        } else {
            System.out.println("Input bukan palindrom.");
        }

        scanner.close();

    }
}
