import javax.print.attribute.standard.NumberUp;

public class Main {
    public static void main(String[] args) {
        System.out.println(NumberPalindrome.isPalindrome(-1221));
            // → -1221 should return true
        System.out.println(NumberPalindrome.isPalindrome(707));
            // → 707 should return true
        System.out.println(NumberPalindrome.isPalindrome(11212));
            // → 11212 should return false because reverse is 21211 and that is not equal to 11212

    }
}
