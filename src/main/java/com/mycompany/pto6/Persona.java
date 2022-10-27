/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pto6;

/**
 *
 * @author Usuario
 */
public class Persona {

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    private Persona personas [] ;
    private String nombre ; 
    private String sucursal ;
    private String direccion ;
    private int telefono ;

    public Persona(String nombre, String sucursal, String direccion, int telefono) {
        this.nombre = nombre;
        this.sucursal = sucursal;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    
    
    
    
}
