package Ecuaciones_Lineales;

public class Lanzador_GaussJordan {
    public static void main(String[] args) {
        // Obtener la matriz aumentada definida
        double[][] matriz = Defmatrizz.defmatriz();

        // Aplicar el metodo de Gauss-Jordan (la cual llama a Gauss y luego reduce)
        GuassJordan.gaussJordan(matriz);

        System.out.println("Soluciones del sistema (por Gauss-Jordan):");
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            System.out.println("x" + (i + 1) + " = " + matriz[i][n]);
        }
    }
}
