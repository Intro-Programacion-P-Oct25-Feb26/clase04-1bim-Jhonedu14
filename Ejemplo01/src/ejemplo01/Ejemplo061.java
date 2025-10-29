/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {
    public static void main(String[] args) {
        // Uso de printf
        // f: formato
        
        String Nombre = "Jhon Edu";
        String Apellido = "Pardo Condolo";
        int edad = 19;
        String direccion = "turunuma alto";
        String universidad = "utpl";
        String ciclo = "Primer ciclo";
        String asignatura = "Introduccion a la programacion";
        String paralelo = "A";
        
  
        // System.out.println(nombreEstudiante+" "+apellidoEstudiante+ " "+ 
        // nacimiento);
        // En printf; 
        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        // System.out.printf("%s\n\n%s\n\n%s\n", nombreEstudiante, 
        //        apellidoEstudiante, nacimiento);
        System.out.printf("Nombre:\t%s\nApellido:\t%s\n\n%s\n\n\t%s\t\n\n%s\n\n%s\n\n%s\n\t%s", Nombre , Apellido , edad , direccion , universidad , ciclo , asignatura , paralelo);
        
       
    }
}
