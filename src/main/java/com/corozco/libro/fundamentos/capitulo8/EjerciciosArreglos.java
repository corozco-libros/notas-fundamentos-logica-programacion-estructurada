package com.corozco.libro.fundamentos.capitulo8;

public final class EjerciciosArreglos {

    // Ejercicio 1: Llenar un arreglo con los números del 1 al 20.
    public static void llenarConNumeros() {
        int[] arreglo = new int[20];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i + 1;
            System.out.print(arreglo[i] + " ");
        }
    }

    // Ejercicio 2: Buscar el elemento mayor y menor en un arreglo de enteros.
    public static void encontrarMaximoYMinimo(int[] arreglo) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int j : arreglo) {
            if (j < min) min = j;
            if (j > max) max = j;
        }
        System.out.println("Mínimo: " + min + ", Máximo: " + max);
    }

    // Ejercicio 3: Revertir los elementos de un arreglo.
    public static void revertirArreglo(int[] arreglo) {
        int temp;
        for (int i = 0; i < arreglo.length / 2; i++) {
            temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
        for (int j : arreglo) {
            System.out.println(j);
        }
    }

    // Ejercicio 4: Contar elementos mayores que el promedio.
    public static void contarElementosSobrePromedio(int[] arreglo) {
        int suma = 0;
        for (int j : arreglo) {
            suma += j;
        }
        double promedio = suma / (double) arreglo.length;
        int contador = 0;
        for (int j : arreglo) {
            if (j > promedio) {
                contador++;
            }
        }
        System.out.println("Cantidad de elementos mayores al promedio: " + contador);
    }

    // Ejercicio 5: Verificar la presencia de un número específico.
    public static void verificarNumero(int[] arreglo, int numero) {
        boolean encontrado = false;
        for (int j : arreglo) {
            if (j == numero) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El número " + numero + " está presente en el arreglo.");
        } else {
            System.out.println("El número " + numero + " no está en el arreglo.");
        }
    }

    // Ejercicio 6: Sumar dos arreglos elemento por elemento.
    public static void sumarArreglos(int[] arreglo1, int[] arreglo2) {
        if (arreglo1.length != arreglo2.length) {
            System.out.println("Los dos arreglos deben ser del mismo tamaño");
        }

        int[] suma = new int[arreglo1.length];
        for (int i = 0; i < arreglo1.length; i++) {
            suma[i] = arreglo1[i] + arreglo2[i];
            System.out.println("Suma en posición " + i + ": " + suma[i]);
        }
    }

    // Ejercicio 7: Filtrar los números pares de un arreglo y crear un nuevo arreglo solo con esos números.
    public static void filtrarNumerosPares(int[] arreglo) {
        int contadorPares = 0;
        for (int j : arreglo) {
            if (j % 2 == 0) {
                contadorPares++;
            }
        }
        int[] pares = new int[contadorPares];
        int index = 0;
        for (int j : arreglo) {
            if (j % 2 == 0) {
                pares[index++] = j;
            }
        }
        System.out.println("Arreglo de números pares:");
        for (int par : pares) {
            System.out.println(par);
        }
    }

    // Ejercicio 8: Rotar un arreglo N posiciones a la derecha.
    public static void rotarArreglo(int[] arreglo, int n) {
        System.out.println("Arreglo original: ");
        for (int j : arreglo) {
            System.out.print(j + " ");
        }
        System.out.println();

        if (n > arreglo.length) {
            n = n % arreglo.length;
        }

        int[] resultado = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            resultado[(i + n) % arreglo.length] = arreglo[i];
        }

        System.out.println("Arreglo rotado " + n + " posiciones a la derecha:");
        for (int j : resultado) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // Ejercicio 9: Encontrar elementos comunes entre dos arreglos.
    public static void encontrarElementosComunes(int[] arreglo1, int[] arreglo2) {
        System.out.println("Elementos comunes:");
        for (int i : arreglo1) {
            for (int j : arreglo2) {
                if (i == j) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    // Ejercicio 10: Convertir todos los elementos de un arreglo a sus valores absolutos.
    public static void convertirAValoresAbsolutos(int[] arreglo) {
        System.out.println("Valores absolutos del arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.abs(arreglo[i]);
            System.out.println(arreglo[i]);
        }
    }
}
