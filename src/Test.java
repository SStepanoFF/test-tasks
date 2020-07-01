import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {
        System.out.println(sumPalindromic(10000));
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
}
