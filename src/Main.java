// Nombre: Pablo Torres Doria
// Matricula: 3003910
//Actividad: 7
//Materia: Computación en Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int cantidad = 0;
        double numero = 0;
        double cuadrado = 0;
        double cubo = 0;

        //Declaramos un objeto de tipo Scanner para leer entradas del teclado.
        Scanner lectura = new Scanner(System.in);

        //Imprimimos un encabezado para el proyecto.
        System.out.println("""
                -------------------------------------------------------------
                |           CUADRADO Y CUBO DE UNA SERIE DE NÚMEROS         |
                -------------------------------------------------------------
                | Este programa captura una determinada cantidad de números |
                | dada por el usuario, devolviendo su cuadrado y cubo.      |
                -------------------------------------------------------------""");

        //Solicitamos el tamaño del arreglo.
        System.out.print("-Indique la cantidad de números que ingresará: ");
        cantidad = lectura.nextInt();
        System.out.println("-------------------------------------------------------------");

        //Crear un arreglo para almacenar los números
        double[] numeros = new double[cantidad];

        //Llenamos el arreglo con los números ingresados por el usuario
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = lectura.nextDouble();
        }

        //Imprimimos el encabezado de la tabla.
        System.out.println("""

                -------------------------------------------------------------
                |     Número    |      Cuadrado     |          Cubo         |
                -------------------------------------------------------------""");

        //Recorremos cada espacio del arreglo para determinar su cuadrado y cubo.
        for (int i = 0; i < cantidad; i++) {
            numero = numeros[i];
            cuadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf("| %-14.1f| %-18.1f| %-22.1f|%n", numero, cuadrado, cubo);
        }
        System.out.println("-------------------------------------------------------------");
        lectura.close();
    }
}