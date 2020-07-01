public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindromic("abactabaabatcaba"));
    }

    private static boolean isPalindromic(String s) {
        boolean result = true;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                result = false;
            }
        }
        return result;
    }
}
