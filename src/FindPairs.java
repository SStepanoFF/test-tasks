import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPairs {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 3, 5, 8, 11, 14);
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(arr).forEach(i -> {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        });
        int res = (int) map.values().stream().map(integer -> integer / 2).reduce(Integer::sum).get();
        System.out.println(res);
    }
}
