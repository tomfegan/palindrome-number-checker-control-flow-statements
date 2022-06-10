public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int removeNegative = Math.abs(number);
        int argumentNumber = removeNegative;
        int reverse = 0;

        while (argumentNumber > 0) {
            int lastDigit = argumentNumber % 10;
            reverse = lastDigit + (10 * reverse);
            argumentNumber = argumentNumber / 10;
        }
        if (removeNegative == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
