package com.corozco.libro.fundamentos.capitulo7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Ejercicios {

    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));


    // Ejercicio 1: Mostrar los números del 1 al 50 por pantalla
    public static void mostrarNumeros() {
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
        }
    }

    // Ejercicio 2: Calcular la suma de todos los números pares hasta 100
    public static void sumaParesHastaCien() {
        int suma = 0;
        for (int i = 0; i <= 100; i += 2) {
            suma += i;
        }
        System.out.println("Suma de números pares hasta 100: " + suma);
    }

    // Ejercicio 3: Imprimir la tabla de multiplicar de los números desde el 1 hasta el 10
    public static void imprimirTablasMultiplicar() throws IOException {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla de multiplicar del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }

    // Ejercicio 4: Mostrar los términos de la serie de Fibonacci hasta un número dado
    public static void mostrarFibonacciHastaN() throws IOException {
        System.out.print("Ingrese el límite para la serie de Fibonacci: ");
        int limite = Integer.parseInt(teclado.readLine());
        int a = 0, b = 1, c;
        while (a <= limite) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    // Ejercicio 5: Mostrar los primeros N términos de la serie Fibonacci.
    public static void mostrarFibonacciNTerminos() throws IOException {
        System.out.print("Ingrese el número de términos de Fibonacci que desea ver: ");
        int n = Integer.parseInt(teclado.readLine()); // Lee la cantidad de términos que el usuario desea ver
        int a = 0, b = 1, c;

        if (n <= 0) {
            System.out.println("Por favor, ingrese un número mayor que cero.");
        } else if (n == 1) {
            System.out.println("Primer término de Fibonacci: " + a);
        } else {
            System.out.println("Primeros " + n + " términos de la serie Fibonacci:");
            System.out.print(a + " " + b); // Imprime los dos primeros términos

            for (int i = 2; i < n; i++) { // Comienza en 2 porque los dos primeros términos ya están impresos
                c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
            System.out.println(); // Salto de línea al final de la serie
        }
    }

    // Ejercicio 6: Pedir al usuario que ingrese números hasta que introduzca un número negativo, luego mostrar la suma de todos los números ingresados
    public static int generarNumerosYAcalcularSuma(int n) {
        int suma = 0, numero;

        do {
            numero = (int) (Math.random() * (n + 1)); // Genera un número entre 0 y n (inclusive)
            suma += numero;
        } while (numero != 0);

        return suma;
    }

    // Ejercicio 7: Crear un programa que imprima todos los divisores de un número ingresado por el usuario
    public static void imprimirDivisores() throws IOException {
        System.out.print("Ingrese un número para encontrar sus divisores: ");
        int numero = Integer.parseInt(teclado.readLine());
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Ejercicio 8: Determinar si un número es primo
    public static void esPrimo() throws IOException {
        System.out.print("Ingrese un número para verificar si es primo: ");
        int numero = Integer.parseInt(teclado.readLine());
        boolean primo = true;
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        System.out.println(numero + " es primo: " + primo);
    }

    // Ejercicio 9: Contar cuántos dígitos tiene un número entero positivo
    public static void contarDigitos() throws IOException {
        System.out.print("Ingrese un número entero positivo: ");
        int numero = Integer.parseInt(teclado.readLine());
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        System.out.println("Número de dígitos: " + contador);
    }

    // Ejercicio 10: Sumar los dígitos de un número
    public static void sumaDigitos() throws IOException {
        System.out.print("Ingrese un número para sumar sus dígitos: ");
        int numero = Integer.parseInt(teclado.readLine());
        int suma = 0;
        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }
        System.out.println("La suma de los dígitos es: " + suma);
    }

    // Ejercicio 11: Invertir los dígitos de un número
    public static void invertirNumero() throws IOException {
        System.out.print("Ingrese un número para invertir: ");
        int numero = Integer.parseInt(teclado.readLine());
        int invertido = 0;
        while (numero != 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }
        System.out.println("Número invertido: " + invertido);
    }

    // Ejercicio 12: Calcular el máximo común divisor (MCD) de dos números
    public static void calcularMCD() throws IOException {
        System.out.print("Ingrese el primer número: ");
        int a = Integer.parseInt(teclado.readLine());
        System.out.print("Ingrese el segundo número: ");
        int b = Integer.parseInt(teclado.readLine());
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("El MCD es: " + a);
    }

    // Ejercicio 13: Simular el lanzamiento de un dado repetidamente hasta que salga un 6
    public static void lanzarDado() {
        int resultado;
        do {
            resultado = (int) (Math.random() * 6) + 1;
            System.out.println("Dado: " + resultado);
        } while (resultado != 6);
    }

    // Ejercicio 14: Imprimir un patrón de asteriscos que represente un triángulo en pantalla
    public static void imprimirTrianguloAsteriscos() throws IOException {
        System.out.print("Ingrese el número de filas para el triángulo de asteriscos: ");
        int filas = Integer.parseInt(teclado.readLine());
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Ejercicio 15: Calcular la suma la serie 1/2 + 1/4 + 1/8 + 1/16 + ..., hasta que el término agregado sea menor que 0.0001
    public static void sumaSerieFracciones() throws IOException {
        System.out.print("Ingrese el número de términos para sumar en la serie: ");
        int n = Integer.parseInt(teclado.readLine());
        double suma = 0.0;
        double terminoActual = 0.5; // Primer término de la serie

        for (int i = 0; i < n; i++) {
            suma += terminoActual;
            terminoActual /= 2; // Divide el término actual por 2 para obtener el siguiente término de la serie
        }

        System.out.println("La suma de los primeros " + n + " términos de la serie es: " + suma);
    }

    // Ejercicio 16: Crear un programa que imprima una línea de separación con caracteres '-' repetidos 80 veces
    public static void imprimirLineaSeparacion() {
        for (int i = 0; i < 80; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    // Ejercicio 17: Pedir al usuario que ingrese palabras hasta que ingrese "fin", luego contar cuántas palabras fueron ingresadas
    public static void contarPalabras() throws IOException {
        int contador = 0;
        String palabra;
        do {
            System.out.print("Ingrese una palabra ('fin' para terminar): ");
            palabra = teclado.readLine();
            if (!palabra.equalsIgnoreCase("fin")) {
                contador++;
            }
        } while (!palabra.equalsIgnoreCase("fin"));
        System.out.println("Número de palabras ingresadas: " + contador);
    }

    // Ejercicio 18: Simular el llenado de un estanque de agua
    public static void llenarEstanque() {
        double capacidad = 100.0;
        double cantidadActual = 0.0;
        while (true) {
            cantidadActual += 10; // Asumimos que cada ciclo agrega 10 litros
            System.out.println("Cantidad actual en el estanque: " + cantidadActual + " litros");
            if (cantidadActual >= capacidad) {
                System.out.println("Estanque lleno.");
                break;
            }
        }
    }

    // Ejercicio 19: Desarrollar un contador que cuente hacia atrás desde 10 hasta 1 y luego imprima "Despegue"
    public static void conteoRegresivo() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("¡Despegue!");
    }

    // Ejercicio 20: Calcular el factorial de un número N
    public static void calcularFactorialN() throws IOException {
        System.out.print("Ingrese un número para calcular su factorial: ");
        int n = Integer.parseInt(teclado.readLine());
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
    }

}
