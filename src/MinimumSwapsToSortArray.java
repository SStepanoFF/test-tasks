public class MinimumSwapsToSortArray {

    public static void main(String[] args) {
        int[] n = {1, 3, 5, 2, 4, 6, 7};
        System.out.println(minimumSwaps(n));
    }

    static int minimumSwaps(int[] arr) {
       int count =0;
       for(int i =0; i<arr.length; i++) {
            if(i!=arr[i]-1) {
                int t = arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=t;
                i=0;
                count++;
            }
       }
       return count;
    }

}
