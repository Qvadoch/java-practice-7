package matrix;

public class MatrixAnalyzer {
    public static String findAndDescribeMaxElement(int[][] matrix, int rows, int cols) {
        int maxElement = matrix[0][0];
        int indexRow = 0;
        int indexColumn = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (maxElement < matrix[i][j]) {
                    maxElement = matrix[i][j];
                    indexRow = i;
                    indexColumn = j;
                }
            }
        }
        return "Максимальное число массива: " + maxElement + "\nИндекс строки: " + indexRow + "\nИндекс столбца: " + indexColumn;
    }

    public static int[] findRowWithMaxSum(int[][] matrix) {
        int maxSum = 0;
        int maxRowIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int currentRowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                currentRowSum += matrix[i][j];
            }

            if (currentRowSum > maxSum) {
                maxSum = currentRowSum;
                maxRowIndex = i;
            }
        }

        return new int[]{maxRowIndex, maxSum};
    }
}