package com.corozco.libro.fundamentos.capitulo5;

public final class Ejercicios {

    // Ejercicio 1: Convertir metros a kilómetros
    public static double metrosAKilometros(double metros) {
        return metros / 1000;
    }

    // Ejercicio 2: Calcular el área de un círculo
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // Ejercicio 3: Calcular el volumen de un cilindro
    public static double volumenCilindro(double radio, double altura) {
        return areaCirculo(radio) * altura;
    }

    // Ejercicio 4: Devolver el cuadrado de un número
    public static int cuadrado(int numero) {
        return numero * numero;
    }

    // Ejercicio 5: Determinar el valor absoluto de un número
    public static int valorAbsoluto(int numero) {
        return Math.abs(numero);
    }

    // Ejercicio 6: Calcular la hipotenusa de un triángulo rectángulo
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    // Ejercicio 7: Convertir horas a minutos
    public static int horasAMinutos(int horas) {
        return horas * 60;
    }

    // Ejercicio 8: Convertir Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Ejercicio 9: Calcular el inverso multiplicativo
    public static double inversoMultiplicativo(double numero) {
        return 1 / numero;
    }

    // Ejercicio 10: Concatenar dos cadenas
    public static String concatenarCadenas(String cadena1, String cadena2) {
        return cadena1 + cadena2;
    }

    // Ejercicio 11: Encontrar el menor de tres números
    public static int menorDeTres(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    // Ejercicio 12: Calcular el promedio de tres números
    public static double promedioTresNumeros(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    // Ejercicio 13: Determinar la longitud de una cadena
    public static int longitudCadena(String cadena) {
        return cadena.length();
    }

    // Ejercicio 14: Verificar si un número es positivo
    public static boolean esPositivo(int numero) {
        return numero > 0;
    }

    // Ejercicio 15: Sumar dos números
    public static int sumaDosNumeros(int num1, int num2) {
        return num1 + num2;
    }

    // Ejercicio 16: Mostrar operaciones básicas
    public static void mostrarOperaciones(int a, int b) {
        System.out.println("----------------- Operaciones básicas ----------------- ");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + ((b != 0) ? (a / (double) b) : "División por cero"));
        System.out.println("----------------- -------------------------------------- ");

    }

    // Ejercicio 17: Imprimir mensaje de bienvenida
    public static void imprimirBienvenida(String nombre) {
        System.out.println("Hola, " + nombre + "! Bienvenido al sistema, esperamos que disfrutes de tu visita.");
    }

}
