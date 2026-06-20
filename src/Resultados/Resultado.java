/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resultados;
import seleccciones.Seleccion;
/**
 *
 * @author María J
 */
public class Resultado {

    private Seleccion seleccionGanadora;
    private String marcador;

    public Resultado() {
        seleccionGanadora = null;
        marcador = "0-0";
    }

    public Seleccion getSeleccionGanadora() {
        return seleccionGanadora;
    }

    public void setSeleccionGanadora(Seleccion seleccionGanadora) {
        this.seleccionGanadora = seleccionGanadora;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    @Override
    public String toString() {
        return "seleccionGanadora: " + seleccionGanadora + ", marcador: " + marcador;
    }
}
    

