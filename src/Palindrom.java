public class Palindrom {

    public static void main(String[] args) {
        System.out.println(isPalindrom("abactabaabatcaba"));
    }

    private static boolean isPalindrom(String s){
        boolean result = true;
        char[] chars = s.toCharArray();
        for(int i =0; i<s.length()/2; i++){
            if(chars[i]!=chars[chars.length -1-i]){
                result = false;
            }
        }
        return result;
    }
}
