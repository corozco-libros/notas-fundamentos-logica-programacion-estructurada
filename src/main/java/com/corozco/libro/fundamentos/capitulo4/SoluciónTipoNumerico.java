package com.corozco.libro.fundamentos.capitulo4;

/**
 * Propósito: Presentar los ejercicios planteados en el Capítulo 4 del libro de Fundamentos en programación
 * relacionados con el uso de tipos de dato numérico.
 */
public class SoluciónTipoNumerico {
    public static void main(String[] args) {

        // Ejercicio 1: Imprimir valor mínimo y máximo de tipos numéricos.
        System.out.println("-------------------Ejercicio 1-------------------");

        System.out.println("Short:");
        System.out.println("Min: " + Short.MIN_VALUE);
        System.out.println("Max: " + Short.MAX_VALUE);

        System.out.println("\nInt:");
        System.out.println("Min: " + Integer.MIN_VALUE);
        System.out.println("Max: " + Integer.MAX_VALUE);

        System.out.println("\nLong:");
        System.out.println("Min: " + Long.MIN_VALUE);
        System.out.println("Max: " + Long.MAX_VALUE);

        System.out.println("\nFloat:");
        System.out.println("Min: " + Float.MIN_VALUE);
        System.out.println("Max: " + Float.MAX_VALUE);

        System.out.println("\nDouble:");
        System.out.println("Min: " + Double.MIN_VALUE);
        System.out.println("Max: " + Double.MAX_VALUE);

        // Ejercicio 2: Modificar valor mínimo y máximo de tipos numéricos.
        System.out.println("-------------------Ejercicio 2-------------------");

        int arbitraryValue = 50;

        System.out.println("Operaciones con valores arbitrarios:\n");

        // Short
        System.out.println("Short:");
        short shortMaxSum = (short) (Short.MAX_VALUE + arbitraryValue);
        short shortMinSub = (short) (Short.MIN_VALUE - arbitraryValue);
        System.out.println("Valor máximo original: " + Short.MAX_VALUE);
        System.out.println("Suma al máximo: " + shortMaxSum);
        System.out.println("Valor mínimo original: " + Short.MIN_VALUE);
        System.out.println("Resta al mínimo: " + shortMinSub);
        System.out.println();

        // Int
        System.out.println("Int:");
        int intMaxSum = Integer.MAX_VALUE + arbitraryValue;
        int intMinSub = Integer.MIN_VALUE - arbitraryValue;
        System.out.println("Valor máximo original: " + Integer.MAX_VALUE);
        System.out.println("Suma al máximo: " + intMaxSum);
        System.out.println("Valor mínimo original: " + Integer.MIN_VALUE);
        System.out.println("Resta al mínimo: " + intMinSub);
        System.out.println();

        // Long
        System.out.println("Long:");
        long longMaxSum = Long.MAX_VALUE + arbitraryValue;
        long longMinSub = Long.MIN_VALUE - arbitraryValue;
        System.out.println("Valor máximo original: " + Long.MAX_VALUE);
        System.out.println("Suma al máximo: " + longMaxSum);
        System.out.println("Valor mínimo original: " + Long.MIN_VALUE);
        System.out.println("Resta al mínimo: " + longMinSub);
        System.out.println();

        // Float
        System.out.println("Float:");
        float floatMaxSum = Float.MAX_VALUE + arbitraryValue;
        float floatMinSub = Float.MIN_VALUE - arbitraryValue;
        System.out.println("Valor máximo original: " + Float.MAX_VALUE);
        System.out.println("Suma al máximo: " + floatMaxSum);
        System.out.println("Valor mínimo original: " + Float.MIN_VALUE);
        System.out.println("Resta al mínimo: " + floatMinSub);
        System.out.println();

        // Double
        System.out.println("Double:");
        double doubleMaxSum = Double.MAX_VALUE + arbitraryValue;
        double doubleMinSub = Double.MIN_VALUE - arbitraryValue;
        System.out.println("Valor máximo original: " + Double.MAX_VALUE);
        System.out.println("Suma al máximo: " + doubleMaxSum);
        System.out.println("Valor mínimo original: " + Double.MIN_VALUE);
        System.out.println("Resta al mínimo: " + doubleMinSub);
        System.out.println();
    }
}
