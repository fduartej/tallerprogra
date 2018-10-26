/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogra.fundamental;

import java.io.IOException;
import java.util.Scanner;
public class Demo {

    public static void main(String[] args) 
            throws IOException {
        // TODO code application logic here
        System.out.println("Calcular");
        Scanner reader = new Scanner(System.in);
        int ope1 = reader.nextInt();
        int ope2 = reader.nextInt();
        String operacion = reader.nextLine();
        operacion = reader.nextLine();
        int total= 0;
        if("+".equals(operacion)){
            total= ope1 + ope2;
        }else if("*".equals(operacion)){
            total= ope1 * ope2;
        }
        System.out.printf("Total %d", total);
        System.out.println("\n");
    }
    
}