public class analisisADN {
    private final char[][] matriz_and;

    public analisisADN(char[][]matriz){
        this.matriz_and = matriz;
    }

    public boolean is_mutant(){
        int cantSecuenciasDiagonales = 0;   //utiliza un contador en caso de que hay 2 o mas secuancias diagonales
        //solamente recorre las 3 primeras filas y columnas porque en las demas pociones no se cumplime la condicion de que sean 4 letras
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz_and[i][j] == matriz_and[i+1][j+1] && matriz_and[i][j] == matriz_and[i+2][j+2] && matriz_and[i][j] == matriz_and[i+3][j+3]){
                    cantSecuenciasDiagonales +=1;
                }
            }
        }

        int cantSecuenciasDiagonalesInversas = 0;
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz_and[i][j] == matriz_and[i-1][j+1] && matriz_and[i][j] == matriz_and[i-2][j+2] && matriz_and[i][j] == matriz_and[i-3][j+3]){
                    cantSecuenciasDiagonalesInversas +=1;
                }
            }
        }

        int cantSecuenciasVerticales = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if(matriz_and[i][j] == matriz_and[i+1][j] && matriz_and[i][j] == matriz_and[i+2][j] && matriz_and[i][j] == matriz_and[i+3][j]){
                    cantSecuenciasVerticales +=1;
                }
            }
        }
        
        int cantSecuenciasHorizontales = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz_and[i][j] == matriz_and[i][j+1] && matriz_and[i][j] == matriz_and[i][j+2] && matriz_and[i][j] == matriz_and[i][j+3]){
                    cantSecuenciasHorizontales +=1;
                }
            }
        }

        return (cantSecuenciasHorizontales + cantSecuenciasVerticales + cantSecuenciasDiagonales + cantSecuenciasDiagonalesInversas) > 1;
    }

}
