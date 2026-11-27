/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_pagina_418;

/**
 *
 * @author santiagobaquero
 */

public class EquipoMaratonProgramacion {

    private String nombreEquipo;
    private String universidad;
    private String lenguajeProgramacion;
    private Programador[] programadores;
    private int tamanoEquipo;

    public EquipoMaratonProgramacion(
            String nombreEquipo,
            String universidad,
            String lenguajeProgramacion) throws Exception {

        if (nombreEquipo == null || nombreEquipo.trim().isEmpty()
                || universidad == null || universidad.trim().isEmpty()
                || lenguajeProgramacion == null
                || lenguajeProgramacion.trim().isEmpty()) {

            throw new Exception(
                "Complete el nombre del equipo, la universidad y el lenguaje."
            );
        }

        this.nombreEquipo = nombreEquipo.trim();
        this.universidad = universidad.trim();
        this.lenguajeProgramacion = lenguajeProgramacion.trim();

        this.programadores = new Programador[3];
        this.tamanoEquipo = 0;
    }

    public boolean estaLleno() {
        return tamanoEquipo == programadores.length;
    }

    public void anadir(Programador programador) throws Exception {
        if (estaLleno()) {
            throw new Exception(
                "El equipo ya está completo. "
                    + "No se pudo agregar el programador."
            );
        }

        if (programador == null) {
            throw new Exception(
                "Debe proporcionar un programador válido."
            );
        }

        programadores[tamanoEquipo] = programador;
        tamanoEquipo++;
    }

    public static void validarCampo(String campo) throws Exception {
        if (campo == null || campo.trim().isEmpty()) {
            throw new Exception(
                "El nombre y los apellidos no pueden estar vacíos."
            );
        }

        String texto = campo.trim();

        if (texto.length() >= 20) {
            throw new Exception(
                "El nombre y los apellidos deben tener "
                    + "menos de 20 caracteres."
            );
        }

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (!Character.isLetter(caracter) && caracter != ' ') {
                throw new Exception(
                    "El nombre y los apellidos solo pueden "
                        + "contener letras y espacios."
                );
            }
        }
    }

    public int getTamanoEquipo() {
        return tamanoEquipo;
    }

    public String mostrarDatos() {
        String datos =
                "Nombre del equipo: " + nombreEquipo + "\n"
                + "Universidad: " + universidad + "\n"
                + "Lenguaje: " + lenguajeProgramacion + "\n"
                + "Integrantes: " + tamanoEquipo + "/3\n\n";

        for (int i = 0; i < tamanoEquipo; i++) {
            datos += (i + 1) + ". "
                    + programadores[i].getNombre() + " "
                    + programadores[i].getApellidos() + "\n";
        }

        return datos;
    }
}