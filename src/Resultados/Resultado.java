
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
    private int golesLocal;
    private int golesVisitante;

    public Resultado() {
        seleccionGanadora = null;
        marcador = "0-0";
        golesLocal=0;
        golesVisitante=0;
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
    
    public void setGolesLocal(int golesLocal) {
    this.golesLocal = golesLocal;
    }

    public void setGolesVisitante(int golesVisitante) {
    this.golesVisitante = golesVisitante;
}
    
    public boolean Empate(){
        return seleccionGanadora== null;
    }
    
    public int diferenciaGoles(){
        if (golesLocal > golesVisitante){
            return golesLocal-golesVisitante;
        }
        return golesVisitante-golesLocal;
    }
    
    
    public int TotalgolesAnotados(){
    return golesLocal+golesVisitante;
}
    public boolean ambosEquiposAnotaron(){
        return golesLocal > 0 && golesVisitante > 0;
    }
    
    public Seleccion IdentificaseleccionGanadora(){
        return seleccionGanadora;
    }
    

    @Override
    public String toString() {
        return "seleccionGanadora: " + seleccionGanadora + ", marcador: " + marcador;
    }
}
    

