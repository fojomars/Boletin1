/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_5;
import java.util.Scanner;
/**
 *
 * @author fojomars
 */
public class Boletin1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        float millasMarinas = 0,conversionMillas=1852,conversion=0;
        System.out.println("Introduzca las millas marinas: ");
        millasMarinas = ler.nextFloat();
        conversion = millasMarinas * conversionMillas; 
        System.out.println(millasMarinas + ", millas marinas son: " + conversion + "metros");
        
        
    }
    
}
