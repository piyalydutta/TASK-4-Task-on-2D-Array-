public class IdentityMatrixCheck {
    
        public static boolean isIdentityMatrix(int[][] matrix) {
            int n = matrix.length;
            
            // Check if the matrix is square
            for (int[] row : matrix) {
                if (row.length != n) {
                    return false; // Not a square matrix
                }
            }
    
            // Check identity matrix conditions
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                        return false;
                    }
                }
            }
            return true;
        }
    
        public static void main(String[] args) {
            int[][] matrix1 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
            };
    
            int[][] matrix2 = {
                {1, 0, 0},
                {0, 2, 0},
                {0, 0, 1}
            };
    
            System.out.println("Matrix 1 is identity matrix: " + isIdentityMatrix(matrix1)); // true
            System.out.println("Matrix 2 is identity matrix: " + isIdentityMatrix(matrix2)); // false
        }
    }
