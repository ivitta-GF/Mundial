/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrenadores;
import personas.Personas;
import java.time.LocalDate;

/**
 *
 * @author Stef
 */
public class Entrenador extends Personas {
    
    private int anosExperiencia;

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    public Entrenador(int anosExperiencia, String nombre, LocalDate fecha, String nacionalidad){
        super(nombre, fecha, nacionalidad);
        this.anosExperiencia= anosExperiencia;
    }

    @Override
    public String toString() {
        return "Entrenador{" + 
                "\nNombre: "+ getNombre()+"Nacionalidad: "+ getNacionalidad()+"Fecha: "+ getFecha()+"Años de Experiencia: "+anosExperiencia;
    } 
    
    
}
   
    

