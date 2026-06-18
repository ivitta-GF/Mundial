 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugadores;
import personas.Personas;
/**
 * 
 *
 * @author marii
 */
public class Jugador extends Personas{
    protected int numero;
    protected posicionJugador posicion;

    public int getNumero() {
        return numero;
    }

    public posicionJugador getPosicion() {
        return posicion;
    }


    public void setPosicion(posicionJugador posicion) {
        this.posicion = posicion;
    }
    public Jugador (String nombre, String nacionalidad, String fecha, int numero, posicionJugador posicion){
        this.nombre= nombre;
        this.nacionalidad= nacionalidad;
        this.fecha= fecha;
        this.numero= numero;
        this.posicion=posicion;
    }
    
    public String toString(){
        return "Nombre: "+nombre+"\nNacionalidad: "+nacionalidad+"Fecha: "+fecha+"\nNumero: "+numero+"Posicion: "+posicion;
    }
    
    
    
    
    
    
    
    
}
