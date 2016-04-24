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

/**
 * Problem 5: Smallest Multiple.
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * @author Randy
 */
public class Problem5_SmallestMultiple {
    //SLOW APPROACH
    //loop while a condition is false
        //for each number, starting from MaxNumber (20)
            //get the reminder from 1 to MaxNumber
            //count the number of times the reminder is 0
            //if the reminder is 0 the as many times as the value of the number evaluated
                //set the condition to true
    
    private boolean isSmallestFound = false;
    private int maxNumber;

    /**
     * 
     * @param maxNumber 
     */
    public Problem5_SmallestMultiple(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    /**
     * 
     */
    public Problem5_SmallestMultiple() {
        maxNumber = 20;
    }

    public boolean isIsSmallestFound() {
        return isSmallestFound;
    }

    public void setIsSmallestFound(boolean isSmallestFound) {
        this.isSmallestFound = isSmallestFound;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
    
    /**
     * 
     * @return 
     */
    public int findSmallestMultiple(){
        int smallestMultiple = 0;
        int number = maxNumber;
        while (!isSmallestFound) {
            int noRemaindersCount = 1;
            noRemaindersCount = countNoRemainders(number, noRemaindersCount);
            smallestMultiple = compareNoRemaindersToMaxNumber(noRemaindersCount, smallestMultiple, number);
            number++;
        }
        System.out.println(smallestMultiple);
        return smallestMultiple;
    }
    
    /**
     * 
     * @param maxNumber
     * @param number
     * @param noRemaindersCount
     * @return 
     */
    private int countNoRemainders(int number, int noRemaindersCount) {
        for (int i = 2; i <= this.maxNumber; i++) {
            if (number%i==0)
                noRemaindersCount++;
            else
                break;
        }
        return noRemaindersCount;
    }

    /**
     * 
     * @param noRemaindersCount
     * @param maxNumber
     * @param smallestMultiple
     * @param number
     * @return 
     */
    private int compareNoRemaindersToMaxNumber(int noRemaindersCount, int smallestMultiple, int number) {
        if (noRemaindersCount==this.maxNumber) {
            smallestMultiple = number;
            isSmallestFound = true;
        }
        return smallestMultiple;
    }
}
