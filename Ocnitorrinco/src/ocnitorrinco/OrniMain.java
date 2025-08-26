
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
        Castor[] l = new Castor[3];
        Orniverde verde = null;
        try {
            System.out.println("Ingrese longitud de cola del OrniVerde:");
            double colaVerde = sc.nextDouble();
            System.out.println("Ingrese velocidad del OrniVerde:");
            int velVerde = sc.nextInt();
            verde = new Orniverde(colaVerde, velVerde);
            l[0] = verde;
            System.out.println("Ingrese longitud de cola del OrniAzul Blue:");
            double colaBlue = sc.nextDouble();
            System.out.println("Ingrese velocidad de Blue:");
            int velBlue = sc.nextInt();

            Castor blue = new Orniazul(colaBlue, velBlue);
            l[1] = blue;
            System.out.println("Ingrese longitud de cola del OrniAzul Blui:");
            double colaBlui = sc.nextDouble();
            System.out.println("Ingrese velocidad de Blui:");
            int velBlui = sc.nextInt();

            Castor blui = new Orniazul(colaBlui, velBlui);
            l[2] = blui;
        } catch (ArrayIndexOutOfBoundsException exe) {
            System.out.println("La posicion en el arreglo no existe");
        }

        System.out.println("\n--- Habilidades del OrniVerde (Grupo2) ---");
        l[0].nadar();
        l[0].tocarGuitarra();
        verde.tocarOrgano();
        verde.tocarGuitorgan();
        System.out.println("*** Habilidades de OrniAzul Blue ***");
        System.out.println("Ingrese propulsión de Blue (5 a 10):");
        int propBlue = sc.nextInt();
        ((Orniazul) l[1]).nadar(propBlue);
        System.out.println("*** Habilidades de OrniAzul Blui ***");
        System.out.println("Ingrese propulsión de Blui (5 a 10):");
        int propBlui = sc.nextInt();
        ((Orniazul) l[2]).nadar(propBlui);

        
    }

}
