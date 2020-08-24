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
public class YourLifeInMovies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Hey, let's play a game! What's your name? ");
        String name = sc.nextLine();
        
        System.out.print("Ok, " + name + ", when were you born? ");
        int birthYear = Integer.parseInt(sc.nextLine());
        
        System.out.println("Well " + name + "...");
        
        if (birthYear < 2005) {
            System.out.println("Pixar's 'Up' came out over a decade ago.");
        }
        if (birthYear < 1995) {
            System.out.println("the first Harry Potter came out over 15 years ago.");
        }
        if (birthYear < 1985) {
            System.out.println("Space Jam came out not last decade, but the one before THAT.");
        }
        if (birthYear < 1975) {
            System.out.println("the original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
        if (birthYear < 1965) {
            System.out.println("the MASH TV series has been around for almost half a century!");
        }
        
    }
}
