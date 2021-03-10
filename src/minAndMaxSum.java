public class minAndMaxSum {

    public static void main(String[] args) {
        int[] arr = {769082435, 210437958, 673982045, 375809214, 380564127};
        printMinMaXSum(arr);
    }

    private static void printMinMaXSum(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
            sum += arr[i];
        }
        System.out.println("Min sum = " + (sum - max));
        System.out.println("Max sum = " + (sum - min));
    }
}
