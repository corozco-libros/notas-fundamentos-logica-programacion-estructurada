package com.corozco.libro.fundamentos.capitulo9;

import java.io.*;

public class EjerciciosArchivos {

    // Ejercicio 1: Leer un archivo de texto y mostrar su contenido en la consola.
    public static void mostrarContenido(String rutaArchivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
        br.close();
    }

    // Ejercicio 2: Escribir un arreglo de nombres en un archivo, cada nombre en una nueva línea.
    public static void escribirNombres(String[] nombres, String rutaArchivo) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo));
        for (String nombre : nombres) {
            bw.write(nombre);
            bw.newLine();
        }
        bw.close();
    }

    // Ejercicio 3: Leer un archivo de texto y contar la cantidad de palabras que contiene.
    public static int contarPalabras(String rutaArchivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
        int palabras = 0;
        String linea;
        while ((linea = br.readLine()) != null) {
            palabras += linea.split("\\s+").length;
        }
        br.close();
        return palabras;
    }

    // Ejercicio 4: Crear un archivo de texto que contenga los números del 1 al 100.
    public static void escribirNumeros(String rutaArchivo) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo));
        for (int i = 1; i <= 100; i++) {
            bw.write(Integer.toString(i));
            bw.newLine();
        }
        bw.close();
    }

    // Ejercicio 5: Leer un archivo y escribir en otro todas las palabras que empiecen con 'a'.
    public static void filtrarPalabras(String rutaArchivo, String destino) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destino));
        String linea;
        while ((linea = br.readLine()) != null) {
            for (String palabra : linea.split("\\s+")) {
                if (palabra.startsWith("a")) {
                    bw.write(palabra);
                    bw.newLine();
                }
            }
        }
        br.close();
        bw.close();
    }

    // Ejercicio 6: Leer un archivo que contiene varias líneas de texto y escribir en un nuevo archivo cada línea en orden inverso.
    public static void invertirLineas(String rutaArchivo, String destino) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destino));
        String linea;
        while ((linea = br.readLine()) != null) {
            bw.write(new StringBuilder(linea).reverse().toString());
            bw.newLine();
        }
        br.close();
        bw.close();
    }

    // Ejercicio 7: Leer un archivo de texto y crear un nuevo archivo que contenga solo las líneas que tengan más de 15 caracteres.
    public static void filtrarLineasLargas(String rutaArchivo, String destino) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destino));
        String linea;
        while ((linea = br.readLine()) != null) {
            if (linea.length() > 15) {
                bw.write(linea);
                bw.newLine();
            }
        }
        br.close();
        bw.close();
    }

    // Ejercicio 8: Leer un archivo de números y calcular su suma y promedio, escribiendo los resultados en un nuevo archivo.
    public static void sumarNumeros(String rutaArchivo, String destino) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destino));
        String linea;
        int suma = 0;
        int count = 0;
        while ((linea = br.readLine()) != null) {
            suma += Integer.parseInt(linea.trim());
            count++;
        }
        br.close();
        bw.write("Suma: " + suma + "\n");
        bw.write("Promedio: " + (suma / (double) count));
        bw.close();
    }

    // Ejercicio 9: Leer un archivo de texto y escribir otro que contenga las mismas líneas pero numeradas.
    public static void numerarLineas(String rutaArchivo, String destino) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destino));
        String linea;
        int lineNumber = 1;
        while ((linea = br.readLine()) != null) {
            bw.write(lineNumber++ + ": " + linea);
            bw.newLine();
        }
        br.close();
        bw.close();
    }


    // Ejercicio 10: Crear matriz identidad
    public static void crearMatrizIdentidad(int n, String nombreArchivo) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
        try {
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        sb.append("1"); // Diagonal principal
                    } else {
                        sb.append("0");
                    }
                    if (j < n - 1) {
                        sb.append(" "); // Añade espacio entre elementos, excepto después del último elemento de cada fila
                    }
                }
                writer.write(sb.toString());
                writer.newLine(); // Nueva línea al final de cada fila
            }
        } finally {
            writer.close(); // Asegura que el BufferedWriter se cierra al finalizar
        }
    }

    // Ejercicio 11: Calcular valores en matriz identidad.
    public static void generarDetalleMatriz(String nombreArchivoEntrada, String nombreArchivoSalida, int factor) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nombreArchivoEntrada));
        BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivoSalida));
        StringBuilder diagonalEscalar = new StringBuilder();
        int rowIndex = 0;
        int countZeros = 0;
        int n = 0; // Para mantener la cuenta de n

        try {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] elementos = linea.split(" ");
                n = elementos.length; // Actualiza n con la longitud de la fila (número de columnas)
                // Multiplicar solo el elemento diagonal (elementos[rowIndex])
                int valorDiagonal = Integer.parseInt(elementos[rowIndex]) * factor;
                diagonalEscalar.append(valorDiagonal);
                if (rowIndex < n - 1) {
                    diagonalEscalar.append(" ");
                }
                // Contar ceros
                for (String elem : elementos) {
                    if ("0".equals(elem)) {
                        countZeros++;
                    }
                }
                rowIndex++;
            }
            // Escribir la diagonal escalada
            writer.write(diagonalEscalar.toString());
            writer.newLine();
            // Escribir la dimensión de la matriz
            writer.write(n + "x" + n);
            writer.newLine();
            // Escribir el conteo de ceros
            writer.write("Número de ceros en la matriz: " + countZeros);
        } finally {
            reader.close();
            writer.close();
        }
    }
}
