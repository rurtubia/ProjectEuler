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
 * Problem 4: Largest palindrome product
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * @author Randy
 */
public class Problem4_LargestPalindromeProduct {
    
    /**
     * SLOW APPROACH
     * 
     * Find all products of two 3-digit numbers
     * Store them in an ArrayList
     * Evaluate all the products of the ArrayList to find which ones are palindromes
     * Store them in a second ArrayList
     * Find the largest palindrome in the list.
     */
    
    /**
     * Multiplies all combinations of 3-digit numbers.
     * @return Returns the list of all products of 3-digit numbers.
     */
    public ArrayList<Integer> getProducts(){
        ArrayList<Integer> productsList = new ArrayList<>();
        for (int i = 999; i >= 111; i--) {
            for (int j = 999; j >= 111; j--) {
                int product = i*j;
                productsList.add(product);
            }
        }
        return productsList;
    }
    
    /**
     * Adds all products which are palindromes to the palindromes ArrayList.
     * @param products A list of products to be evaluated.
     * @return A list of palindromes.
     */
    public ArrayList<Integer> getPalindromes(ArrayList<Integer> products){
        ArrayList<Integer> palindromes = new ArrayList<>();
        for (Integer product : products) {
            if (this.isPalindrome(product)) {
                palindromes.add(product);
            }
        }
        return palindromes;
    }
    
    /**
     * Finds the largest palindrome from a set
     * @param palindromes an ArrayList of Palindrome Products.
     * @return Returns the largest palindrome in the ArrayList.
     */
    public int findLargestPalindrome (ArrayList<Integer> palindromes){
        int largestPalindrome = 0;
        for (Integer palindrome : palindromes) {
            if (palindrome > largestPalindrome) {
                largestPalindrome = palindrome;
            }
        }
        return largestPalindrome;
    }
    
    public int findLargestPalindromeSlow (){
        return (findLargestPalindrome(this.getPalindromes(this.getProducts())));
    }
    
    /**
     * QUICK APPROACH
     * 
     * Loop:
     *      Find the product of the largest two 3-digit numbers
     *          Evaluate if it is a palindrome
     *              If it is
     *                  break
     *              If it isn't
     *                  repeat.
     */
    
    /**
     * Finds each product of two 3-digit numbers, starting from the largest 3-digit numbers.
     * Evaluates whether the product of the two 3-digit numbers is a palindrome.
     * Returns the first palindrome it finds and breaks the loop.
     * @return The largest palindrome product found.
     */
    public int findLargestPalindromeQuick(){
        int largestPalindrome = 0;
        for (int i = 999; i >= 111; i--) {
            for (int j = 999; j >= 111; j--) {
                int product = i*j;
                if (isPalindrome(product)) {
                    if (product > largestPalindrome) {
                        largestPalindrome = product;
                        break;
                    }
                }
            }
            
        }
        return largestPalindrome;
    }
    
    //GENERIC FUNCTIONS
    /**
     * Determines if a number is a Palindrome. 
     * Converts the number into a String, then reverses the String and compares both.
     * @param number The number to be evaluated.
     * @return Returns true if the number is a palindrome. Returns false if the number is not a palindrome.
     */
    public boolean isPalindrome (int number){
        boolean result = false;
        //System.out.println(number);
        //Transforms the number to a String
        String numberToString = String.valueOf(number);
        //Creates a new String with the reversed values of the first one.
        String reverseNumberToString = new StringBuilder(numberToString).reverse().toString();
        //Compares both Strings.
        if (numberToString.equals(reverseNumberToString)) {
            result = true;
        }
        return result;
    }
    
    /**
     * Finds the largest number in an ArrayList
     * @param numbers
     * @return 
     */
    public int findLargestNumber (ArrayList<Integer> numbers){
        int largestNumber = 0;
        ArrayList<Integer> numberList = numbers;
        for (Integer number : numberList) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }
        return largestNumber;
    }
}
