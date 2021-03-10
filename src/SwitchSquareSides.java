import java.util.Arrays;

public class SwitchSquareSides {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        Arrays.stream(arr).forEach(a -> System.out.println(Arrays.toString(a)));
        System.out.println();
        Arrays.stream(switchColumnsAndRows(arr)).forEach(a -> System.out.println(Arrays.toString(a)));
    }

    public static int[][] switchColumnsAndRows(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }
        return arr;
    }
}
