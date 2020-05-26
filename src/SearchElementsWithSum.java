import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchElementsWithSum {

    public static void main(String[] args) {
        SearchElementsWithSum searchElementsWithSum = new SearchElementsWithSum();

        int[] arr = {2,3,5,17,8,9,0,5};
        Map<List<Integer>,List<Integer>> map = searchElementsWithSum.searchIndex(arr,12);
        System.out.println(map);
    }

    private Map<List<Integer>,List<Integer>> searchIndex(int[] arr, int x) {
        Map<List<Integer>,List<Integer>> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            for(int j =i;j<arr.length;j++){
                if((arr[i] +arr[j])==x) {
                    System.out.println("elements: "+ arr[i]+ " and "+arr[j]+ "; index: "+i+" "+ j);
                    map.put(Arrays.asList(i,j), Arrays.asList(arr[i],arr[j]));
                }
            }
        }
        return map;
    }
}
