
public class Diagonal {

    public Diagonal() {
    }

     // Método para verificar diagonal principal
    private boolean checkDiagonal(char[][] matrix, int row, int col) {
        if (row + Constant.SEQUENCE_LENGTH > matrix.length || col + Constant.SEQUENCE_LENGTH > matrix.length) return false;
        
        char base = matrix[row][col];
        if (base == ' ') return false;
        
        int count = 1;
        for (int i = 1; i < Constant.SEQUENCE_LENGTH; i++) {
            if (matrix[row + i][col + i] == base) {
                count++;
            } else {
                break;
            }
        }
        return count == Constant.SEQUENCE_LENGTH;
    }

    // Método para verificar diagonal inversa
    private boolean checkInverseDiagonal(char[][] matrix, int row, int col) {
        if (row + Constant.SEQUENCE_LENGTH > matrix.length || col < Constant.SEQUENCE_LENGTH - 1) return false;
        
        char base = matrix[row][col];
        if (base == ' ') return false;
        
        int count = 1;
        for (int i = 1; i < Constant.SEQUENCE_LENGTH; i++) {
            if (matrix[row + i][col - i] == base) {
                count++;
            } else {
                break;
            }
        }
        return count == Constant.SEQUENCE_LENGTH;
    }



    // Método para verificar diagonales en toda la matriz
    public boolean hasDiagonalSequence(char[][] matrix) {
               
        // Verificar diagonales principales
        for (int i = 0; i <= matrix.length - Constant.SEQUENCE_LENGTH; i++) {
            for (int j = 0; j <= matrix.length - Constant.SEQUENCE_LENGTH; j++) {
                if (checkDiagonal(matrix, i, j)) {
                    return true;
                }
            }
        }

        // Verificar diagonales inversas
        for (int i = 0; i <= matrix.length - Constant.SEQUENCE_LENGTH; i++) {
            for (int j = matrix.length - 1; j >= Constant.SEQUENCE_LENGTH - 1; j--) {
                if (checkInverseDiagonal(matrix, i, j)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
}
