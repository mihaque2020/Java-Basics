/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming7;

import java.util.Scanner;

/**
 *
 * @author Minul
 */
public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many units of fizzing and buzzing do you need in your life? ");
        int count = Integer.parseInt(sc.nextLine());
        int num = 0;
        
        while (count > 0) {
            
            if (num == 0) {
                System.out.println(num);
                num++;
            } else if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("fizz buzz");
                count--;
                num++;
            } else if (num % 3 == 0) {
                System.out.println("fizz");
                count--;
                num++;
            } else if (num % 5 == 0) {
                System.out.println("buzz");
                count--;
                num++;
            } else {
                System.out.println(num);
                num++;
            }
        }
        System.out.println("TRADITION!!!!!");
    }
}
