import java.util.Arrays;

public class LeftRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotLeft(arr, 4)));
    }

    static int[] rotLeft(int[] arr, int d) {
        if (d > arr.length) {
            d = d % arr.length;
        }
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (d != arr.length || d == 0) {
                int index = i - d >= 0 ? i - d : arr.length - d + i;
                newArr[index] = arr[i];
            }

        }
        return newArr;
    }
}
