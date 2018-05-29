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
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan=new Scanner(System.in);
        
         Estudiante[] estudiantes = new Estudiante[5];
        
         
         for(int i=0; i<estudiantes.length; i++){
             System.out.println("ESTUDIANTE"+ (i+1));
            
             System.out.print("Nombre: ");
             String nombre=scan.nextLine();
             System.out.print("Edad: ");
             
             int edad=scan.nextInt();
             
           estudiantes [i] = new Estudiante(nombre, edad);
           
             String [] materia=new String[2];
             
             scan.nextLine();
             
              for(int j=0; j<materia.length; j++){
                 System.out.print("Nombre de la materia " +(j+1)+": ");
                 materia[j]=scan.nextLine();
                 System.out.print("Nivel de la materia "+( j+1)+": ");
                 int nivel=scan.nextInt();
                               
             }
              //estudiantes[i].setMaterias(materias);
             
         }
         
                  
         System.out.println("Informacion de cada estudiante");
         
         for(int i=0; i<5; i++){
             System.out.println("Estudiante"  +(i+1));
             System.out.println("nombre" + estudiantes[i].getNombre());
            
             System.out.println("edad"+ estudiantes [i].getEdad());
             
             System.out.println("materias tomadas"+ estudiantes[i].getMaterias());
             
         }
    }
    
}
