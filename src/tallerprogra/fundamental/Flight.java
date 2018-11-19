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
public class Flight {
    
    private int seats;
    private int passengers;
    public String name;
    
    public Flight(){
        seats=150;
        passengers=0;
    }
    
    public static void main(String[] args){
        Flight objFlight = new Flight();
        objFlight.addPassenger();
        objFlight.summary();
        
        for(int i=0;i<100;i++){
            objFlight.addPassenger();
        }
        objFlight.summary();
    
    }
    
    public void addPassenger(){
        if(passengers<seats) {
            System.err.println("Add Passenger");
            passengers++;
        }
           
    }

    public void summary(){
        System.out.printf("Nombre %s \n", name );
        System.out.printf("Total asientos %d \n", seats );
        System.out.printf("Total pasajeros %d \n", passengers );
        System.out.printf("Total asientos disponibles %d \n", seats - passengers );
    }
    
    public int getSeats() {
        return seats;
    }


    public int getPassengers() {
        return passengers;
    }

    
    
}
