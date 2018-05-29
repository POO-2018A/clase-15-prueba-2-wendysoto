/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import java.util.Scanner;
/**
 *
 * @author ESFOT
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String [] materias;
    
    
    public Estudiante (String nombre, int edad ){
                
        this.nombre=nombre;
        this.edad=edad;
        
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }
    
   public String toString(){
       
        //return "nombre "+nombre+" edad"+edad+ "materias "+materias
        
    }
        
             
        
    
        //return Materias;
        
   // }
    
}
