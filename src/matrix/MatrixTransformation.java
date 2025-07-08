package matrix;

public class MatrixTransformation {
    public static int[][] matrixTransposition(int[][] matrix, int rows, int cols) {
        int[][] newMatrix = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                newMatrix[i][j] = matrix[j][i];
            }
        }
        return newMatrix;
    }

    public static int[][] rotate90Degrees(int[][] matrix, int rows, int cols) {
        int[][] rotated = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                rotated[i][j] = matrix[rows - j - 1][i];
            }
        }
        return rotated;
    }
}