/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrenadores;
import java.time.LocalDate;
import personas.Personas;

/**
 *
 * @author Stef
 */
public class Entrenador extends Personas {
    
    private int añosExperiencia;

    public int getAñosExperiencia() {
        return añosExperiencia;
    }
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public Entrenador(String nombre, LocalDate fecha, String nacionalidad, int añosExperiencia) {
        this.nombre= nombre;
        this.fecha= fecha ;
        this.nacionalidad= nacionalidad;
        this.añosExperiencia = añosExperiencia;
    }
    

    @Override
    public String toString() {
        return "Entrenador{" + 
                "\nNombre: " + getNombre() + 
                "\nfecha: " + getFecha() +
                "\nNacionalidad: " + getNacionalidad() +
                "\nAños Experiencia: " + añosExperiencia +
                "\n}";
    }
   
    
}
