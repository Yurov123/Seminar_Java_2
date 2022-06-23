// Определение является ли строка палиндромом

package Seminar2;

public class task01 {
    public static void main(String[] args) {
        palindrome("NOON");
    }

    public static void palindrome(String string) {
        StringBuilder sb = new StringBuilder(string);
        String reverse_string = sb.reverse().toString();
        // System.out.println(reverse_string);
        if (string.equals(reverse_string)) {

            System.out.println(reverse_string + " is palindrome.");
        } else
            System.out.println("It's not palindrome.");
    }
}