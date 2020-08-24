/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming4;

import java.util.Scanner;

/**
 *
 * @author Minul
 */
public class GuessMe {
    public static void main(String[] args) {
        int num = 12;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.print("Your Guess: ");
        int userChoice = Integer.parseInt(sc.nextLine());
        
        if (userChoice == num) {
            System.out.println("Wow, nice guess! That was it!");
        } else if (userChoice < num) {
            System.out.println("Ha, nice try - too low! I chose " + num);
        } else {
            System.out.println("Too bad, way too high. I chose " + num);
        }
    }
}
