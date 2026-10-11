package Ecuaciones_Lineales;

public class GuassJordan {

    public static void gaussJordan(double[][] matriz) {
        int n = matriz.length;

        //Reutilizar la triangulación superior de Gauss
        Gauss.eliminacionGaussiana(matriz);

        //Barrido superior (de abajo hacia arriba)
        for (int i = n - 1; i >= 0; i--) {
            // Obtener el pivote actual
            double pivote = matriz[i][i];

            // Normalizar el renglón dividiendo entre el pivote para que sea 1
            for (int k = i; k <= n; k++) {
                matriz[i][k] /= pivote;
            }

            // Anular los coeficientes superiores de la columna
            for (int j = i - 1; j >= 0; j--) {
                double factor = matriz[j][i];
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }
}
