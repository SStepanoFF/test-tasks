import java.util.stream.IntStream;

public class PalindromicSum {

    public static void main(String[] args) {
        System.out.println(sumPalindromic(10000));
        System.out.println("Text is palindromic: " + reverseCheckPalindromic("radarq"));
    }

    public static int sumPalindromic(int range) {
        return IntStream.range(0, range).filter(i -> isPalindromic(i)).sum();
    }

    private static boolean isPalindromic(int number) {
        boolean result = true;
        char[] chars = String.valueOf(number).toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                result = false;
            }
        }
        return result;
    }

    private static boolean reverseCheckPalindromic(String text) {
        String reverseText = new StringBuilder(text).reverse().toString();
        return text.equals(reverseText);
    }
}
