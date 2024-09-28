package com.corozco.libro.fundamentos.capitulo8;

import java.io.IOException;

/**
 * Propósito: Presentar los ejercicios planteados en el Capítulo 8 del libro de Fundamentos en programación
 * Recomendación: Descomentar el ejercicio de interés y ejecutar la clase Main.
 */
public class Solucion {

    public static void main(String[] args) throws IOException {
        ejerciciosArreglos();
        ejerciciosMatrices();
    }

    private static void ejerciciosArreglos() {
        // EjerciciosArreglos.llenarConNumeros();
        // EjerciciosArreglos.encontrarMaximoYMinimo(new int[] {10, 3, 5, 7, 2, 4, 6, 8, 10, 0});
        // EjerciciosArreglos.revertirArreglo(new int[]{1, 2, 3, 4, 5});
        // EjerciciosArreglos.contarElementosSobrePromedio(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        // EjerciciosArreglos.verificarNumero(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5);
        // EjerciciosArreglos.sumarArreglos(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10});
        // EjerciciosArreglos.filtrarNumerosPares(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        // EjerciciosArreglos.rotarArreglo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3);  // Asumiendo que quieres rotar el arreglo 3 posiciones.
        // EjerciciosArreglos.encontrarElementosComunes(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 6, 7, 8});
        // EjerciciosArreglos.convertirAValoresAbsolutos(new int[]{-1, -2, 3, -4, 5, -6, 7, -8, 9, -10});
    }

    private static void ejerciciosMatrices() {
        // Crear matrices de ejemplo
        int[][] matrizEjemplo = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrizEjemplo2 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        int[][] matriz1 = {{1, 2}, {3, 4}};
        int[][] matriz2 = {{2, 0}, {1, 2}};

        //EjerciciosMatrices.crearMatrizAleatoria();
        //EjerciciosMatrices.sumarElementosMatriz(matrizEjemplo);
        //EjerciciosMatrices.maximoEnCadaFila(matrizEjemplo);
        //EjerciciosMatrices.generarTranspuesta(matrizEjemplo);
        //EjerciciosMatrices.comprobarSimetria(matrizEjemplo2);
        //EjerciciosMatrices.multiplicarMatrices(matriz1, matriz2);
        //EjerciciosMatrices.contarMayoresQue(matrizEjemplo, 5);
        //EjerciciosMatrices.imprimirDiagonalPrincipal(matrizEjemplo);
        //EjerciciosMatrices.sumarFilasYTotal(matrizEjemplo);
        //EjerciciosMatrices.crearYRecorrerPorColumnas();
    }
}
