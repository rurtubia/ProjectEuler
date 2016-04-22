/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.euler;

/**
 *
 * @author Randy
 */

import project.euler.entities.*;

public class ProjectEuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MultiplesOf3And5 multiplesOf3and5 = new MultiplesOf3And5();
        
        System.out.println(multiplesOf3and5.calculo(3, 5, 1000, 0));
    }
    
}
