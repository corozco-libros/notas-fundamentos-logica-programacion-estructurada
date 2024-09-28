package com.corozco.libro.fundamentos.capitulo3;

/**
 * Propósito: Presentar los ejercicios planteados en el Capítulo 3 del libro de Fundamentos en programación
 * relacionados con el uso del operador de desplazamiento de bits.
 */
public class SolucionOperadorDesplazamiento {
    public static void main(String[] args) {
        // Ejercicio 1 - Desplazar el número 1011_2 2 bits a la izquierda.
        int num1 = 0b1011;
        int shiftedNum1 = num1 << 2;
        System.out.println("Ejercicio 1 - 1011 desplazado 2 bits a la izquierda: " + Integer.toBinaryString(shiftedNum1));

        // Ejercicio 2 - Desplazar el número 110101_2 3 bits a la derecha.
        int num2 = 0b110101;
        int shiftedNum2 = num2 >> 3;
        System.out.println("Ejercicio 2 - 110101 desplazado 3 bits a la derecha: " + Integer.toBinaryString(shiftedNum2));

        // Ejercicio 3 - Desplazar el número 1001_2 1 bit a la izquierda.
        int num3 = 0b1001;
        int shiftedNum3 = num3 << 1;
        System.out.println("Ejercicio 3 - 1001 desplazado 1 bit a la izquierda: " + Integer.toBinaryString(shiftedNum3));

        // Ejercicio 4 - Desplazar el número 111000_2 4 bits a la derecha.
        int num4 = 0b111000;
        int shiftedNum4 = num4 >> 4;
        System.out.println("Ejercicio 4 - 111000 desplazado 4 bits a la derecha: " + Integer.toBinaryString(shiftedNum4));

        // Ejercicio 5 - Desplazar el número 10101_2 3 bits a la izquierda.
        int num5 = 0b10101;
        int shiftedNum5 = num5 << 3;
        System.out.println("Ejercicio 5 - 10101 desplazado 3 bits a la izquierda: " + Integer.toBinaryString(shiftedNum5));

        // Ejercicio 6 - Desplazar el número 11110000_2 2 bits a la derecha.
        int num6 = 0b11110000;
        int shiftedNum6 = num6 >> 2;
        System.out.println("Ejercicio 6 - 11110000 desplazado 2 bits a la derecha: " + Integer.toBinaryString(shiftedNum6));

        // Ejercicio 7 - Desplazar el número 1001110_2 4 bits a la izquierda.
        int num7 = 0b1001110;
        int shiftedNum7 = num7 << 4;
        System.out.println("Ejercicio 7 - 1001110 desplazado 4 bits a la izquierda: " + Integer.toBinaryString(shiftedNum7));

        // Ejercicio 8 - Desplazar el número 1000101_2 1 bit a la derecha.
        int num8 = 0b1000101;
        int shiftedNum8 = num8 >> 1;
        System.out.println("Ejercicio 8 - 1000101 desplazado 1 bit a la derecha: " + Integer.toBinaryString(shiftedNum8));

        // Ejercicio 9 - Desplazar el número 1101_2 5 bits a la izquierda.
        int num9 = 0b1101;
        int shiftedNum9 = num9 << 5;
        System.out.println("Ejercicio 9 - 1101 desplazado 5 bits a la izquierda: " + Integer.toBinaryString(shiftedNum9));

        // Ejercicio 10 - Desplazar el número 1011101_2 3 bits a la derecha.
        int num10 = 0b1011101;
        int shiftedNum10 = num10 >> 3;
        System.out.println("Ejercicio 10 - 1011101 desplazado 3 bits a la derecha: " + Integer.toBinaryString(shiftedNum10));
    }
}
