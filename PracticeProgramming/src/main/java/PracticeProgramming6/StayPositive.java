/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming6;

import java.util.Scanner;

/**
 *
 * @author Minul
 */
public class StayPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        System.out.println("");
        int num = Integer.parseInt(sc.nextLine());
        
        System.out.println("Counting Down...");
        
        int i = 0;
        while (num >= 0) {
            if (i == 10) {
                System.out.println("");
                i = 0;
            }
            
            System.out.print(num + " ");
            num--;
            i++;
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Blast Off!");
    }
}
