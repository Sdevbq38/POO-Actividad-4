/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_pagina_427;

/**
 *
 * @author santiagobaquero
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class LeerArchivo {

    public static String leer(String nombreArchivo) throws IOException {
        StringBuilder contenido = new StringBuilder();

        try (
            FileInputStream archivo =
                new FileInputStream(nombreArchivo);

            InputStreamReader conversor =
                new InputStreamReader(
                    archivo,
                    StandardCharsets.UTF_8
                );

            BufferedReader filtro =
                new BufferedReader(conversor)
        ) {
            String linea = filtro.readLine();

            while (linea != null) {
                contenido.append(linea)
                         .append(System.lineSeparator());

                linea = filtro.readLine();
            }
        }

        return contenido.toString();
    }
}