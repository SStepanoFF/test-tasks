import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoutnValley {

    public static void main(String[] args) {
        String t = "UDDDUDUU";
        char[] chars = t.toCharArray();
        int valleys=0;
        int check=0;
        for (char s : chars){
            if(s=='U') {
                check++;
                if(check==0) {
                    valleys++;
                }
            } else {
                check--;
            }
        }
        System.out.println(valleys);
    }
}
