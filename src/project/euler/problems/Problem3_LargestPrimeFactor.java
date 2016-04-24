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
package project.euler.problems;

import java.util.ArrayList;

/**
 * Problem 3: Largest Prime Factor.
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 
 * 
 * @author Randy Urtubia
 * 
 */

public class Problem3_LargestPrimeFactor {   
    
    //class fields
    /**
     * The number to be used.
     * By project Euler, the number to be used is 600851475143.
     */
    private long number = 600851475143L;
    
    //Getters and setters
    /**
     * Returns the number to be evaluated.
     * @return The number to be evaluated.
     */
    public long getNumber() {
        return number;
    }

    /**
     * Sets the number to be evaluated.
     * @param number The number to be saved.
     */
    public void setNumber(long number) {
        this.number = number;
    }

    /**
     * Creates an instance of the class in which the number to be passed is set by the user
     * @param l The long number to be used.
     */
    public Problem3_LargestPrimeFactor(long l) {
        this.number = l;
    }

    /**
     * Creates an instance of the class in which no number is passed, so the number used is the default value by project Euler.
     * Note: the number by project Euler is extremely large, so the execution of the program will take very long.
     * The Euler number is 600851475143
     */
    public Problem3_LargestPrimeFactor() {
    }
    
    /**
     * Executes the program using the default value.
     * @return The largest prime factor for the number passed.
     */
    public long largestPrimeFactorSlow(){
        long largestPrimeFactor = 0;
        
        ArrayList<Long> listOfFactors;
        ArrayList<Long> listOfPrimeFactors;
        listOfFactors = this.factors(this.number);
        System.out.println(listOfFactors);
        listOfPrimeFactors = this.listOfPrimeLongFactors(listOfFactors);
        System.out.println(listOfPrimeFactors);
        largestPrimeFactor = this.largestLongNumber(listOfPrimeFactors);
        System.out.println(largestPrimeFactor);
       
        //Find the factors of a number.
            //return an arraylist
        //Find out which factors are primes
            //return an arraylist
        //Select the largest prime factor
        
        return largestPrimeFactor;
    }
    

    /**
     * Executes the program using a parameter.
     * @param numberToEvaluate The long number to be evaluated.
     * @return The largest prime factor for the number passed.
     */
    public long largestPrimeFactorSlow(long numberToEvaluate){
        long largestPrimeFactor = 0L;
        
        ArrayList<Long> listOfFactors;
        ArrayList<Long> listOfPrimeFactors;
        listOfFactors = this.factors(numberToEvaluate);
        System.out.println(listOfFactors);
        listOfPrimeFactors = this.listOfPrimeLongFactors(listOfFactors);
        System.out.println(listOfPrimeFactors);
        largestPrimeFactor = this.largestLongNumber(listOfPrimeFactors);
        System.out.println(largestPrimeFactor);
       
        //Find the factors of a number.
            //return an arraylist
        //Find out which factors are primes
            //return an arraylist
        //Select the largest prime factor
        
        return largestPrimeFactor;
    }
    
    /**
     * Optimizes the search time trying to look for the largest prime factor of a number.
     * Receives no parameters, so it uses the default value.
     * @return Returns the largest prime factor of a number.
     */
    public long largestPrimeFactorQuick(){
        long largestPrimeFactor = 0L;
        for (long i = this.number; i > 0; i--) {
           if (this.isFactor(this.number, i)){
                if (this.isPrime(i)) {
                   largestPrimeFactor = i;
                System.out.println(largestPrimeFactor);
                break;
                }
            } 
        }
        return largestPrimeFactor;
    }
    
    /**
     * Optimizes the search time trying to look for the largest prime factor of a number.
     * @param l The long integer to be evaluated.
     * @return Returns the largest prime factor of a number.
     */
    public long largestPrimeFactorQuick(long l){
        long largestPrimeFactor = l;
        for (long i = l; i > 0; i--) {
            if (this.isFactor(l, i)) {
                //System.out.println(i + " is a factor");
                if (this.isPrime(i)) {
                    //System.out.println(i + " is prime!");
                    System.out.println(i);
                    largestPrimeFactor = i;
                    break;
                }
            }
        }

        return largestPrimeFactor;
    }
    //FACTOR EVALUATION
    /**
     * Evaluates whether an integer number is a factor of another.
     * @param number The integer number for which a factor is being looked for.
     * @param possibleFactor The integer number to be evaluated as factor of "number".
     * @return Returns true if the possibleFactor is a factor of "number". 
     *         Returns false if it is not.
     */
    public boolean isFactor(int number, int possibleFactor){
        return number%possibleFactor == 0;
    }

    /**
     * Evaluates whether a long number is a factor of another.
     * @param number The long number for which a factor is being looked for.
     * @param possibleFactor The long number to be evaluated as factor of "number".
     * @return Returns true if the possibleFactor is a factor of "number". 
     *         Returns false if it is not.
     */
    public boolean isFactor(long number, long possibleFactor){
        return number%possibleFactor == 0;
    }

    //FACTOR LIST
    /**
     * Creates an ArrayList of type Integer factors for the number given. 
     * Admits integer numbers.
     * @param number The integer number being evaluated.
     * @return The ArrayList of factors.
     */
    public ArrayList factors (int number){
        ArrayList<Integer> listOfFactors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (this.isFactor(number, i)) {
                listOfFactors.add(i);
            }
        }
        //Print the list of factors.
//        for (int factor : listOfFactors) {
//            System.out.println(factor);
//        }
        return listOfFactors;
    }
    
    /**
     * Creates an ArrayList of type Long of factors for the number given. 
     * Admits long numbers.
     * @param number The long number being evaluated.
     * @return The ArrayList of factors.
     */
    public ArrayList factors (long number){
        ArrayList<Long> listOfFactors = new ArrayList<>();
        for (long i = number; i >= 1; i--) {
            if (this.isFactor(number, i)) {
                listOfFactors.add(i);
           }
        }
        //Print the list of factors.
//        for (long factor : listOfFactors) {
//            System.out.println(factor);
//        }
        return listOfFactors;
    }
    
    //PRIME EVALUATION
    /**
     * Evaluates whether an integer is prime.
     * @param number: The integer to be evaluated
     * @return Returns true if the integer is prime and false if it is not.
     */
    public boolean isPrime(int number){
        int factorsCount = 0;
        for (int i = 1; i <= number; i++) {
            if (isFactor(number, i)) {
                factorsCount++;
            }
        }
        /* Visual feedback
        if (factorsCount == 2) {
            System.out.println(number + " is prime. Factors: " + factorsCount);
        } else {
            System.out.println(number + " is not prime. Factors  " + factorsCount);
        }*/
        return factorsCount == 2;
      }
    
    /**
     * Evaluates whether a long is prime.
     * @param number: The long number to be evaluated.
     * @return Returns true if the number is prime.
     * Returns false if the number is not prime.
     */
    public boolean isPrime(long number){
        int factorsCount = 0;
        for (long i = number; i >= 1; i--) {
            if (isFactor(number, i)) {
                factorsCount++;
            }
        }
        return factorsCount == 2;
    }

    /**
     * Evaluates whether a long is prime. Showing a number by number evaluation.
     * @param number: The long to be evaluated.
     * @return Returns true if the long is prime and false if it is not.
     */
    public boolean isPrime_verbose(long number){
        int factorsCount = 0;
        for (long i = number; i >= 1; i--) {
//            if (isFactor(number, i)) {
//                System.out.println(i + " is a factor of " + number);
                factorsCount++;
//            }
//            else
//                System.out.println(i + "is NOT a factor");
        }
        return factorsCount == 2;
    }
    
    //PRIME LIST
    /**
     * Evaluates which factors of a list of long factors are prime numbers.
     * @param listOfFactors A list of long number factors to be evaluated.
     * @return A list of long number prime factors
     */
    public ArrayList listOfPrimeIntegerFactors(ArrayList<Integer> listOfFactors){
        ArrayList<Integer> listOfPrimeFactors = new ArrayList<>();
        for (int factor : listOfFactors) {
            if (this.isPrime(factor)) {
                listOfPrimeFactors.add(factor);
            }
        }
        return listOfPrimeFactors;
    }

    /**
     * Evaluates which factors of a list of long factors are prime numbers.
     * @param listOfFactors A list of long number factors to be evaluated.
     * @return A list of long number prime factors
     */
    public ArrayList listOfPrimeLongFactors(ArrayList<Long> listOfFactors){
        ArrayList<Long> listOfPrimeFactors = new ArrayList<>();
        for (Long factor : listOfFactors) {
            if (this.isPrime(factor)) {
                listOfPrimeFactors.add(factor);
            }
        }
        return listOfPrimeFactors;
    }
    
    //LARGEST NUMBER
    /**
     * Finds the largest number from a list of long numbers.
     * @param numberList The list of integer numbers to evaluate.
     * @return The largest number from the list.
     */
    public int largestIntNumber(ArrayList<Integer> numberList){
        int largestNumber = 0;
        for (int i : numberList) {
            if (i >= largestNumber) {
                largestNumber = i;
            }
        }
        return largestNumber;
    }

    /**
     * Finds the largest number from a list of long numbers.
     * @param numberList The list of long numbers to evaluate.
     * @return The largest number from the list.
     */
    public long largestLongNumber(ArrayList<Long> numberList){
        long largestNumber = 0;
        for (Long l : numberList) {
            if (l >= largestNumber) {
                largestNumber = l;
            }
        }
        return largestNumber;
    }
}