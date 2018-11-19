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
public class NestedIf {
 
      public static void main(String[] args) {
        float students= 8.0f; //0.0
        float rooms = 4.0f; //4.0

        if(students > 0.0f) {
            if (rooms > 0.0f)
                System.out.println(students / rooms);
        }
        else
            System.out.println("No students");

        System.out.println();
        System.out.println("** end program **");
    }
}
