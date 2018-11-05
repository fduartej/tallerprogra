/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogra.fundamental;

/**
 *
 * @author fred
 */
public class LetLogical {
    
     public static void main(String[] args) {
	int students = 200;
        int rooms = 5;

        if(rooms > 0 && students/rooms > 30)
            System.out.println("Crowded!!");

        System.out.println();
        System.out.println("** end program **");
    }
}
