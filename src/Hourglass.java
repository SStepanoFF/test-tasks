import java.util.ArrayList;
import java.util.List;

public class Hourglass {

    public static void main(String[] args) {
        int[][] arr = {
            {-1, -1, 0 ,-9, -2, -2},
            {-2, -1, -6, -8, -2, -5},
            {-1, -1, -1, -2, -3, -4},
            {-1, -9, -2, -4, -4, -5},
            {-7, -3, -3, -2, -9, -9},
            {-1, -3, -1, -2, -4, -5}
        };
        System.out.println(hourglassSum(arr));
    }

    static int hourglassSum(int[][] arr) {
        List<Integer> res= new ArrayList<>();
        for (int i = 0; i<arr.length-2; i++){
            for(int j =0; j<arr[0].length-2;j++){
                int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+
                    arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                res.add(sum);
            }
        }
        return res.stream().mapToInt(i->i).max().getAsInt();
    }
}
