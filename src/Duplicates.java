import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Duplicates {

    public static void main(String[] args) {

        Integer[] arr = {2,3,5,17,8,2,2,9,0,5,3,2,3};
        List<Integer> list = Arrays.asList(arr);

        Arrays.stream(arr).reduce(Integer::sum).get();
        Map<String, Integer> res = new HashMap<>();
        res.putIfAbsent("q",1);
        res.put("q", 1);

        System.out.println(list.stream().reduce(Integer::sum).get());

        Duplicates duplicates=new Duplicates();

        System.out.println(duplicates.repeatedNumber(list));
        System.out.println(duplicates.repeatedNumberMap(list));
        System.out.println(duplicates.repeatedNumberMax(list));
;
    }

    public List<Integer> repeatedNumber(final List<Integer> list) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Collections.sort(list);
        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i)==list.get(i+1) || res.contains(list.get(i))){
                res.add(list.get(i));
                map.put(list.get(i), Optional.ofNullable(map.get(list.get(i))).map(e->e+1).orElse(1));
            }
        }
        System.out.println(map);
        return res;
    }

    public Map<Integer, Integer> repeatedNumberMap(final List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        list.forEach(el-> map.put(el, Optional.ofNullable(map.get(el)).map(e->e+1).orElse(1)));
        return map.entrySet().stream().filter(set-> set.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public Map.Entry<Integer, Integer> repeatedNumberMax(final List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer el:list) {
            map.put(el, Optional.ofNullable(map.get(el)).map(e->e+1).orElse(1));
        }
        int t= map.values().stream().max(Comparator.naturalOrder()).get();
        return map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
    }

}
