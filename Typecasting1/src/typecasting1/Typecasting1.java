/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typecasting1;

/**
 *
 * @author Rajat
 */
public class Typecasting1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Implicit Type Casting");
        char a='A';
        int b=a;
        float c=a;
        long d=a;
        double e=a;
        
        System.out.println("Value of a: " + a + "\nValue of b: " + b + "\nValue of c: " + c + "\nValue of d: " + d + "\nValue of e: " + e + "\n");
        
        System.out.println("Explicit Type Casting");
        
        double x = 45.5;
        int y = (int)x;
        System.out.println("Value of x: " + x + "\nValue of y: " + y);
    }
    
}
