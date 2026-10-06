package Ecuaciones_Lineales;

public class Gauss {
//Clase que utiliza los metodos numericos para solucionar el sistema de ecuaciones
    public static void eliminacionGaussiana(double[][] matriz){
        int n = matriz.length;

        for(int i = 0; i < n; i++){



            for(int j = i + 1; j < n; j++){

                double factor = matriz[j][i] / matriz [i][i];

                for(int k = i; k <= n; k++){
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }
     public static double[] sustitucionRegresiva(double[][] matriz){ //Se realizara la sustitucion para encontrar el vector de la solucion
        int n = matriz.length;
        double[] x = new double[n];

        for(int i = n - 1; i >= 0; i--){
            double suma = 0;

            for(int j = i + 1; j < n; j++){
                suma += matriz[i][j] * x[j];
            }
            x[i] = (matriz[i][n] - suma) / matriz[i][i];
        }
        return x;
     }
}
