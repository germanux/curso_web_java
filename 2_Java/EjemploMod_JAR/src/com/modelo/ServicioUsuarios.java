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
    private ArrayList<Usuario> listaUsuarios;

    public boolean addUsuario(String nom, String edad, String email, String password) {
        try {
            if (nom.equals("") || edad.equals("") || email.equals("") || password.equals("")) {
                return false;
            } else {
                int iEdad = Integer.parseInt(edad);
                Usuario nuevoUsu = new Usuario(null, nom, iEdad, email, password);
                
                boolean creado = this.bdUsu.crear(nuevoUsu);
                this.listaUsuarios = bdUsu.listar();
                return this.listaUsuarios != null && creado;
            }
        } catch (Exception ex) {
            System.err.println(" << ERROR: No se ha podido crear Usuario " + ex.getMessage());
            return false;
        }
    }

    public boolean modificarUsuario(
            String id,             
            String nom, 
            String edad, 
            String email, 
            String password) {
        try {
            if (id.equals("") || nom.equals("") || edad.equals("") || email.equals("") || password.equals("")) {
                return false;
            } else {
                Integer iId = Integer.parseInt(id);
                int iEdad = Integer.parseInt(edad);
                Usuario nuevoUsu = new Usuario(iId, nom, iEdad, email, password);
                boolean modificado = this.bdUsu.modificar(nuevoUsu);
                this.listaUsuarios = bdUsu.listar();
                return this.listaUsuarios != null && modificado;
            }
        } catch (Exception ex) {
            System.err.println(" << ERROR: No se ha podido modificar Usuario " + ex.getMessage());
            return false;
        }
    }
    public boolean eliminar(String id) {
        try {
            if (id.equals("")) {
                return false;
            } else {
                Integer iId = Integer.parseInt(id);
                boolean eliminado = this.bdUsu.elimninar(iId);
                this.listaUsuarios = bdUsu.listar();
                return this.listaUsuarios != null && eliminado;
            }
        } catch (Exception ex) {
            System.err.println(" << ERROR: No se ha podido eliminar Usuario " + ex.getMessage());
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
