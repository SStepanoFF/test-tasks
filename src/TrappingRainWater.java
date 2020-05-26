import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] n = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(n));
    }

    public static int trap(int[] height) {
        int res = 0;
        for (int i = 0; i < height.length; i++){
            int leftMax = 0, rightMax = 0;
            for (int k = i; k >= 0; k--){
                leftMax = Math.max(leftMax, height[k]);
            }
            for (int j = i; j < height.length; j++){
                rightMax = Math.max(rightMax, height[j]);
            }
            res += Math.min(leftMax, rightMax) - height[i];
        }
        return res;
    }

    public static int trap1(int[] height) {
        int res = 0;
        int leftH = 0;
        int deap = 0;
        int maxRightH =0;
        for (int i = 0; i < height.length; i++) {
            maxRightH=Math.max(maxRightH, height[i]);
            if (height[i] <= leftH) {
                deap += leftH - height[i];
            }
            if (height[i] >= leftH && deap >= 0) {
                res += deap;
                deap = 0;
                leftH = height[i];
            }
            if(i == height.length-1 && height[i]<leftH) {}
        }
        return res;
    }

    public static int trap2(int[] height) {
        int res = 0;
        int leftH = 0;
        int deap = 0;
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < height.length; i++) {
            Optional<Integer> minMap = map.keySet().stream().min(Integer::compareTo);
//            if(height[i]<=minMap) {
//                deap+= leftH-height[i];
//            }
            if (!minMap.isPresent() && height[i] < minMap.get()) {
                deap = minMap.orElse(0);
                index = i;
            }
            while (!map.isEmpty() && height[i] >= minMap.get()) {
                res += (deap) * (i - map.get(deap) - 1);
                map.remove(minMap.get());
                minMap = map.values().stream().min(Integer::compareTo);
                if (!minMap.isPresent() && height[i] < minMap.get()) {
                    deap = minMap.get();
                    index = i;
                }
            }
            map.put(height[i], i);
            if (height[i] >= leftH) {
                leftH = height[i];
                map.clear();
                map.put(height[i], i);
            }
        }
        return res;
    }
}
