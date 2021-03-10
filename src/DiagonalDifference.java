import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        int[][] arr = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
        List<List<Integer>> list = new ArrayList<>();
//        Arrays.asList(arr).forEach(a-> list.add(Arrays.asList(a)));
        Arrays.stream(arr).forEach(a -> System.out.println(Arrays.toString(a)));
        System.out.println(getDiagonalDifference(arr));
    }

    private static int getDiagonalDifference(int[][] arr) {
        int sum = 0;
        int index1 = 0;
        int index2 = arr[0].length - 1;
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[index1][index1];
            int i2 = arr[index1++][index2--];
            sum += i1 - i2;
        }
        return Math.abs(sum);
    }

    private static int getDiagonalDifferenceList(List<List<Integer>> arr) {
        int sum = 0;
        int index1 = 0;
        int index2 = arr.get(0).size() - 1;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(index1).get(index1) - arr.get(index1++).get(index2--);
        }
        return Math.abs(sum);
    }
}
