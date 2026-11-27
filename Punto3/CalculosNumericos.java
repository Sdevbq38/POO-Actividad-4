/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_pagina_412;

import java.util.InputMismatchException;
/**
 *
 * @author santiagobaquero
 */

public class CalculosNumericos {

    // Logaritmo neperiano
    static double calcularLogaritmoNeperiano(double valor) {
        try {
            if (valor <= 0) {
                throw new ArithmeticException(
                    "El valor debe ser un número positivo"
                );
            }

            double resultado = Math.log(valor);
            return resultado;

        } catch (ArithmeticException e) {
            System.out.println(
                "El valor debe ser un número positivo para calcular el logaritmo"
            );

        } catch (InputMismatchException e) {
            System.out.println(
                "El valor debe ser numérico para calcular el logaritmo"
            );
        }

        return Double.NaN;
    }

    // Raíz cuadrada
    static double calcularRaízCuadrada(double valor) {
        try {
            if (valor < 0) {
                throw new ArithmeticException(
                    "El valor debe ser un número mayor o igual a cero"
                );
            }

            double resultado = Math.sqrt(valor);
            return resultado;

        } catch (ArithmeticException e) {
            System.out.println(
                "El valor debe ser mayor o igual a cero para calcular la raíz cuadrada"
            );

        } catch (InputMismatchException e) {
            System.out.println(
                "El valor debe ser numérico para calcular la raíz cuadrada"
            );
        }

        return Double.NaN;
    }
}