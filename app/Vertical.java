

public class Vertical {


    // Método principal para verificar secuencias verticales
    private boolean checkVertical(char[][] matrix, int row, int col) {
        if (row + Constant.SEQUENCE_LENGTH > matrix.length) return false;
        
        char base = matrix[row][col];
        if (base == ' ') return false;
        
        int count = 1;
        for (int i = 1; i < Constant.SEQUENCE_LENGTH; i++) {
            if (matrix[row + i][col] == base) {
                count++;
            } else {
                break;
            }
        }
        return count == Constant.SEQUENCE_LENGTH;
    }



    // Método para verificar toda la matriz
    public boolean hasVerticalSequence(char[][] matrix) {
         
        // Verificar cada posición posible
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row <= matrix.length - Constant.SEQUENCE_LENGTH; row++) {
                if (checkVertical(matrix, row, col)) {
                    return true;
                }
            }
        }
        return false;
    }

   
}