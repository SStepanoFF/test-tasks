import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountMaxValues {

    public static void main(String[] args) {
        List<Integer> candles = Arrays.asList(3, 2, 3, 1);
        System.out.println(maxCount(candles));
    }

    private static int maxCount(List<Integer> candles) {
        int max = candles.get(0);
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : candles) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
            if (i > max) max = i;
        }
        return map.get(max);
    }

}
