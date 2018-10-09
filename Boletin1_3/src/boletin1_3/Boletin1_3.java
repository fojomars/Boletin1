/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_3;
import java.util.Scanner;
/**
 *
 * @author fojomars
 */
public class Boletin1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        float euro = 0,dolar,conversion = 0;
        
        System.out.println("Introduzca la conversión: ");
        conversion = ler.nextFloat();
        System.out.println("Introduzca la euros: ");
        euro = ler.nextFloat();
        dolar=euro*conversion;
        System.out.println(euro +"€" + " equivalen a " + dolar + "$");
        
        
    }
    
}
