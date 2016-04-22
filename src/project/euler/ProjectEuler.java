/*
 * Problem 1: Project Euler.net
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

package project.euler;
/**
 * Project Euler is a series of challenging mathematical/computer programming 
 * problems that will require more than just mathematical insights to solve. 
 * Although mathematics will help you arrive at elegant and efficient methods, 
 * the use of a computer and programming skills will be required to solve 
 * most problems.
 * 
 * @author Randy Urtubia
 */

import project.euler.problems.Problem1_MultiplesOf3And5;

public class ProjectEuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Problem1_MultiplesOf3And5 multiplesOf3and5 = new Problem1_MultiplesOf3And5();
        multiplesOf3and5.calculate();
        System.out.println("");
        
        Problem1_MultiplesOf3And5 otrosNumeros = new Problem1_MultiplesOf3And5(3, 2, 10);
        otrosNumeros.calculate();
    }
}
