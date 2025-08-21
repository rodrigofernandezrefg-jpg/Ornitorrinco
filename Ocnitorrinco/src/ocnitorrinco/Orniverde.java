/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocnitorrinco;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Orniverde extends Castor implements Mamapato {

    public Orniverde(double longitudCola, int velocidad) {
        super(longitudCola, velocidad);
    }

    public Orniverde() {
    }

    @Override
    public void tocarOrgano() {
        Scanner leer = new Scanner(System.in);
        String seguir;
        System.out.println("Do-Re-Mi");
        seguir= leer.next();
        System.out.println("Fa-Sol-La-Si");
    }
    
}
