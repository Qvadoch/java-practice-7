package matrix;

public class MatrixMultiplication {
    public static int[][] multiply(int[][] firstMatrix, int[][] secondMatrix, int rows1, int cols1, int cols2) {
        int[][] productMatrix = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                productMatrix[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    productMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return productMatrix;
    }
}