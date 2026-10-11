Estructura Modular del Proyecto
El proyecto está diseñado bajo el principio de programación modular y la reutilización de software, dividiendo la responsabilidad de cada proceso en clases independientes dentro del paquete Ecuaciones_Lineales:
Defmatriz.java: Módulo encargado de almacenar y retornar la matriz aumentada del sistema de ecuaciones a resolver.
Gauss.java: Contiene la lógica del método de Eliminación Gaussiana (eliminacionGaussiana) para transformar la matriz en su forma triangular superior.
GuassJordan.java: Módulo principal que invoca la triangulación superior de Gauss.java, aplica la normalización de la diagonal principal para convertir los pivotes en 1, y realiza el barrido superior eliminando los coeficientes por encima de la diagonal.
Lanzador_GaussJordan.java: Clase principal (main) para la ejecución del programa, encargada de invocar el algoritmo y desplegar las soluciones por consola.

Pasos para Compilar y Ejecutar el Programa
Instrucciones desde la Consola
Ubicarse en la carpeta raíz del proyecto (donde se encuentra la carpeta src):
cd C:\Ruta\De\Tu\Proyecto\Gauss
Compila todas las clases del paquete:
javac -d . src/Ecuaciones_Lineales/*.java
Ejecutar la clase principal:
java Ecuaciones_Lineales.Lanzador_GaussJordan


Ejemplo de Prueba y Salida por Consola
Sistema de Ecuaciones Evaluado
3.0 x1 - 0.1 x2 - 0.2 x3 = 7.85
 0.1 x1 + 7.0 x2 - 0.3 x3 = -19.3 
0.3 x1 - 0.2 x2 + 10.0 x3 = 71.4
Salida por Consola (Texto Plano)
Soluciones del sistema (por Gauss-Jordan):
x1 = 3.0
x2 = -2.5
x3 = 7.0

Conclusiones de la Implementación
A través del paso de referencias en memoria RAM (double[][] matriz), se logró transformar directamente la matriz aumentada inicial en una matriz identidad. Esto permite la lectura inmediata de las incógnitas despejadas en la columna de resultados, eliminando la necesidad de aplicar sustitución regresiva.
