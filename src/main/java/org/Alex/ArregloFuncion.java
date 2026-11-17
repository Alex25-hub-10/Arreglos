package org.Alex;
import java.util.Scanner;

public class ArregloFuncion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double[] vector = null;
        boolean vectorCreado = false;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    vector = crearVector(sc);
                    vectorCreado = true;
                    break;
                case 2:
                    if (vectorCreado) imprimirAlReves(vector);
                    else System.out.println("\n¡Primero debes ingresar los números (Opción 1)!");
                    break;
                case 3:
                    if (vectorCreado) calcularOperacionesVector(vector);
                    else System.out.println("\n¡Primero debes ingresar los números (Opción 1)!");
                    break;
                case 4:
                    System.out.println("¡Saliendo del programa de vectores!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            System.out.println("\n--------------------------------------------------");
        } while (opcion != 4);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("=== MENÚ VECTOR ===");
        System.out.println("1. Ingresar datos del vector");
        System.out.println("2. Mostrar vector al revés");
        System.out.println("3. Calcular suma, promedio y estado (Aprobado/Reprobado)");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }

    public static double[] crearVector(Scanner scanner) {
        System.out.print("\n¿Cuántos números tendrá el vector?: ");
        int n = scanner.nextInt();
        double[] v = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el valor " + (i + 1) + ": ");
            v[i] = scanner.nextDouble();
        }
        System.out.println("¡Vector guardado con éxito!");
        return v;
    }

    public static void imprimirAlReves(double[] v) {
        System.out.print("\nVector al revés: [ ");
        for (int i = v.length - 1; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }
        System.out.println("]");
    }

    public static void calcularOperacionesVector(double[] v) {
        double suma = 0;
        for (double num : v) {
            suma += num;
        }
        double promedio = suma / v.length;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
        if (promedio >= 6.0) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
}