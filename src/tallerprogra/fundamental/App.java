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
public class App {
    public static void main(String[] args){
         Flight objFlight = new Flight();
         objFlight.name = "105";
         objFlight.addPassenger();
         objFlight.summary();
                 
    }
}
