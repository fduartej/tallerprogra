/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogra.fundamental;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author c17422
 */
public class Arreglos {
    
    public static void main(String[] args) {
        int[] numeros = new int[3];
        numeros[0] = 100;
        numeros[1] = 200;
        numeros[2] = 300;
        
        for(int i=0;i<numeros.length;i++){
            System.out.printf("Indice: %d ,Valor: %d \n",i,numeros[i]);
        }
        
        List<Alumno> alumnos = new ArrayList<Alumno>();
        Alumno a = new Alumno();
        a.setID(0);
        a.setName("Jose");
        a.setGender("M");
        alumnos.add(a);
        
        a = new Alumno();
        a.setID(1);
        a.setName("Fernando");
        a.setGender("M");
        alumnos.add(a);
        
        a = new Alumno();
        a.setID(1);
        a.setName("Karla");
        a.setGender("F");
        alumnos.add(a);
        
        for(Alumno o : alumnos) {
            if("M".equals(o.getGender())){
                System.out.printf("ID: %d ,Name: %s \n",o.getID(),o.getName());
            }
        }
        
    }
}
