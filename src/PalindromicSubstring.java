import java.util.HashMap;
import java.util.Map;

public class PalindromicSubstring {

    public static void main(String[] args) {
        String s = "ccc";
        System.out.println(longestPalindrome(s));
    }

    private static String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        String res = "";
        if (s.length()<=1) res = s;
        for (int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                boolean isPolindrom = true;
                String tempRes = "";
                for(int j = map.get(arr[i])+1; j<i/2; j++) {
                    if(arr[j]!= arr[i-j]) {
                        isPolindrom = false;
                        break;
                    }
                }
                tempRes = s.substring(map.get(arr[i]),i+1);
                if(isPolindrom && tempRes.length()>res.length()){
                    res =tempRes;
                }
            }
            map.put(arr[i], i);
        }
        return res.isEmpty() ? String.valueOf(arr[0]) : res;
    }
}
