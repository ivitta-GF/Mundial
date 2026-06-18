/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.time.LocalDate;

import java.time.Period;

/**
 *
 * @author PC
 */
public class Personas {
    protected String nombre;
    protected LocalDate fecha;
    protected String nacionalidad;

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
   
 
    public int getEdad(){
        return Period.between(fecha, LocalDate.now()).getYears();
    }

    public Personas(String nombre, LocalDate fecha, String nacionalidad) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.nacionalidad = nacionalidad;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
