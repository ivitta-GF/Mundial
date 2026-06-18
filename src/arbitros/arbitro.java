/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbitros;
import java.time.LocalDate;
import personas.Personas;
/**
 *
 * @author marii
 */
public class arbitro extends Personas {
    protected String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public arbitro(String nombre, String nacionalidad, LocalDate fecha, String categoria){
        this.nombre=nombre;
        this.nacionalidad= nacionalidad;
        this.fecha= fecha;
        this.categoria = categoria;
    }
    
    public String toString(){
        return "Nombre: "+nombre+ "\nNacionalidad: "+nacionalidad+"\nFecha: "+fecha+"\nCategoria: "+categoria;
    }
    
}
