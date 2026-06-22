/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;
import seleccciones.Seleccion;
import java.time.LocalDate;
import java.time.LocalTime;
import arbitros.arbitro;
import resultados.Resultado;

/**
 *
 * @author María J
 */
public class Partido {

    protected Seleccion seleccionLocal;
    protected Seleccion seleccionVisitante;
    protected String estadio;
    protected LocalDate fecha;
    protected LocalTime hora;
    protected arbitro[] arbitros;
    protected Resultado resultado;

    public Seleccion getSeleccionLocal() {
        return seleccionLocal;
    }

    public Seleccion getSeleccionVisitante() {
        return seleccionVisitante;
    }

    public String getEstadio() {
        return estadio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public arbitro[] getArbitros() {
        return arbitros;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setSeleccionVisitante(Seleccion seleccionVisitante) {
        this.seleccionVisitante = seleccionVisitante;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
    public Partido(Seleccion seleccionLocal, Seleccion seleccionVisitante,
               String estadio, LocalDate fecha, LocalTime hora) {

    this.seleccionLocal = seleccionLocal;
    this.seleccionVisitante = seleccionVisitante;
    this.estadio = estadio;
    this.fecha = fecha;
    this.hora = hora;

    arbitros = new arbitro[5];
    resultado = new Resultado();

    
}
    
    @Override
public String toString() {
    return "seleccionLocal: " + seleccionLocal + ", seleccionVisitante: "
            + seleccionVisitante + ", estadio: " + estadio + ", fecha: "
            + fecha + ", hora: " + hora ; 
}
public void agregarArbitro(arbitro arbitro) {

    int pos = buscarEspacioDisponible();

    if(pos != -1){
        arbitros[pos] = arbitro;
    }

}

private int buscarEspacioDisponible(){

    for(int i = 0; i < arbitros.length; i++){

        if(arbitros[i] == null){
            return i;
        }

    }

    return -1;
}


public void eliminarArbitro(arbitro arbitro) {

    int pos = buscarArbitro(arbitro);

    if(pos != -1){
        arbitros[pos] = null;
    }

}

private int buscarArbitro(arbitro arbitro){

    for(int i = 0; i < arbitros.length; i++){

        if(arbitros[i] == arbitro){
            return i;
        }

    }

    return -1;
}
    


public arbitro BuscarArbitroNombre(String nombre){

    for(int i = 0; i < arbitros.length; i++){

        if(arbitros[i] != null &&
           arbitros[i].getNombre().equals(nombre)){

            return arbitros[i];
        }

    }

    return null;
}
    
    

   public int  ContarArbitrosAsignados (arbitro arbitro){   
      int cont=0;
      for(int i = 0; i < arbitros.length; i++){
       if(arbitros[i] != null) {
       cont++;
       }
      }
      
   return cont;   
}
   

public boolean ArbitroRegistrado (arbitro arbitro ){
for(int i = 0; i < arbitros.length; i++){
if (arbitros[i] != null && arbitros[i].equals(arbitro)) {
            return true;
        }
    }

    return false;
}
}




