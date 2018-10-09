/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_4;
import java.util.Scanner;
/**
 *
 * @author fojomars
 */
public class Boletin1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        float num1 = 0, num2 = 0,suma,resta,producto,cociente;
        System.out.println("Introduzca el número 1: ");
        num1 = ler.nextFloat();
        System.out.println("Introduzca el número 2: ");
        num2 = ler.nextFloat();
        System.out.println("La suma es: "+ (num1+num2));
        System.out.println("La rest es: "+ (num1-num2));
        System.out.println("El productoe es: "+ (num1*num2));
        System.out.println("El cociente es: "+ (num1/num2));
        
        
        
        
        
        
    }
    
}
