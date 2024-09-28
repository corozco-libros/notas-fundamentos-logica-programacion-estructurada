package com.corozco.libro.fundamentos.capitulo4;

/**
 * Propósito: Presentar los ejercicios planteados en el Capítulo 4 del libro de Fundamentos en programación
 * relacionados con el uso de caracteres y cadenas de caracteres.
 */
public class SolucionParseo {
    public static void main(String[] args) {

        //Ejercicio 1: Parsear numeros a String
        System.out.println("-------------------Ejercicio 1-------------------");
        short shortVar = 10;
        int intVar = 20;
        float floatVar = 30.5f;
        double doubleVar = 40.5;

        // Parsear su valor a una variable de tipo String
        String shortStr = String.valueOf(shortVar);
        String intStr = String.valueOf(intVar);
        String floatStr = String.valueOf(floatVar);
        String doubleStr = String.valueOf(doubleVar);

        // "Sumar" los Strings utilizando el operador "+"
        String result = shortStr + intStr + floatStr + doubleStr;

        // Imprimir el resultado
        System.out.println("Resultado de la suma de Strings: " + result);

        //Ejercicio 2: Parsear String a numeros
        System.out.println("-------------------Ejercicio 2-------------------");

        // Convertir los Strings de nuevo a sus respectivos tipos numéricos
        shortVar = Short.parseShort(shortStr);
        intVar = Integer.parseInt(intStr);
        floatVar = Float.parseFloat(floatStr);
        doubleVar = Double.parseDouble(doubleStr);

        // Sumar los valores numéricos
        double sum = shortVar + intVar + floatVar + doubleVar;

        // Imprimir el resultado
        System.out.println("Resultado de la suma de los valores numéricos: " + sum);
    }
}
