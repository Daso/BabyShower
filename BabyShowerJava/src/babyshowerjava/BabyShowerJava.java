/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package babyshowerjava;


public class BabyShowerJava {

   
    public static void main(String[] args) {
        Asistente sonia = new Asistente("Sonia", "12/12/1963");
        Asistente carla = new Asistente("Carla", "12/10/1990");
        System.out.println(sonia.preguntarEdad(carla));
        System.out.println(carla.preguntarEdad(sonia));
        
    }
}
