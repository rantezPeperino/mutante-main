

public class Utils {

   

    
    
    public static boolean isValidMatNxN(String[] dna) {
        if (dna == null || dna.length == 0) {
            return false;
        }

        int n = dna.length;
        
        // Verificar que la matriz sea NxN
        for (String row : dna) {
            if (row == null || row.length() != n) {
                return false;
            }
            
            // Verificar que solo contenga bases válidas
            for (char c : row.toCharArray()) {
                if (!isValidBase(c)) {
                    return false;
                }
            }
        }
        
        return true;
    }

    public static boolean isValidBase(char c) {
        for (char validBase : Constant.VALID_BASES) {
            if (c == validBase) {
                return true;
            }
        }
        return false;
    }

        // Método auxiliar para convertir array de Strings a matriz
     public   static  char[][] convertToMatrix(String[] dna) {
            char[][] matrix = new char[dna.length][dna[0].length()];
            for (int i = 0; i < dna.length; i++) {
                matrix[i] = dna[i].toCharArray();
            }
            return matrix;
        }


        
}
