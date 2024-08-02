/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio3;
import java.util.Scanner;

/**
 *
 * @author rjl01
 */
public class Lopez_Roberto_Control2 {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("***** ***** Menu ***** *****");
            System.out.println(" 1.Piedra papel o tijeras: ");
            System.out.println(" 2. Suma: ");
            System.out.println(" 3. Patron Numerico: ");
            System.out.println(" 4. Salir");
            opcion=lea.nextInt();
            
            if(opcion==1){
                System.out.println("1.Piedra 2.Papel 3.Tijeras");
                System.out.println("Seleccione una opcion: ");
                int usuario=lea.nextInt();
                int computadora=(int)(Math.random()*3)+1;
                System.out.println("Eleccion Usuario: "+usuario);
                System.out.println("Eleccion Computadora: "+computadora);
                
                if(usuario==computadora){
                    System.out.println("Es un Empate");
                    
           if (usuario == 1 && computadora == 3) {
                System.out.println("Ganaste");
                } else if (usuario == 2 && computadora == 1) {
                 System.out.println("Ganaste");
                } else if (usuario == 3 && computadora == 2) {
                 System.out.println("Ganaste");
}
                            
        }else{
                     System.out.println("Fin del juego");
                     
                 }
                
   } else if (opcion == 2) {

                System.out.print("Ingrese un numero entero no negativo: ");
                int numero = lea.nextInt();

                if (numero < 0) {
                    System.out.println("Por favor, ingrese un numero no negativo.");
                } else {
                    int suma = 0;
                    StringBuilder sumandos = new StringBuilder();

                    while (numero > 0) {
                        int digito = numero % 10;
                        suma += digito;
                        sumandos.insert(0, " + " + digito);
                        numero /= 10;
                    }

                    if (sumandos.length() > 0) {
                        sumandos.delete(0, 3);
                    }

                    System.out.println("Sumandos utilizados: " + sumandos);
                    System.out.println("Suma de los digitos: " + suma);
                }
              } else if (opcion == 3) {

                System.out.print("Ingrese el numero de filas: ");
                int filas = lea.nextInt();

                for (int i = filas; i >= 1; i--) {
                    for (int j = i; j >= 1; j--) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                
            } else if (opcion == 4) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opcion invalida. Por favor, intente de nuevo: ");
            }
        } while (opcion != 4);

 
    }
}

