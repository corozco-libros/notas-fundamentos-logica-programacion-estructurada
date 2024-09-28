package com.corozco.libro.fundamentos.capitulo6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public final class Ejercicios {

    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    // Ejercicio 1: Determinar si un estudiante ha aprobado basado en su nota final
    public static void verificarAprobacion(int nota) {
        if (nota >= 60) {
            System.out.println("El estudiante ha aprobado el curso.");
        } else {
            System.out.println("El estudiante no ha aprobado el curso.");
        }
    }

    // Ejercicio 2: Calcular el precio final de un producto con IVA y posible descuento
    public static void calcularPrecioFinalProducto(double precio) {
        if (precio > 500) {
            precio *= 0.95; // Aplica descuento del 5%
        }
        precio *= 1.16; // Aplica IVA del 16%
        System.out.println("El precio final del producto es: $" + precio);
    }

    // Ejercicio 3: Ordenar tres números usando condicionales
    public static void ordenarTresNumeros(int a, int b, int c) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        System.out.println("Números en orden ascendente: " + a + ", " + b + ", " + c);
    }

    // Ejercicio 4: Identificar si un carácter es una vocal, una consonante o un número
    public static void identificarCaracter(char ch) {
        if (Character.isDigit(ch)) {
            System.out.println("Es un número.");
        } else if ("aeiouAEIOU".indexOf(ch) != -1) {
            System.out.println("Es una vocal.");
        } else if (Character.isLetter(ch)) {
            System.out.println("Es una consonante.");
        } else {
            System.out.println("Es un símbolo o carácter especial.");
        }
    }

    // Ejercicio 5: Devolver el nombre del día de la semana utilizando la sentencia SWITCH
    public static void nombreDiaSemana(int dia) {
        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Lunes");
            case 3 -> System.out.println("Martes");
            case 4 -> System.out.println("Miércoles");
            case 5 -> System.out.println("Jueves");
            case 6 -> System.out.println("Viernes");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Número inválido");
        }
    }

    // Ejercicio 6: Verificar si un año es bisiesto
    public static void verificarAnioBisiesto(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }
    }

    // Ejercicio 7: Verificar la seguridad de una contraseña
    public static void verificarSeguridadContrasena(String password) {
        boolean largo = password.length() >= 8;
        boolean tieneNumero = password.matches(".*\\d.*");
        boolean tieneMayuscula = !password.equals(password.toLowerCase());
        boolean tieneEspacios = !password.contains(" ");
        if (largo && tieneNumero && tieneMayuscula && tieneEspacios) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura.");
        }
    }

    // Ejercicio 8: Calcular resistencia en serie y en paralelo
    public static void calcularResistencia(double r1, double r2) {
        double serie = r1 + r2;
        double paralelo = (r1 * r2) / (r1 + r2);
        System.out.println("Resistencia en serie: " + serie + " ohms");
        System.out.println("Resistencia en paralelo: " + paralelo + " ohms");
    }

    // Ejercicio 9: Verificar si una persona puede jubilarse
    public static void verificarJubilacion(int edad, int aniosServicio) {
        if (edad > 65 || aniosServicio > 40) {
            System.out.println("La persona puede jubilarse.");
        } else {
            System.out.println("La persona no puede jubilarse aún.");
        }
    }

    // Ejercicio 10: Determinar el estado del agua basado en la temperatura
    public static void estadoAguaTemperatura(int temp) {
        if (temp <= 0) {
            System.out.println("El agua está en estado sólido.");
        } else if (temp < 100) {
            System.out.println("El agua está en estado líquido.");
        } else {
            System.out.println("El agua está en estado gaseoso.");
        }
    }

    // Ejercicio 11: Calcular el índice de masa corporal (IMC)
    public static void calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        System.out.println("El IMC es: " + imc);
        if (imc < 18.5) {
            System.out.println("Categoría: Bajo peso");
        } else if (imc < 24.9) {
            System.out.println("Categoría: Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Categoría: Sobrepeso");
        } else {
            System.out.println("Categoría: Obesidad");
        }
    }

    // Ejercicio 12: Calcular el descuento en una tienda
    public static void calcularDescuento(double totalCompra) {
        if (totalCompra > 200) {
            totalCompra *= 0.85; // 15% de descuento
        } else if (totalCompra > 100) {
            totalCompra *= 0.90; // 10% de descuento
        }
        System.out.println("El total después del descuento es: $" + totalCompra);
    }

    // Ejercicio 13: Calcular el impuesto sobre la renta
    public static void calcularImpuestoRenta(double salario) {
        double impuesto;
        if (salario < 10000) {
            impuesto = salario * 0.05;
        } else if (salario < 20000) {
            impuesto = salario * 0.10;
        } else {
            impuesto = salario * 0.15;
        }
        System.out.println("El impuesto sobre la renta es: $" + impuesto);
    }

    // Ejercicio 14: Determinar el tipo de triángulo
    public static void determinarTipoTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }
    }

    // Ejercicio 15: Determinar el signo de un número
    public static void determinarSignoNumero(double numero) {
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }

    // Ejercicio 16: Determinar si un número es positivo, negativo o cero utilizando el operador ternario
    public static void signoNumeroTernario(int numero) {
        String resultado = (numero > 0) ? "positivo" : (numero < 0) ? "negativo" : "cero";
        System.out.println("El número es " + resultado);
    }

    // Ejercicio 17: Determinar si una persona es mayor de edad (18 años o más) utilizando el operador ternario
    public static void esMayorDeEdad(int edad) {
        String resultado = (edad >= 18) ? "mayor de edad" : "menor de edad";
        System.out.println("La persona es " + resultado);
    }

    // Ejercicio 18: Calcular el precio final de un producto aplicando un descuento del 10% si el precio original es mayor a $100, utilizando el operador ternario
    public static void precioConDescuento(double precio) {
        double precioFinal = (precio > 100) ? precio * 0.90 : precio;
        System.out.println("El precio final del producto es: $" + precioFinal);
    }

    // Ejercicio 19: Determinar si un año es bisiesto utilizando el operador ternario
    public static void esBisiesto(int year) {
        String resultado = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "bisiesto" : "no bisiesto";
        System.out.println("El año es " + resultado);
    }

    // Ejercicio 20: Convertir una temperatura de Celsius a Fahrenheit si el valor es mayor a 0, y a Kelvin si es menor o igual a 0, utilizando el operador ternario
    public static void convertirTemperatura(double celsius) {
        String escala = (celsius > 0) ? "Fahrenheit" : "Kelvin";
        double resultado = (celsius > 0) ? (celsius * 9 / 5) + 32 : celsius + 273.15;
        System.out.println("La temperatura en " + escala + " es: " + resultado);
    }
}
