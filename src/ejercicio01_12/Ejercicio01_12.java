/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 *
 *
 * 
(Velocidad media en kilómetros) Suponga que un corredor corre 24 millas en 1 hora, 40 minutos,
y 35 segundos. Escriba un programa que muestre la velocidad media en kilómetros por
hora. (Observe que 1 milla es 1.6 kilómetros.)
 */
package ejercicio01_12;

/**
 *
 * @author user
 */
public class Ejercicio01_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Miles / (hour + (minutes / 60) + (seconds / 3600)) * 1.6");
	System.out.println("24    / (1    + (40      / 60) + (35      / 3600))  * 1.6");
	System.out.println((24 / (1 + (40 / 60.0) + (35 / 3600.0))) * 1.6);
    }
    
}
