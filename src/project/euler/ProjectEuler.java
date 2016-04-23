/*
 *  This work by Randy Urtubia is licensed under the Creative Commons.
 * 
 *  Attribution: You must give appropriate credit, provide a link to the license, and indicate if changes were made.
 *    You may do so in any reasonable manner, but not in any way that suggests the licensor endorses you or your use.
 *  NonCommercial: You may not use the material for commercial purposes.
 *  ShareAlike: If you remix, transform, or build upon the material, you must distribute your contributions under the same license as the original.
 * 
 *  Based on a work at http://www.notnull.cl.
 *  To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/.
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

import project.euler.problems.*;

public class ProjectEuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Problem1_MultiplesOf3And5 multiplesOf3and5 = new Problem1_MultiplesOf3And5();
        multiplesOf3and5.calculate();
        System.out.println("");
        
        Problem1_MultiplesOf3And5 otrosNumeros = new Problem1_MultiplesOf3And5(3, 2, 10);
        otrosNumeros.calculate();
        
        
        Problem2_EvenFibonacciNumbers SumOfEvenFibonacci = new Problem2_EvenFibonacciNumbers();
        System.out.println(SumOfEvenFibonacci.calculate());
        System.out.println("    ");
        Problem2_EvenFibonacciNumbers SumOfOtherFibonacci = new Problem2_EvenFibonacciNumbers(100, true);
        System.out.println(SumOfOtherFibonacci.calculate());
        */
        
//        Problem3_LargestPrimeFactor  lpf = new Problem3_LargestPrimeFactor();
//        lpf.isPrime(31);
//        lpf.isPrime(32);
//        lpf.isPrime(33);
//        lpf.isPrime(34);
//        lpf.isPrime(35);
//        lpf.isPrime(36);
//        lpf.isPrime(37);
//        lpf.isPrime(38);
//        lpf.isPrime(39);
//        lpf.isPrime(40);
//        System.out.println(lpf.factors());
          //lpf.largestPrimeFactorSlow(9999999999L);
//          Problem3_LargestPrimeFactor userDefinedNumber = new project.euler.problems.Problem3_LargestPrimeFactor(3213);
//          userDefinedNumber.largestPrimeFactorSlow();
          
//          Problem3_LargestPrimeFactor projectEulerNumber = new project.euler.problems.Problem3_LargestPrimeFactor();
//          projectEulerNumber.largestPrimeFactorSlow();
       
    //      Problem3_LargestPrimeFactor checkIfPrime = new project.euler.problems.Problem3_LargestPrimeFactor(600851475143L);
    //      System.out.println(checkIfPrime.isPrime(600851475143L));
       
            Problem3_LargestPrimeFactor lpf = new Problem3_LargestPrimeFactor();
            //SPEED TESTS:
            //lpf.largestPrimeFactorQuick(127978132); //(total time: 13 seconds)31994533
            //lpf.largestPrimeFactorSlow(127978132); //(total time: 14 seconds)
            //lpf.largestPrimeFactorQuick(999999999); //(total time: 1 minute 41 seconds)333667
            //lpf.largestPrimeFactorSlow(999999999); //(total time: 1 minute 42 seconds)333667
            //lpf.largestPrimeFactorQuick(927978132); //(total time: 2 minutes 12 seconds)42701
            //lpf.largestPrimeFactorSlow(927978132); //(total time: 2 minutes 14 seconds)42701
            
            
    }
}
