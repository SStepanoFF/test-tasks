import java.util.stream.IntStream;

public class IntegerContainsNumber {

    public static void main(String[] args) {
        System.out.println(countNumberEntrance(2660, 10));
    }

    private static int countNumberEntrance(int n, int goalNumber) {
        String stringGoalNumber = String.valueOf(goalNumber);
        return IntStream.range(1, n + 1).mapToObj(Integer::toString)
                .map(i -> i.replaceAll(stringGoalNumber, "!")
                        .chars().filter(e -> e == '!').count())
                .mapToInt(Long::intValue).sum();
    }
}
