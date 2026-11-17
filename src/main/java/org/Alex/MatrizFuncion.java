package org.Alex;

import java.util.Scanner;

public class MatrizFuncion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int[][] matriz = new int[2][2];
        boolean matrizCreada = false;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    llenarMatriz(sc, matriz);
                    matrizCreada = true;
                    break;
                case 2:
                    if (matrizCreada) sumarFilasYColumnas(matriz);
                    else System.out.println("\n¡Primero llena la matriz (Opción 1)!");
                    break;
                case 3:
                    if (matrizCreada) sumarDiagonales(matriz);
                    else System.out.println("\n¡Primero llena la matriz (Opción 1)!");
                    break;
                case 4:
                    if (matrizCreada) encontrarMayorYMenor(matriz);
                    else System.out.println("\n¡Primero llena la matriz (Opción 1)!");
                    break;
                case 5:
                    System.out.println("¡Saliendo del programa de matrices!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            System.out.println("\n--------------------------------------------------");
        } while (opcion != 5);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("=== MENÚ MATRIZ 2x2 ===");
        System.out.println("1. Llenar matriz");
        System.out.println("2. Sumar filas (izq a der) y columnas (arriba a abajo)");
        System.out.println("3. Sumar diagonales");
        System.out.println("4. Encontrar número mayor y menor");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
    }

    public static void llenarMatriz(Scanner scanner, int[][] m) {
        System.out.println("\nIngresa los valores para la matriz de 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                m[i][j] = scanner.nextInt();
            }
        }
        System.out.println("¡Matriz llenada correctamente!");
    }

    public static void sumarFilasYColumnas(int[][] m) {
        System.out.println("\n--- Sumas ---");
        for (int i = 0; i < 2; i++) {
            int sumaFila = m[i][0] + m[i][1];
            System.out.println("Suma fila " + (i + 1) + " (izq a der): " + sumaFila);
        }
        for (int j = 0; j < 2; j++) {
            int sumaColumna = m[0][j] + m[1][j];
            System.out.println("Suma columna " + (j + 1) + " (arriba a abajo): " + sumaColumna);
        }
    }

    public static void sumarDiagonales(int[][] m) {
        int principal = m[0][0] + m[1][1];
        int secundaria = m[0][1] + m[1][0];
        System.out.println("\n--- Diagonales ---");
        System.out.println("Diagonal Principal: " + principal);
        System.out.println("Diagonal Secundaria: " + secundaria);
    }

    public static void encontrarMayorYMenor(int[][] m) {
        int mayor = m[0][0];
        int menor = m[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (m[i][j] > mayor) mayor = m[i][j];
                if (m[i][j] < menor) menor = m[i][j];
            }
        }
        System.out.println("\n--- Mayor y Menor ---");
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}