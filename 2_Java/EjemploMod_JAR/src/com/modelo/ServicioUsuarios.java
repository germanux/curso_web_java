/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import java.util.ArrayList;

/**
 *
 * @author German
 */
public class ServicioUsuarios {

    // Implementando Singleton:
    private static ServicioUsuarios instancia = null;

    // Nadie puede hacer new salvo esta misma clase
    private ServicioUsuarios() {
        // listaUsuarios = new ArrayList<>();
        this.bdUsu = new DerbyDBUsuario();
        this.listaUsuarios = bdUsu.listar();
    }

    // Única manera de obtener un objeto en esta clase
    public static ServicioUsuarios getInstancia() {
        if (instancia == null) {
            instancia = new ServicioUsuarios();
        }
        return instancia;
    }

    // Codigo de la clase:
    private DerbyDBUsuario bdUsu;
    private final ArrayList<Usuario> listaUsuarios;

    public boolean addUsuario(String nom, String edad, String email, String password) {
        try {
            if (nom.equals("") || edad.equals("") || email.equals("") || password.equals("")) {
                return false;
            } else {
                int iEdad = Integer.parseInt(edad);
                Usuario nuevoUsu = new Usuario(nom, password, iEdad, email);
                this.listaUsuarios.add(nuevoUsu);
                return this.bdUsu.crear(nuevoUsu);
            }
        } catch (Exception ex) {
            System.err.println(" << ERROR: No se ha podido crear Usuario " + ex.getMessage());
            return false;
        }
    }

    public boolean validacionPasswd(String email, String passwd) {
        for (Usuario usu : listaUsuarios) {
            if (usu.getEmail().equals(email) && usu.getPassword().equals(passwd)) {
                return true;
            }
        }
        return false;
    }

    public int cantidadUsuarios() {
        return listaUsuarios.size();
    }

    public ArrayList<Usuario> listar() {
        return this.listaUsuarios;
    }
}
