/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogra.fundamental;

import java.io.IOException;

/**
 *
 * @author fred
 */
public class OrderPrecedence {
    
    public static void main(String[] args) 
            throws IOException {
        int incremento = 50;
        System.out.println(++incremento);
        System.out.println(incremento);
        
        int numero=5; 
        numero+=1; //numero =  numero +1
        System.out.println(numero);
        
        System.out.println(5%3);
    }
    
}
