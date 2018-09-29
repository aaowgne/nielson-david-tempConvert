/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program01;

/**
 *
 * @author aaowg
 */
import java.util.Scanner;
        
public class Program01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float C,F;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the temperature in Celsius");
        C=keyboard.nextFloat();
        
        F=C * 9/5 + 32;
        
        System.out.println("The temperature in Fahrenheit is "+F);
        
        
        
        
    }
    
}
