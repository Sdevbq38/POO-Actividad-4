/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_pagina_400;

/**
 *
 * @author santiagobaquero
 */
public class PruebaExcepciones {

    public static double dividir(double numerador, double denominador) {
        if (denominador == 0) {
            throw new ArithmeticException(
                "No se puede dividir por cero."
            );
        }

        return numerador / denominador;
    }

    public static String probarObjetoNulo() {
        Object objeto = null;
        return objeto.toString();
    }
}