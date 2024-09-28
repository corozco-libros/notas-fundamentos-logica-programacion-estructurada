package com.corozco.libro.fundamentos.capitulo3;

/**
 * Propósito: Presentar los ejercicios planteados en el Capítulo 3 del libro de Fundamentos en programación
 * relacionados con el uso de operadores lógicos.
 */
public class SolucionOperadoresLogicos {
    public static void main(String[] args) {
        // Ejercicio 1 - Evaluar la expresión a AND b y comparar con c
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean resultado1 = a && b;
        System.out.println("Ejercicio 1 - Resultado de a AND b: " + resultado1);
        System.out.println("Comparado con c usando AND: " + (resultado1 && c));
        System.out.println("Comparado con c usando OR: " + (resultado1 || c));
        System.out.println("Comparado con c usando NOT: " + (!resultado1));

        // Ejercicio 2 - Evaluar la expresión a OR b
        System.out.println("Ejercicio 2 - Resultado de a OR b: " + (a || b));

        // Ejercicio 3 - Determinar el resultado de NOT b
        System.out.println("Ejercicio 3 - Resultado de NOT b: " + (!b));

        // Ejercicio 4 - Verificar si x = 15 satisface las condiciones x > 10 y x < 20
        int x = 15;
        System.out.println("Ejercicio 4 - x es mayor que 10 y menor que 20: " + (x > 10 && x < 20));

        // Ejercicio 5 - Verificar si n = 50 es par y mayor que 30
        int n = 50;
        System.out.println("Ejercicio 5 - n es par y mayor que 30: " + (n % 2 == 0 && n > 30));

        // Ejercicio 6 - Evaluar la expresión (p > q) AND (p < 50)
        int p = 40;
        int q = 20;
        System.out.println("Ejercicio 6 - (p > q) AND (p < 50): " + (p > q && p < 50));

        // Ejercicio 7 - Determinar si al menos una de las tres condiciones es verdadera: a > b, b > c, c > a
        int aNum = 5;
        int bNum = 10;
        int cNum = 3;
        System.out.println("Ejercicio 7 - Al menos una condición es verdadera: " + (aNum > bNum || bNum > cNum || cNum > aNum));

        // Ejercicio 8 - Evaluar la expresión (x OR y) AND NOT (z)
        boolean X = true;
        boolean Y = false;
        boolean Z = true;
        System.out.println("Ejercicio 8 - (x OR y) AND NOT (z): " + ((X || Y) && !Z) );

        // Ejercicio 9 - Comprobar si el año year = 2020 es bisiesto
        int year = 2020;
        boolean esBisiesto = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("Ejercicio 9 - El año " + year + " es bisiesto: " + esBisiesto);

        // Ejercicio 10 - Comprobar si es un buen día para realizar actividades al aire libre
        boolean llueve = false;
        boolean nieva = true;
        boolean viento = true;
        boolean buenDiaParaActividades = !llueve && !nieva && !viento;
        System.out.println("Ejercicio 10 - Es un buen día para actividades al aire libre: " + buenDiaParaActividades);
    }
}
