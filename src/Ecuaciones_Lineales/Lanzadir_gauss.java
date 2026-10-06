package Ecuaciones_Lineales;
//Se crea main para la ejecucion del programa
public class Lanzadir_gauss {
    static void main(String[] args) {//Se obtiene la matriz definida
        double [][] matriz = Defmatrizz.defmatriz();
        Gauss.eliminacionGaussiana(matriz);//Se aplica el metodo de eliminacion gaussiana

        double[] soluciones = Gauss.sustitucionRegresiva(matriz);//se obtiene la solucion mediante la sustitucion
        System.out.println("Soluciones del sistema:");//Se muestra el resultado
        for (int i = 0; i < soluciones.length; i++) {
            System.out.println("x" + (i + 1) + "="  + soluciones[i]);
        }
    }
}
