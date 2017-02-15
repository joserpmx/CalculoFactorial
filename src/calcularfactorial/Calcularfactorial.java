/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularfactorial;

/**
 *
 * @author Jose
 */
import java.util.Scanner;
public class Calcularfactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicio de algoritmo
        // Declaracion de variables
        // le agrego un comentario
        //otro cmentario mas
        //otro
        int Contador=0; //Sirve para controlar el ciclo y guardar el numero que se quiere calcular el factorial
        float Factorial=1; //Acumulador sirve para guardar el resultado
        int Numero,Respuesta=1;
        Scanner lector=new Scanner(System.in);
        while(Respuesta==1)
        {    
            //Solicitar el numero al que se le calcula el factorial
            System.out.print("A que numero desea calcularle el factorial: ");
            Contador=lector.nextInt();
            Numero=Contador;
            while(Contador>=2)
            {    
                Factorial=Factorial*Contador;
                Contador=Contador-1;
            }
            System.out.println("El Factorial de "+ Numero + " es: " + Factorial);
            Factorial=1;
            System.out.print("Quieres otro calculo 1.- Si, 2.- No: ");
            Respuesta=lector.nextInt();
        }    
    }
}
