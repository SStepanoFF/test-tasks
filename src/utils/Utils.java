package utils;

import java.util.Arrays;

public class Utils {

    public static void printArr(int[][] arr) {
        Arrays.stream(arr).forEach(a -> System.out.println(Arrays.toString(a)));
    }
}
