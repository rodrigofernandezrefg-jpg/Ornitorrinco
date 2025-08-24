/*
 */
package ocnitorrinco;

import java.util.Scanner;

/**
 *
 * @author Grupo2
 */
public class OrniMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      Try{
        System.out.println("Ingrese longitud de cola del OrniVerde:");
        double colaVerde = sc.nextDouble();
            System.out.println("Ingrese velocidad del OrniVerde:");
            int velVerde = sc.nextInt();
            Orniverde verde = new Orniverde(colaVerde, velVerde);
            
            System.out.println("Ingrese longitud de cola del OrniAzul Blue:");
            double colaBlue = sc.nextDouble();
            System.out.println("Ingrese velocidad de Blue:");
            int velBlue = sc.nextInt();
            Orniazul blue = new Orniazul(colaBlue, velBlue);
            
             System.out.println("Ingrese longitud de cola del OrniAzul Blui:");
            double colaBlui = sc.nextDouble();
            System.out.println("Ingrese velocidad de Blui:");
            int velBlui = sc.nextInt();
            Orniazul blui = new Orniazul(colaBlui, velBlui);
            
             System.out.println("\n--- Habilidades del OrniVerde (Grupo2) ---");
            verde.nadar();
            verde.tocarGuitarra();
            verde.tocarOrgano();
            verde.tocarGuitorgan();

         
    }
    }
    
}
