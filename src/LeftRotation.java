import java.util.Arrays;

public class LeftRotation {

    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotLeft(arr,4)));
    }

    static int[] rotLeft(int[] a, int d) {
        if(d>a.length) {
            d=d%a.length;
        }
        int[] newArr = new int[a.length];
        for(int i=0; i<a.length; i++) {
            if(d!=a.length || d==0) {
                int index = i-d>=0 ? i-d : a.length-d +i;
                newArr[index]=a[i];
            }

        }
        return newArr;
    }
}
