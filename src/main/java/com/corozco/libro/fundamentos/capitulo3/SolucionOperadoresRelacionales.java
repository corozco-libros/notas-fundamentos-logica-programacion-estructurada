package com.corozco.libro.fundamentos.capitulo3;

/**
 * Propósito: Presentar los ejercicios planteados en el Capítulo 3 del libro de Fundamentos en programación
 * relacionados con el uso de operadores relacionales.
 */
public class SolucionOperadoresRelacionales {
    public static void main(String[] args) {
        // Ejercicio 1 - Comparar dos números enteros
        int a = 15;
        int b = 20;
        System.out.println("Ejercicio 1 - a es mayor que b? " + (a > b));

        // Ejercicio 2 - Comparar dos cadenas
        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        System.out.println("Ejercicio 2 - cadena1 es igual a cadena2? " + cadena1.equals(cadena2));

        // Ejercicio 3 - Longitud de una cadena mayor que 10
        String s = "Operadores";
        System.out.println("Ejercicio 3 - La longitud de s es mayor que 10? " + (s.length() > 10));

        // Ejercicio 4 - Comparar dos variables flotantes
        float f1 = 5.75f;
        float f2 = 5.76f;
        System.out.println("Ejercicio 4 - f1 es menor o igual a f2? " + (f1 <= f2));

        // Ejercicio 5 - Verificar si un número está dentro del rango de 40 a 60
        int x = 50;
        System.out.println("Ejercicio 5 - x está entre 40 y 60? " + (x >= 40 && x <= 60));

        // Ejercicio 6 - Determinar si el resultado de una expresión aritmética es igual a 22
        int resultado = (3 * 4) + (2 * 5);
        System.out.println("Ejercicio 6 - El resultado es igual a 22? " + (resultado == 22));

        // Ejercicio 7 - Comparar dos variables booleanas
        boolean verdadero = true;
        boolean falso = false;
        System.out.println("Ejercicio 7 - verdadero es diferente a falso? " + (verdadero != falso));

        // Ejercicio 8 - Crear la tabla de verdad para los operadores AND, OR y NOT

        boolean p = true;
        boolean q = true;
        System.out.println("Ejercicio 8 - Tabla de verdad para p: true, q: true - AND: " + (p && q) + ", OR: " + (p || q) + ", NOT p: " + (!p) + ", NOT q: " + (!q));

        p = true;
        q = false;
        System.out.println("Ejercicio 8 - Tabla de verdad para p: true, q: false - AND: " + (p && q) + ", OR: " + (p || q) + ", NOT p: " + (!p) + ", NOT q: " + (!q));

        p = false;
        q = true;
        System.out.println("Ejercicio 8 - Tabla de verdad para p: false, q: true - AND: " + (p && q) + ", OR: " + (p || q) + ", NOT p: " + (!p) + ", NOT q: " + (!q));

        p = false;
        q = false;
        System.out.println("Ejercicio 8 - Tabla de verdad para p: false, q: false - AND: " + (p && q) + ", OR: " + (p || q) + ", NOT p: " + (!p) + ", NOT q: " + (!q));

        // Ejercicio 9 - Evaluar si la edad de una persona es suficiente para ser considerada adulta
        int edad = 43;
        System.out.println("Ejercicio 9 - edad es mayor o igual a 18? " + (edad >= 18));

        // Ejercicio 10 - Comparar el valor ASCII de dos caracteres
        char c1 = 'a';
        char c2 = 'b';
        System.out.println("Ejercicio 10 - c1 es menor que c2? " + (c1 < c2));
    }
}
