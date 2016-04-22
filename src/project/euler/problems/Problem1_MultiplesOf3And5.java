/*
 * Problem 1: Multiples of 3 and 5 - Project Euler.net
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
package project.euler.problems;

/**
 *
 * @author Randy
 */


public class Problem1_MultiplesOf3And5 {
    
    
    private int firstInteger = 3;
    private int secondInteger = 5;
    private int treshold = 1000;
    private int sum = 0;

    
    //Constructors:

    /**     * 
     * @param firstInt The first int whose multiples will be used.
     * @param secondInt The second int whose multiples will be used.
     * @param treshold The number which all multiples of firstInt and secondInt must be less than.
     */
    public Problem1_MultiplesOf3And5(int firstInt, int secondInt, int treshold) {
        this.firstInteger = firstInt;
        this.secondInteger = secondInt;
        this.treshold = treshold;
    }

    /**
     * Uses the default parameters:
     * firstInteger = 3
     * secondInteger = 5
     * boundary = 1000
     */
    public Problem1_MultiplesOf3And5() {
    }
    
    //Getters and Setters:
    public int getFirstInteger() {
        return firstInteger;
    }

    public void setFirstInteger(int firstInteger) {
        this.firstInteger = firstInteger;
    }

    public int getSecondInteger() {
        return secondInteger;
    }

    public void setSecondInteger(int secondInteger) {
        this.secondInteger = secondInteger;
    }

    public int getTreshold() {
        return treshold;
    }

    public void setTreshold(int treshold) {
        this.treshold = treshold;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    
     
    /**
     * Calculates the sum of all the multiples 
     * @return 
     */
    public void calculate(){
        String resultado;
        System.out.println("Calculando la suma de los múltiplos de " + 
                this.firstInteger + " más los múltiplos de " + 
                this.secondInteger + " menores a " + 
                this.treshold + "...");
        for (int i = 0; i < this.treshold; i++) {
            if (i%this.firstInteger == 0 || i%this.secondInteger == 0) {
                this.sum = this.sum + i;
            }
        }
        System.out.println("...");
        System.out.println(" La suma total es " + this.sum);
    }
}