package com.corozco.libro.fundamentos.capitulo4;

/**
 * Propósito: Presentar los ejercicios planteados en el Capítulo 4 del libro de Fundamentos en programación
 * relacionados con el casteo de tipos.
 */
public class SoluciónCasteo {
    public static void main(String[] args) {

        // Ejercicio 1: Casteo implícito
        int a_int = 5;
        float a_float = a_int;
        double a_double = a_int;

        System.out.println("a:" + a_int);
        System.out.println("a como float:" + a_float);
        System.out.println("a como double:" + a_double);

        System.out.println();

        // Ejercicio 2: Casteo explícito
        double b_double = 1234567.55555555555555555555;
        float b_float = (float) b_double;
        int b_int = (int) b_double;
        short b_short = (short) b_double;

        System.out.println("b: " + b_double);
        System.out.println("b como float: " + b_float);
        System.out.println("b como int: " + b_int);
        System.out.println("b como short: " + b_short);

        System.out.println();
        // Ejercicio 3: Operaciones entre tipos diferentes
        System.out.println("-------------------Ejercicio 3-------------------");
        int myInt = 5;
        float myFloat = 6;
        double myDouble = 7;
        short myShort = 1;

        printType(myInt + myFloat, "(int + float)");
        printType(myInt + myShort, "(int + short)");
        printType(myInt + myDouble, "(int + double)");
        printType(myFloat + myDouble, "(float + double)");
    }

    public static void printType(Object obj, String msg) {
        System.out.println("Tipo de dato para " + msg + ": " + obj.getClass().getSimpleName());
    }
}
