package org.Alex;

import java.util.Scanner;

public class Arreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números tendrá el arreglo?: ");
        int n = sc.nextInt();
        double[] vector = new double[n];
        double suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el valor " + (i + 1) + ": ");
            vector[i] = sc.nextDouble();
            suma += vector[i];
        }

        // Imprimir al revés
        System.out.print("\nVector impreso al revés: [ ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("]");

        // Calcular promedio
        double promedio = (n > 0) ? (suma / n) : 0;

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);

        // Aprobado o Reprobado (Base: 6.0)
        if (promedio >= 6.0) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }

        sc.close();
    }
}
