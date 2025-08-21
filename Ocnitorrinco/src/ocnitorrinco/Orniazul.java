/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocnitorrinco;

/**
 *
 * @author User
 */
public class Orniazul extends Castor {

    public Orniazul(double longitudCola, int velocidad) {
        super(longitudCola, velocidad);
    }

    public Orniazul() {
    }
    
    public void nadar(int propulsión){
        super.nadar();
        velocidad = velocidad + propulsión;
    }
}
