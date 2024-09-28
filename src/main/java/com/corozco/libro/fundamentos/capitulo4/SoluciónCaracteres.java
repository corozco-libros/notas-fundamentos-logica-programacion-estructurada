package com.corozco.libro.fundamentos.capitulo4;

import java.util.Arrays;

/**
 * Propósito: Presentar los ejercicios planteados en el Capítulo 4 del libro de Fundamentos en programación
 * relacionados con el uso de caracteres y cadenas de caracteres.
 */
public class SoluciónCaracteres {
    public static void main(String[] args) {

        //Ejercicio 1: Crear vocales y obtener su equivalente en estándar Unicode
        System.out.println("-------------------Ejercicio 1-------------------");

        char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u';

        System.out.println("a carácter: " + a + "; a entero: " + (int) a);
        System.out.println("e carácter: " + e + "; a entero: " + (int) e);
        System.out.println("i carácter: " + i + "; a entero: " + (int) i);
        System.out.println("o carácter: " + o + "; a entero: " + (int) o);
        System.out.println("u carácter: " + u + "; a entero: " + (int) u);

        System.out.println();

        // Ejercicio 2: Crear vocales con tílde y obtener su equivalente en estándar Unicode
        System.out.println("-------------------Ejercicio 2-------------------");

        char a_tilde = 'á', e_tilde = 'é', i_tilde = 'í', o_tilde = 'ó', u_tilde = 'ú';

        System.out.println("a_tilde carácter: " + a_tilde + "; a_tilde entero: " + (int) a_tilde);
        System.out.println("e_tilde carácter: " + e_tilde + "; a_tilde entero: " + (int) e_tilde);
        System.out.println("i_tilde carácter: " + i_tilde + "; a_tilde entero: " + (int) i_tilde);
        System.out.println("o_tilde carácter: " + o_tilde + "; a_tilde entero: " + (int) o_tilde);
        System.out.println("u_tilde carácter: " + u_tilde + "; a_tilde entero: " + (int) u_tilde);

        // Ejercicio 3: Operaciones con cadenas de caracteres
        System.out.println("-------------------Ejercicio 3-------------------");

        String cadena = "Hola Mundo";
        String nombreLector = "NombreLector"; // Puedes cambiar esto por el nombre del lector
        String saludoCompleto = "espero que estés disfrutando el libro";

        // Imprimir la cadena por pantalla
        System.out.println("Cadena original: " + cadena);

        // Imprimir los caracteres individuales de la cadena de caracteres
        System.out.println(Arrays.toString(cadena.toCharArray()));

        // Obtener e imprimir solo la palabra "Hola"
        String palabraHola = cadena.substring(0, 4);
        System.out.println("Palabra 'Hola': " + palabraHola);

        // Obtener e imprimir solo la palabra "Mundo"
        String palabraMundo = cadena.substring(5);
        System.out.println("Palabra 'Mundo': " + palabraMundo);

        // Obtener e imprimir solo la palabra "la mun"
        String subcadena = cadena.substring(2, 8);
        System.out.println("Subcadena 'la mun': " + subcadena);

        // Reemplazar la palabra "Mundo" por el nombre del lector e imprimir el resultado
        String cadenaReemplazada = cadena.replace("Mundo", nombreLector);
        System.out.println("Cadena reemplazada: " + cadenaReemplazada);

        // Crear la cadena de caracteres "Espero que estés disfrutando el libro" e imprimir un saludo completo
        String saludoFinal = "Hola " + nombreLector + " " + saludoCompleto;
        System.out.println("Saludo completo: " + saludoFinal);
    }
}
