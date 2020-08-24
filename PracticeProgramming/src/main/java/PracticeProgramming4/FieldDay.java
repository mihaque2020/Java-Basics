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
public class FieldDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        
        if (name.compareToIgnoreCase("Baggins") < 0) {
            System.out.println("Aha! You're on the team 'Red Dragons'!");
        } else if (name.compareToIgnoreCase("Baggins") > 0 && name.compareToIgnoreCase("Desden") < 0) {
            System.out.println("Aha! You're on the team 'Dark Wizards'!");
        } else if (name.compareToIgnoreCase("Dresden") > 0 && name.compareToIgnoreCase("Howl") < 0){
            System.out.println("Aha! You're on the team 'Moving Castles'!");
        } else if (name.compareToIgnoreCase("Howl") > 0 && name.compareToIgnoreCase("Potter") < 0){
          System.out.println("Aha! You're on the team 'Golden Snitches'!");   
        } else if (name.compareToIgnoreCase("Potter") > 0 && name.compareToIgnoreCase("Vimes") < 0){
          System.out.println("Aha! You're on the team 'Night Guards'!");  
        } else if (name.compareToIgnoreCase("Vimes") > 0){
            System.out.println("Aha! You're on the team 'Black Holes'!");
        }
        System.out.println("Good luck in the games!");
    }
}
