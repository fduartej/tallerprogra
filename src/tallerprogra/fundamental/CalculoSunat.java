/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogra.fundamental;

import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author fred
 */
public class CalculoSunat {

        public static final double RENTA_12 = 0.12;
        public static final double RENTA_15 = 0.15;
        public static final double RENTA_20 = 0.2;
        public static final double RENTA_30 = 0.3;
        public static final double UIT = 4500.0;
        
        public static void main(String[] args) 
            throws IOException {
        // TODO code application logic here
        System.out.println("SUNAT");
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese Nombre:");
        String nombre = reader.nextLine();
        System.out.println("Nombre :"+ nombre);
        System.out.println("Ingrese Meses:");
        int meses = reader.nextInt();
        System.out.printf("Meses %d ", meses);
        System.out.println("Ingrese Sueldo:");
        double sueldo = reader.nextDouble();
        System.out.printf("Sueldo %f ", sueldo);
        double totalSueldoAnual = sueldo * meses;
        double totalRentaAnual = 0.0;
        System.out.println("\n");
        System.out.printf("Total Sueldo Anual %f ", totalSueldoAnual);
        if( totalSueldoAnual > (UIT*3)){
            totalRentaAnual = totalSueldoAnual * RENTA_12;
        }
        System.out.println("\n");
        System.out.printf("Total Renta Anual %f ", totalRentaAnual);
        System.out.println("\n");
    }

}
