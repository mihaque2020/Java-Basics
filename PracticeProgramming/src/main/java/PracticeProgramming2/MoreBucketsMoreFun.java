/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming2;

/**
 *
 * @author Minul
 */
public class MoreBucketsMoreFun {
    public static void main(String[] args) {
        
        // Declare all things and best to do it at beginning of program;
        int butterflies, beetles, bugs;
        
        butterflies = 5;
        beetles = 9;
        
        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all");
        
        System.out.println("Uh oh, my dog ate one.");
        butterflies--; // using -- unary operator to show dog at the bug
                       // number of bugs doesnt change because it is a separate variable and was not decremented
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But there still " + bugs + " bugs left...");
        System.out.println("Wait a minute!");
        System.out.println("... maybe my computer can't do math, after all!");
   
    }
}
