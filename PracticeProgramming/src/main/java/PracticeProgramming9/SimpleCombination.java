/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming9;

/**
 *
 * @author Minul
 */
public class SimpleCombination {
    public static void main(String[] args) {
        
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!
        
        int[] wholeNumbers = new int[firstHalf.length + secondHalf.length];
        
        for (int i = 0; i < firstHalf.length; i++) {
            
            wholeNumbers[i] = firstHalf[i];
            wholeNumbers[firstHalf.length + i] = secondHalf[i];
            
        }
       
        for (int i = 0; i < wholeNumbers.length; i++) {
            System.out.print(wholeNumbers[i] + " ");
        }
                    
    }
}
