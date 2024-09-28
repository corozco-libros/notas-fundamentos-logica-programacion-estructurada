package com.corozco.libro.fundamentos.capitulo3;

/**
 * Propósito: Presentar los ejercicios planteados en el Capítulo 3 del libro de Fundamentos en programación
 * relacionados con el uso del operador de asignación.
 */
public class SolucionOperadorAsignación {
    public static void main(String[] args) {
        // Ejercicio 1: Crear una variable edad y asignarle el valor 30. Luego, imprimir el valor de edad.
        int edad = 30;
        System.out.println("Ejercicio 1 - La edad es: " + edad);

        // Ejercicio 2: Dadas dos variables, x = 10 y y = 20, intercambiar sus valores.
        int x = 10;
        int y = 20;
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Ejercicio 2 - El valor de x es: " + x + " y el valor de y es: " + y);

        // Ejercicio 3: Declarar tres variables, a, b, y c. Asignar valores y luego imprimir el valor de c.
        int a = 5;
        int b = 10;
        int c = a + b;
        System.out.println("Ejercicio 3 - El valor de c es: " + c);

        // Ejercicio 4: Inicializar una variable contador en 0 y luego incrementar su valor en 5.
        int contador = 0;
        contador += 5;
        System.out.println("Ejercicio 4 - El valor del contador es: " + contador);

        // Ejercicio 5: Asignar el resultado de una operación matemática a una variable resultado.
        int resultado = 7 * 3;
        System.out.println("Ejercicio 5 - El resultado es: " + resultado);

        // Ejercicio 6: Dada una variable texto con el valor "Hola", cambiar su valor a "Mundo".
        String texto = "Hola";
        texto = "Mundo";
        System.out.println("Ejercicio 6 - El nuevo texto es: " + texto);

        // Ejercicio 7: Crear una variable saldo con valor inicial de 1000. Restar 150, luego sumar 300.
        int saldo = 1000;
        saldo -= 150;
        saldo += 300;
        System.out.println("Ejercicio 7 - El saldo final es: " + saldo);

        // Ejercicio 8: Declarar una variable temperatura y asignarle el valor de otra variable temperaturaExterior.
        double temperaturaExterior = 22.5;
        double temperatura = temperaturaExterior;
        System.out.println("Ejercicio 8 - La temperatura es: " + temperatura + " grados Celsius");

        // Ejercicio 9: Crear una variable puntuacion y asignarle el valor inicial de 0. Aumentar en 10.
        int puntuacion = 0;
        puntuacion += 10; // Suponemos que el usuario ha pasado un nivel en el juego.
        System.out.println("Ejercicio 9 - La puntuación actualizada es: " + puntuacion);

        // Ejercicio 10: Declarar una variable diasTrabajados y asignarle el número de días trabajados. Calcular el salario.
        int diasTrabajados = 5; // Supongamos que se trabajaron 5 días en la semana.
        int salarioDiario = 100;
        int salarioSemana = diasTrabajados * salarioDiario;
        System.out.println("Ejercicio 10 - El salario de la semana es: " + salarioSemana);
    }
}
