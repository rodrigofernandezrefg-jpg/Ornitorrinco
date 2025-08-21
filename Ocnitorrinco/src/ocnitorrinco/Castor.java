/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocnitorrinco;

import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author User
 */
public class Castor {
    double longitudCola;
    int velocidad;

    public Castor(double longitudCola, int velocidad) {
        this.longitudCola = longitudCola;
        this.velocidad = velocidad;
    }

    public Castor() {
    }

    public double getLongitudCola() {
        return longitudCola;
    }

    public void setLongitudCola(double longitudCola) {
        this.longitudCola = longitudCola;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public void nadar(){
        if(velocidad>8){
        velocidad = 8;
            System.out.println("Velocidad de: "+velocidad+"Km");
        }else if(velocidad<=8){
            System.out.println("Velocidad de: "+velocidad+"Km");
        }
        
    }
    public void tocarGuitarra(){
        Random random = new Random();
        System.out.println("Toca la cuerda"+(random.nextInt(6)+1));
        System.out.println("Toca la cuerda"+(random.nextInt(6)+1));
        System.out.println("Toca la cuerda"+(random.nextInt(6)+1));
    }
    public static Comparator<Castor> compararVelocidad = new Comparator<Castor>(){

        @Override
        public int compare(Castor a1, Castor a2){
            return Math.max(a1.velocidad, a2.velocidad);
        }
        
    };
}
