/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogra.fundamental;

import java.util.Scanner;

/**
 *
 * @author c02160
 */
public class Array2D {
    
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
	 System.out.println("Ingrese Filas:");
         int nx = scan.nextInt();
	 System.out.println("Ingrese Columnas:");
         int ny = scan.nextInt();
         int[][] array2D = new int[nx][ny];
         System.out.println("Ingrese Valores:");
         for(int i=0;i<nx;i++){
		for(int j=0;j<ny;j++){
                        array2D[i][j] = scan.nextInt();
         	}
         }
         System.out.println(" ================ Matriz ======================");
         for(int i=0;i<nx;i++){
		for(int j=0;j<ny;j++){
                        System.out.printf("%d \t",array2D[i][j]);
         	}
                System.out.print("\n");
         }

         
     }
}
