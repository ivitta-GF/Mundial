/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mundial;
import partidos.Partido;
import seleccciones.Seleccion;
/**
 *
 * @author PC
 */
public class Mundial {
    
    private String nombreM;
    private double year;
    private String país;
  int cantidad = 0;
      private Seleccion[] selecciones;
      private Partido[] partidos;

    public String getNombreM() {
        return nombreM;
    }

    public double getYear() {
        return year;
    }

    public String getPaís() {
        return país;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public Seleccion[] getSelecciones(){
        return selecciones;
    }

    public Mundial(String nombreM, double year, String país, Seleccion[] selecciones, int cantidad,Partido[] partidos) {
        this.nombreM = nombreM;
        this.year = year;
        this.país = país;
        this.selecciones = selecciones;
        this.partidos= partidos;
        this.cantidad= 0;
    }
 
    public void agregarSeleccion (Seleccion seleccion){
        for(int i = 0; i<selecciones.length; i++){
            if(selecciones[i]==null){
                selecciones[i]= seleccion;
                break;
            }
        }        
    }
    
    public void eliminarSeleccion(Seleccion seleccion){
        for(int i = 0; i< selecciones.length; i--){
            if(selecciones[i]==seleccion){
                selecciones[i]=null;
                break;
            }
        }
    }
    
    public Seleccion buscarSeleccion(Seleccion seleccion, String nombre)
    { 
        for (int i = 0; i< selecciones.length;i++){
            if (this.selecciones[i].getNombre().equals(nombre)){
                return this.selecciones[i];
               
            }else {
            }
    }
        return null;
        
    } 
    
    @Override
    public String toString() {
        return "===Mundial===" + "\n {" +
                "\n nombre del mundial: " +
                nombreM + " \n año: " + year 
                + "País: " + país + "}";
    }
    
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
   
    
}
