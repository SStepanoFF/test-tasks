import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("!!" + "apple".compareTo("banana"));
        List<Integer> list = Arrays.asList(3, 4, 5, 8, 11, 14);
        int[] arr = {1, 3, 5, 6, 12, 16};
        int[] intArray = new int[2];


        System.out.println("MAX list: " + searchMaxList(list));
        System.out.println("MAX array: " + searchMaxArray(arr));


        System.out.println("Index of element: " + list.indexOf(3));
        System.out.println("BinSearch element: " + binSearch(4, list));

        System.out.println("Stream search element index: " + getElementIndexStream(2, list));

        Collections.sort(list);
        System.out.println("BinSearch recursion element: " + binarySearchRecur(3, 0, list.size() - 1, list));
    }

    private static int getElementIndexStream(int n, List<Integer> list) {
        return list.stream().filter(i -> i == n).findFirst().map(list::indexOf).orElse(-1);
    }

    private static int searchMaxList(List<Integer> list) {
        return list.stream().mapToInt(v -> v).max().getAsInt();
    }

    private static int searchMaxArray(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    private static int binarySearchRecur(int n, int l, int r, List<Integer> list) {
        if (r < l) return -1;
        int mid = (l + r) / 2;
        if (list.get(mid) == n) {
            return mid;
        } else if (list.get(mid) < n) {
            return binarySearchRecur(n, mid + 1, r, list);
        } else {
            return binarySearchRecur(n, l, mid - 1, list);
        }
    }

    private static int binSearch(int n, List<Integer> list) {
        Collections.sort(list);
//        list.sort(Comparator.naturalOrder());
        int l = 0;
        int r = list.size();
        while (l <= r) {
            int midIndex = (l + r) / 2;
            int midValue = list.get(midIndex);
            if (midValue == n) {
                return midIndex;
            } else if (midValue > n) {
                r = midIndex - 1;
            } else {
                l = midIndex + 1;
            }
        }
        return -1;
    }
}
