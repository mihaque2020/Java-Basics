/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Minul
 */
public class GuessMeMore {
    public static void main(String[] args) {
        int guess, number;
        Random rng = new Random();
        
        number = rng.nextInt(201) - 100;       
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        System.out.print("Your Guess: ");
        guess = Integer.parseInt(sc.nextLine());
        
        if (guess == number) {
            System.out.println("Wow, nice guess! That was it!");
        } else {
            System.out.println("Ha, nice try - too low! Try again!");
            System.out.print("Your Guess: ");
            guess = Integer.parseInt(sc.nextLine());
        }
        
        if (guess == number) {
            System.out.println("Wow, nice guess! That was it!");
        } else {
          System.out.println("Sorry thats wrong, you lose!");      
        }
    }
}
