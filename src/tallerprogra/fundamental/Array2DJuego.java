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
public class Array2DJuego {
    
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int nx = 3;
         int ny = 3;
         int[][] array2D = new int[nx][ny];
         char[][] arrayChar2D = new char[nx][ny];
         int jugador=1;
         for(int i=0;i<nx;i++){
		for(int j=0;j<ny;j++){
                        if(jugador%2==0){
                            System.out.printf("Ingrese Jugador X\n");
                            array2D[i][j] = scan.nextInt();
                            arrayChar2D[i][j] = 'X';
                        }else{
                            System.out.printf("Ingrese Jugador Y\n");
                            array2D[i][j] = scan.nextInt();
                            arrayChar2D[i][j] = 'Y';
                        }
                        jugador++;
         	}
         }
         System.out.println(" ================ Matriz ======================");
         for(int i=0;i<nx;i++){
		for(int j=0;j<ny;j++){
                        System.out.printf("%s \t",arrayChar2D[i][j]);
         	}
                System.out.print("\n");
         }

         
     }
}
