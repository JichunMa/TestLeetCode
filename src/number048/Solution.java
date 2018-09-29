package number048;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}

        };
        solution.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }


    public void rotate(int[][] matrix) {
        int deep = matrix.length;
        for (int i = 0; i < deep; i++) {
            exchangeTwoNumber(matrix, i);
        }
        reversePerLine(matrix);
    }

    public void exchangeTwoNumber(int[][] matrix, int index) {
        int tmp;
        for (int i = index + 1; i < matrix.length; i++) {
            tmp = matrix[index][i];
            matrix[index][i] = matrix[i][index];
            matrix[i][index] = tmp;
        }
    }

    public void reversePerLine(int[][] matrix) {
        int tmp;
        for (int i = 0; i < matrix.length; i++) {
            int deep = matrix[i].length;
            for (int j = 0; j < deep / 2; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[i][deep - 1 - j];
                matrix[i][deep - 1 - j] = tmp;
            }
        }
    }


}
