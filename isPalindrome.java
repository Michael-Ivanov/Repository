import java.util.Scanner;
public class isPalindrome {
    public static void main(String[] args) {
        String text = "Doc, note, I dissent. A fast never prevents a fatness. I diet on cod.";
        System.out.println("string is: " + text);

        String str = text.replaceAll("[^a-zA-Z0-9]", "");  //cleans all symbols which are not english letters or numbers
        System.out.println("letters and numbers only: " + str);

        StringBuilder reverseStr = new StringBuilder(str);
        reverseStr = reverseStr.reverse();    // reverses string with StringBuilder method
        System.out.println("reverse string: " + reverseStr);

        boolean IfPal = str.equalsIgnoreCase(reverseStr.toString()); // check if palindrome
        System.out.println("Is palindrome? " + IfPal + "!");

    }
}
