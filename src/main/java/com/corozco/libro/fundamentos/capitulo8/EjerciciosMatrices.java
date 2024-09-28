package com.corozco.libro.fundamentos.capitulo8;

public final class EjerciciosMatrices {

    // Ejercicio 1: Crear una matriz de 5x5 y llenarla con números aleatorios.
    public static void crearMatrizAleatoria() {
        int[][] matriz = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100); // Números aleatorios entre 0 y 99
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Ejercicio 2: Sumar todos los elementos de una matriz.
    public static void sumarElementosMatriz(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                suma += elemento;
            }
        }
        System.out.println("Suma total de los elementos de la matriz: " + suma);
    }

    // Ejercicio 3: Encontrar el valor máximo en cada fila de una matriz.
    public static void maximoEnCadaFila(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int max = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
            System.out.println("El máximo en la fila " + (i + 1) + " es: " + max);
        }
    }

    // Ejercicio 4: Generar la matriz transpuesta de una matriz dada.
    public static void generarTranspuesta(int[][] matriz) {
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz Transpuesta:");
        for (int[] fila : transpuesta) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    // Ejercicio 5: Comprobar si una matriz es simétrica.
    public static void comprobarSimetria(int[][] matriz) {
        boolean esSimetrica = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                    break;
                }
            }
            if (!esSimetrica) {
                break;
            }
        }
        System.out.println("La matriz es " + (esSimetrica ? "simétrica." : "no simétrica."));
    }

    // Ejercicio 6: Multiplicar dos matrices dadas.
    public static void multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        if (matriz1[0].length != matriz2.length) {
            System.out.println("Las matrices no se pueden multiplicar.");
            return;
        }
        int[][] resultado = new int[matriz1.length][matriz2[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        System.out.println("Resultado de la multiplicación de matrices:");
        for (int[] fila : resultado) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    // Ejercicio 7: Contar cuántos elementos de una matriz son mayores que un valor dado.
    public static void contarMayoresQue(int[][] matriz, int valor) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento > valor) {
                    contador++;
                }
            }
        }
        System.out.println("Elementos mayores que " + valor + ": " + contador);
    }

    // Ejercicio 8: Imprimir los elementos de la diagonal principal de una matriz.
    public static void imprimirDiagonalPrincipal(int[][] matriz) {
        System.out.println("Elementos en la diagonal principal:");
        for (int i = 0; i < matriz.length && i < matriz[i].length; i++) {
            System.out.println(matriz[i][i]);
        }
    }

    // Ejercicio 9: Sumar las filas de una matriz y luego sumar esos resultados.
    public static void sumarFilasYTotal(int[][] matriz) {
        int total = 0;
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int elemento : matriz[i]) {
                sumaFila += elemento;
            }
            total += sumaFila;
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
        }
        System.out.println("Suma total de todas las filas: " + total);
    }

    public static void crearYRecorrerPorColumnas() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Recorrido de la matriz por columnas:");
        for (int j = 0; j < matriz[0].length; j++) { // Itera sobre cada columna
            for (int i = 0; i < matriz.length; i++) { // Itera sobre cada fila dentro de la columna
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea para separar columnas visualmente
        }
    }

}
