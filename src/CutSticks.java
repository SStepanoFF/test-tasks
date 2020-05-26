import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CutSticks {

    public static void main(String[] args) {
        int[] n = {5, 4, 4, 2, 2, 8};
        System.out.println(Arrays.toString(cutTheSticks(n)));
    }

    static int[] cutTheSticks(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> resList = new ArrayList<>();
        resList.add(list.size());
        while (!list.isEmpty()) {
            int min = list.stream().min(Comparator.naturalOrder()).get();
            list = list.stream().map(i -> i - min).filter(i -> i > 0).collect(Collectors.toList());
            if(list.size()>0) {
                resList.add(list.size());
            }
        }

        return resList.stream().mapToInt(i -> i).toArray();
    }
}
