/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package jugadores;

/**
 *
 * @author marii
 */
public enum posicionJugador {
    PORTERO("Portero"), DEFENSA ("Defensa"), MEDIOCAMPISTA ("MedioCampista"), DELANTERO("Delantero");
    private String posicion;

    public String getPosicion() {
        return posicion;
    }
    posicionJugador (String posicion){
        this.posicion= posicion;
    }
    
}
