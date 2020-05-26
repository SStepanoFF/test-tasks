public class Stairs {

    public static void main(String[] args) {
//        staircase(6);
        recurs(6, 5);

        int[] a=new int[1];
    }

    static void staircase(int n) {
        int space = n - 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= space) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            space--;
            System.out.println();
        }
    }

    static void recurs(int n, int space) {
        if (space < 0) return;
        for (int j = 0; j <n; j++) {
            if (j < space) {
                System.out.print(" ");
            } else {
                System.out.print("#");
            }
        }
        space--;
        System.out.println();
        recurs(n, space);
    }

}
