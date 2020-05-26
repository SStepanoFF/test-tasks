package sea_task;


import java.util.Arrays;

public class MatrixChange {

    public static void main(String[] args) {
        int[][] taskMatrix = {{3, 2, 7}, {1, 2, 3}, {5, 6, 7}, {6, 5, 4}};
        int[][] matrix = Arrays.copyOfRange(taskMatrix, 1, taskMatrix.length);
        printMatrix(matrix);
        System.out.println("\nResult:");
        printMatrix(checkAndChangeMatrix(matrix, taskMatrix[0][2]));
        System.out.println("\nOrigin matrix");
        printMatrix(matrix);
    }

    private static int[][] checkAndChangeMatrix(int[][] origin, int trashHold) {
        int[][] res = new int[origin.length][origin[0].length];
        for (int i = 0; i < origin.length; i++) {
            for (int j = 0; j < origin[0].length; j++) {
                if (origin[i][j] >= trashHold) {
                    res[i] = Arrays.stream(res[i]).map(e -> e = trashHold).toArray();
                    changeCol(res, j, trashHold);
                    break;
                } else if(res[i][j]<trashHold){
                    res[i][j]=origin[i][j];
                }
            }
        }
        return res;
    }

    private static void changeCol(int[][] originM, int columnNum, int trashHold) {
        for (int i = 0; i < originM[0].length; i++) {
            originM[i][columnNum] = trashHold;
        }
    }

    private static void printMatrix(int[][] matrix) {
        Arrays.stream(matrix).forEach(arr -> {
            System.out.println(Arrays.toString(arr));
        });
    }
}
