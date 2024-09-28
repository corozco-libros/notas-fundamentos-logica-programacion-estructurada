package com.corozco.libro.fundamentos.capitulo3;

/**
 * Propósito: Presentar los ejercicios planteados en el Capítulo 3 del libro de Fundamentos en programación
 * relacionados con el uso de operadores aritméticos.
 */
public class SolucionOperadoresAritmeticos {
    public static void main(String[] args) {
        // Ejercicio 1: Suma de dos números
        // Solución: Sumar 10 y 20
        int num1 = 10;
        int num2 = 20;
        int suma = num1 + num2;
        System.out.println("Ejercicio 1 - Suma de dos números: " + suma);

        // Ejercicio 2: Resta de dos números y verificar si el resultado es positivo
        // Solución: Restar 30 de 10 y verificar si es positivo
        int num3 = 30;
        int num4 = 10;
        int resta = num3 - num4;
        System.out.println("Ejercicio 2 - Resta de dos números: " + resta);

        // Ejercicio 3: Multiplicar dos números y dividir el resultado por otro número.
        // Solución: Multiplicar 10 por 5 y dividir por 2
        int num5 = 10;
        int num6 = 5;
        int num7 = 2;
        int resultadoMultDiv = (num5 * num6) / num7;
        System.out.println("Ejercicio 3 - Multiplicar y dividir: " + resultadoMultDiv);

        // Ejercicio 4: Determinar el residuo de la división entre dos números.
        // Solución: Residuo de dividir 20 por 3
        int num8 = 20;
        int num9 = 3;
        int residuo = num8 % num9;
        System.out.println("Ejercicio 4 - Residuo de división: " + residuo);

        // Ejercicio 5: Calcular la potencia de un número elevado a otro.
        // Solución: 3 elevado a la 4
        double base = 3;
        double exponente = 4;
        double potencia = Math.pow(base, exponente);
        System.out.println("Ejercicio 5 - Potencia de un número: " + potencia);

        // Ejercicio 6: Aplicar la fórmula cuadrática para hallar posibles valores de x.
        // Solución: Valores de x para la ecuación x^2 - 3x + 2 = 0
        double a = 1, b = -3, c = 2;
        double discriminante = Math.sqrt(b * b - 4 * a * c);
        double x1 = (-b + discriminante) / (2 * a);
        double x2 = (-b - discriminante) / (2 * a);
        System.out.println("Ejercicio 6 - Fórmula cuadrática x1: " + x1 + ", x2: " + x2);

        // Ejercicio 7: Calcular el área de un triángulo usando la fórmula de Herón.
        // Solución: Área de un triángulo con lados 5, 6, y 7
        double ladoA = 5, ladoB = 6, ladoC = 7;
        double semiperimetro = (ladoA + ladoB + ladoC) / 2;
        double areaTriangulo = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
        System.out.println("Ejercicio 7 - Área del triángulo: " + areaTriangulo);

        // Ejercicio 8: Calcular el volumen de un cilindro.
        // Solución: Volumen de un cilindro con radio 3 y altura 10
        double radio = 3;
        double altura = 10;
        double volumenCilindro = Math.PI * radio * radio * altura;
        System.out.println("Ejercicio 8 - Volumen del cilindro: " + volumenCilindro);

        // Ejercicio 9: Calcular la resistencia equivalente en paralelo.
        // Solución: Resistencia equivalente para R1 = 10, R2 = 5 en paralelo
        double r1 = 10, r2 = 5;
        double resistenciaEquivalente = 1 / ((1 / r1) + (1 / r2));
        System.out.println("Ejercicio 9 - Resistencia equivalente: " + resistenciaEquivalente);

        // Ejercicio 10: Calcular el período de oscilación de un péndulo.
        // Solución: Período de un péndulo de longitud 2 metros
        double longitudPendulo = 2;
        double gravedad = 9.81;
        double periodoPendulo = 2 * Math.PI * Math.sqrt(longitudPendulo / gravedad);
        System.out.println("Ejercicio 10 - Período del péndulo: " + periodoPendulo);
    }
}
