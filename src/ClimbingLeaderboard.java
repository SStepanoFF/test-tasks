import java.util.*;

public class ClimbingLeaderboard {

    public static void main(String[] args) {
        int[] scor = {100, 50, 50, 30, 10};
        int[] al = {100, 0, 13, 10};
        System.out.println(climbingLeaderboard(scor, al));
    }

    private static List<Integer> climbingLeaderboard(int[] scores, int[] alice) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        Arrays.stream(scores).forEach(set::add);

        Arrays.stream(alice).forEach(al -> {
            Set<Integer> tempSet = new TreeSet<>(Comparator.reverseOrder());
            tempSet.addAll(set);
            tempSet.add(al);
            List<Integer> list = new ArrayList<>(tempSet);
            res.add(list.indexOf(al) + 1);
        });
        return res;
    }

    private static int[] climbingLeaderboardArr(int[] scores, int[] alice) {
//        int[] newScore = new int[scores.length];
//        for(int i =0; i<scores.length;i++){
//            if(scores[i]==scores[i+1]){
//
//            }
//        }
        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        Arrays.stream(scores).forEach(set::add);
        int[] res = new int[alice.length];
        int i = 0;
        for (int al : alice) {
            Set<Integer> tempSet = new TreeSet<>(Comparator.reverseOrder());
            tempSet.addAll(set);
            tempSet.add(al);
            List<Integer> list = new ArrayList<>(tempSet);
            res[i] = list.indexOf(al) + 1;
            i++;
        }
        return res;
    }
}
