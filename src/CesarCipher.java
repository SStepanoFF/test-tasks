public class CesarCipher {

    public static void main(String[] args) {
        int[] n = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(caesarCipher("www.abc.xy", 87));
    }

    static String caesarCipher(String s, int k) {
        if (k>26) {
            k=k%26;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                if (Character.isUpperCase(chars[i]) && chars[i] + k > 'Z') {
                    chars[i] = (char) (chars[i] + k - 'Z' + 'A');
                } else if (Character.isLowerCase(chars[i]) && chars[i] + k > 'z') {
                    chars[i] = (char) (chars[i] + k - 'z' + 'a');
                } else {
                    chars[i] = (char) (chars[i] + k);
                }
            }
        }
        return String.valueOf(chars);
    }

}
