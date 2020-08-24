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
public class PassingTheTuringTest {
    public static void main(String[] args) {
        String name, color, food;
        int  number;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hello there!");
        System.out.print("What's your name? ");
        name = sc.nextLine();
        System.out.println("");
        
        System.out.println("Hi, " + name + "!  I'm Alice." );
        System.out.print("What's your favoirte color? ");
        color = sc.nextLine();
        System.out.println("");
        
        System.out.println("Huh, " + color + "? Mine's Electric Lime.");
        System.out.println("");
        
        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.print("What's YOUR favorite fruit, " + name + "? ");
        food = sc.nextLine();
        System.out.println("");
        
        System.out.println("Really? " + food + "? That's wild!");
        System.out.print("Speaking of favorites, what's your favorite number? ");
        number = Integer.parseInt(sc.nextLine());
        System.out.println("");
        
        System.out.println(number + " is a cool number. Mine's -7.");
        int product = number * -7;
        System.out.println("Did you know " + number + " * -7 is " + product + "? That's a cool number too!");
        System.out.println("");
        
        System.out.println("Well, thanks for talking to me, " + name + "!");
        
    }
}
