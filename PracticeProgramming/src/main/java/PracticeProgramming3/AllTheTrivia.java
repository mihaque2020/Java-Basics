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
public class AllTheTrivia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans1, ans2, ans3, ans4;
        
        System.out.print("What unit is equivalent to 1,024 Gigabytes? ");
        ans1 = sc.nextLine();
        System.out.print("Which planet is the only one that rotates clockwise in our Solar System? ");
        ans2 = sc.nextLine();
        System.out.print("The largest volcano ever discovered in our Solar System is located on which planet? ");
        ans3 = sc.nextLine();
        System.out.print("What is the most abundant element in the earth's atmosphere? ");
        ans4 = sc.nextLine();
        
        System.out.println("");
        
        System.out.println("Wow, 1,024 Gigabytes is a " + ans3);
        System.out.println("I didn't know that the largest ever volcano was discovered on " + ans1);
        System.out.println("That's amazing that " + ans2 + " is the most abundant element in the atmosphere...");
        System.out.println(ans4 + " is the only planet that rotates clockwise, neat!");
    }
}
