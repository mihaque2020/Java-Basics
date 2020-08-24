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
public class BirthStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(sc.nextLine());
        
        while (num < 1 || num > 12) {
            System.out.println("ERROR ENTER A VALID MONTH: ");
            num = Integer.parseInt(sc.nextLine());
        }
        
        switch(num) {
            
            case 1:
                System.out.println("January	Garnet");
                break;
            case 2:
                System.out.println("February	Amethyst");
                break;
            case 3:
                System.out.println("March	Aquamarine");
                break;
            case 4: 
                System.out.println("April	Diamond");
                break;
            case 5:
                System.out.println("May	Emerald");
                break;
            case 6:
                System.out.println("June	Pearl");
                break;
            case 7:
                System.out.println("July	Ruby");
                break;
            case 8:
                System.out.println("August	Peridot");
                break;
            case 9:
                System.out.println("September	Sapphire");
                break;
            case 10:
                System.out.println("October	Opal");
                break;
            case 11:
                System.out.println("November	Topaz");
                break;
            case 12:
                System.out.println("December	Turquoise");
                break;
        }
    }
}
