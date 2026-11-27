/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_pagina_418;

/**
 *
 * @author santiagobaquero
 */

public class Programador {

    private String nombre;
    private String apellidos;

    public Programador(String nombre, String apellidos) throws Exception {
        EquipoMaratonProgramacion.validarCampo(nombre);
        EquipoMaratonProgramacion.validarCampo(apellidos);

        this.nombre = nombre.trim();
        this.apellidos = apellidos.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
}