package com.corozco.libro.fundamentos.capitulo4;

/**
 * Propósito: Presentar los ejercicios planteados en el Capítulo 4 del libro de Fundamentos en programación
 * relacionados con el uso de tipos de dato de punto flotante.
 */
public class SoluciónPuntoFlotante {
    public static void main(String[] args) {

        //Ejercicio 1: Convertir números de punto flotante
        System.out.println("-------------------Ejercicio 1-------------------");

        System.out.println("Valores con representación exacta:");
        System.out.println(1.0f + ":  " + toIEEE754(1.0f, "%32s"));
        System.out.println(2.0f + ":  " + toIEEE754(2.0f, "%32s"));
        System.out.println(0.5f + ":  " + toIEEE754(0.5f, "%32s"));
        System.out.println(0.25f + ": " + toIEEE754(0.25f, "%32s"));
        System.out.println(4.0f + ":  " + toIEEE754(4.0f, "%32s"));

        System.out.println("\nValores sin representación exacta:");
        System.out.println(0.1f + ":  " + toIEEE754(0.1f, "%32s"));
        System.out.println(0.2f + ":  " + toIEEE754(0.2f, "%32s"));
        System.out.println(0.3f + ":  " + toIEEE754(0.3f, "%32s"));
        System.out.println(0.15f + ": " + toIEEE754(0.15f, "%32s"));
        System.out.println(0.05f + ": " + toIEEE754(0.05f, "%32s"));

        //Ejercicio 2: Convertir los números en norma IEEE 754 a decimal
        System.out.println("-------------------Ejercicio 2-------------------");

        System.out.println("\nConversión de IEEE 754 a decimal:");
        System.out.println("Valores con representación exacta:");
        System.out.println("00111111100000000000000000000000: " + fromIEEE754("00111111100000000000000000000000"));
        System.out.println("01000000000000000000000000000000: " + fromIEEE754("01000000000000000000000000000000"));
        System.out.println("00111111000000000000000000000000: " + fromIEEE754("00111111000000000000000000000000"));
        System.out.println("00111110100000000000000000000000: " + fromIEEE754("00111110100000000000000000000000"));
        System.out.println("01000000100000000000000000000000: " + fromIEEE754("01000000100000000000000000000000"));

        System.out.println("\nValores sin representación exacta:");
        System.out.println("00111101110011001100110011001101: " + fromIEEE754("00111101110011001100110011001101"));
        System.out.println("00111110010011001100110011001101: " + fromIEEE754("00111110010011001100110011001101"));
        System.out.println("00111110100110011001100110011010: " + fromIEEE754("00111110100110011001100110011010"));
        System.out.println("00111110000110011001100110011010: " + fromIEEE754("00111110000110011001100110011010"));
        System.out.println("00111101010011001100110011001101: " + fromIEEE754("00111101010011001100110011001101"));
    }

    public static String toIEEE754(float value, String size) {
        int intBits = Float.floatToIntBits(value);
        String binaryString = String.format(size, Integer.toBinaryString(intBits)).replace(' ', '0');
        String sign = binaryString.substring(0, 1);
        String exponent = binaryString.substring(1, 9);
        String fraction = binaryString.substring(9);
        return sign + " " + exponent + " " + fraction;
    }

    public static double fromIEEE754(String binaryString) {
        int intBits = Integer.parseInt(binaryString, 2);
        return Float.intBitsToFloat(intBits);
    }
}
