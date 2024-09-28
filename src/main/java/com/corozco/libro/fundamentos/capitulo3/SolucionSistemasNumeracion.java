package com.corozco.libro.fundamentos.capitulo3;

/**
 * Propósito: Presentar los ejercicios planteados en el Capítulo 3 del libro de Fundamentos en programación
 * relacionados con el uso de sistemas de numeración.
 */
public class SolucionSistemasNumeracion {
    public static void main(String[] args) {

        // Ejercicio 1 - Convertir el número decimal 1023 al sistema binario.
        int decimalNumber1 = 1023;
        String binaryString1 = Integer.toBinaryString(decimalNumber1);
        System.out.println("Ejercicio 1 - 1023 en binario es: " + binaryString1);

        // Ejercicio 2 - Convertir el número binario 111000111000 al sistema decimal.
        String binaryNumber2 = "111000111000";
        int decimalNumber2 = Integer.parseInt(binaryNumber2, 2);
        System.out.println("Ejercicio 2 - 111000111000 en decimal es: " + decimalNumber2);

        // Ejercicio 3 - Convertir el número hexadecimal 1F4A al sistema decimal.
        String hexNumber3 = "1F4A";
        int decimalNumber3 = Integer.parseInt(hexNumber3, 16);
        System.out.println("Ejercicio 3 - 1F4A en decimal es: " + decimalNumber3);

        // Ejercicio 4 - Convertir el número octal 2375 al sistema binario.
        String octalNumber4 = "2375";
        int decimalNumber4 = Integer.parseInt(octalNumber4, 8);
        String binaryString4 = Integer.toBinaryString(decimalNumber4);
        System.out.println("Ejercicio 4 - 2375 en binario es: " + binaryString4);

        // Ejercicio 5 - Convertir el número binario 100110110101 al sistema hexadecimal.
        String binaryNumber5 = "100110110101";
        int decimalNumber5 = Integer.parseInt(binaryNumber5, 2);
        String hexString5 = Integer.toHexString(decimalNumber5);
        System.out.println("Ejercicio 5 - 100110110101 en hexadecimal es: " + hexString5.toUpperCase());

        // Ejercicio 6 - Convertir el número decimal 2047 al sistema hexadecimal.
        int decimalNumber6 = 2047;
        String hexString6 = Integer.toHexString(decimalNumber6);
        System.out.println("Ejercicio 6 - 2047 en hexadecimal es: " + hexString6.toUpperCase());

        // Ejercicio 7 - Convertir el número hexadecimal 3E8 al sistema binario.
        String hexNumber7 = "3E8";
        int decimalNumber7 = Integer.parseInt(hexNumber7, 16);
        String binaryString7 = Integer.toBinaryString(decimalNumber7);
        System.out.println("Ejercicio 7 - 3E8 en binario es: " + binaryString7);

        // Ejercicio 8 - Convertir el número binario 110101011010 al sistema octal.
        String binaryNumber8 = "110101011010";
        int decimalNumber8 = Integer.parseInt(binaryNumber8, 2);
        String octalString8 = Integer.toOctalString(decimalNumber8);
        System.out.println("Ejercicio 8 - 110101011010 en octal es: " + octalString8);

        // Ejercicio 9 - Convertir el número octal 7604 al sistema decimal.
        String octalNumber9 = "7604";
        int decimalNumber9 = Integer.parseInt(octalNumber9, 8);
        System.out.println("Ejercicio 9 - 7604 en decimal es: " + decimalNumber9);

        // Ejercicio 10 - Dado el número decimal 8191, convertirlo al sistema octal.
        int decimalNumber10 = 8191;
        String octalString10 = Integer.toOctalString(decimalNumber10);
        System.out.println("Ejercicio 10 - 8191 en octal es: " + octalString10);
    }
}
