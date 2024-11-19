public class Detector {

    public static void main(String[] args) {
       

        
        // Caso 1: Mutante con secuencia vertical de A's
        String[] adn = {
            "TAGTGGG",
            "TAGAGGG",
            "AAATGGA",
            "TGGAGGA",
            "TGGTAGG",            
            "ATGAGAG",
            "AAAGAGG"
        };

        if (Utils.isValidMatNxN(adn)) {
            boolean isMutant = getIsMutant(adn);
        
            // Imprime el resultado en función de si se encontró una secuencia mutante
            if (isMutant) {
                System.out.println("es mutante");
            } else {
                System.out.println("NO es mutante");
            }
        } else {
            System.out.println("Matriz no válida");
        }

        
    }


    
    private static boolean getIsMutant(String[] adn) {
        Diagonal valDiagonal = new Diagonal();
        Horizontal valHorizontal = new Horizontal();
        Vertical valVertical = new Vertical();
        char[][] matrix = Utils.convertToMatrix(adn);
        boolean isMutant = false;
      
        // Verifica si hay una secuencia mutante en alguna de las tres direcciones
        if (valDiagonal.hasDiagonalSequence(matrix) || 
        valHorizontal.hasHorizontalSequence(matrix) || 
        valVertical.hasVerticalSequence(matrix)) {
            isMutant = true;
        }
        return isMutant;
    }
    
}
