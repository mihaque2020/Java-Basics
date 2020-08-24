/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming3;

import java.util.Scanner;

/**
 *
 * @author Minul
 */
public class DoItBetter {
    public static void main(String[] args) {
        int miles, hotDogs, languages;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many miles can you run? ");
        miles = 2 * Integer.parseInt(sc.nextLine()) + 1;
        System.out.println("Well I can run " + miles);
        System.out.print("How many hot dogs can you eat? ");
        hotDogs = 2 * Integer.parseInt(sc.nextLine()) + 1;
        System.out.println("Well I can eat " + hotDogs);
        System.out.print("How many languages can you speak? ");
        languages = 2 * Integer.parseInt(sc.nextLine()) + 1;
        System.out.println("Well I know " + languages);
    }
}
