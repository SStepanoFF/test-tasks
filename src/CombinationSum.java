import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CombinationSum {

    public static void main(String[] args) {
        int[] n = {2, 3, 6, 7};
        System.out.println(combinationSum(n, 7));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cand = Arrays.stream(candidates).boxed().collect(Collectors.toList());
        cand.forEach(e -> {
            if (target % e == 0) {
                res.add(Collections.nCopies(target / e, e));
            } else if (cand.contains(target % e)) {
                List<Integer> internList = new ArrayList<>(Collections.nCopies(target / e, e));
                internList.add(target % e);
                res.add(internList);
            } else {
//                target-e
            }
        });
        return res;
    }
}
