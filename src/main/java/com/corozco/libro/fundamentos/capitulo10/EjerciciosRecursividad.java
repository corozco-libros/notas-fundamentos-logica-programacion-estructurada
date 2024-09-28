package com.corozco.libro.fundamentos.capitulo10;

public final class EjerciciosRecursividad {

    // Ejercicio 1: Calcular el factorial de un número de manera recursiva.
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Ejercicio 2: Contar el número de veces que un carácter aparece en una cadena de manera recursiva.
    public static int contarCaracter(String str, char ch, int index) {
        if (index >= str.length()) {
            return 0;
        }
        int count = (str.charAt(index) == ch) ? 1 : 0;
        return count + contarCaracter(str, ch, index + 1);
    }

    // Ejercicio 3: Convertir un número entero de base decimal a binario de manera recursiva.
    public static String decimalABinario(int numero) {
        if (numero == 0) {
            return "0";
        }
        return decimalABinario(numero / 2) + (numero % 2);
    }

    // Ejercicio 4: Determinar si una palabra o frase es un palíndromo de manera recursiva.
    public static boolean esPalindromo(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return esPalindromo(str, start + 1, end - 1);
    }

    // Ejercicio 5: Sumar los elementos de un arreglo de manera recursiva.
    public static int sumaArreglo(int[] arreglo, int index) {
        if (index >= arreglo.length) {
            return 0;
        }
        return arreglo[index] + sumaArreglo(arreglo, index + 1);
    }

    // Ejercicio 6: Encontrar el máximo en un arreglo de manera recursiva.
    public static int maximoArreglo(int[] arreglo, int index) {
        if (index == arreglo.length - 1) {
            return arreglo[index];
        }
        int maxResto = maximoArreglo(arreglo, index + 1);
        return (arreglo[index] > maxResto) ? arreglo[index] : maxResto;
    }

    // Ejercicio 7: Calcular la suma de todos los números hasta un número dado n de manera recursiva.
    public static int sumaHastaN(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumaHastaN(n - 1);
    }

    // Ejercicio 8: Calcular la suma de los dígitos de un número de manera recursiva.
    public static int sumaDigitos(int numero) {
        if (numero == 0) {
            return 0;
        }
        return (numero % 10) + sumaDigitos(numero / 10);
    }

    // Ejercicio 9: Imprimir los elementos de un arreglo en forma inversa de manera recursiva.
    public static void imprimirInverso(int[] arreglo, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(arreglo[index] + " ");
        imprimirInverso(arreglo, index - 1);
    }

    // Ejercicio 10: Calcular el máximo común divisor (MCD) de dos números utilizando el algoritmo de Euclides de manera recursiva.
    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }

    // Ejercicio 11: Generar un patrón de asteriscos en forma de pirámide invertida de manera recursiva.
    public static void imprimirPiramideInvertida(int filas) {
        if (filas == 0) {
            return;
        }
        imprimirLineaAsteriscos(filas);
        imprimirPiramideInvertida(filas - 1);
    }

    private static void imprimirLineaAsteriscos(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    // Ejercicio 12: Realizar la operación de potencia (x elevado a la n) de manera recursiva.
    public static int potencia(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * potencia(x, n - 1);
    }

    // Ejercicio 13: Calcular el n-ésimo número de la secuencia de Lucas de manera recursiva.
    public static int lucas(int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        return lucas(n - 1) + lucas(n - 2);
    }
}
