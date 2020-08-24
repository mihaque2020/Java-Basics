/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming2;

/**
 *
 * @author Minul
 */
public class MenuOfChampions {
    public static void main(String[] args) {
        
        String app, entree, side, desert;
        
        double appPrice, entreePrice, sidePrice, desertPrice;
        
        app = "Mozarella Sticks";
        entree = "Steak";
        side = "Salad";
        desert = "Cheesecake";
        
        appPrice = 7.89;
        entreePrice = 24.50;
        sidePrice = 7.00;
        desertPrice = 11.56;
        
        System.out.println("WELCOME TO KING RESTAURANT!");
        System.out.println("Today's Menu Is...");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("$" + appPrice + " **** " + app);
        System.out.println("$" + entreePrice + " **** " + entree);
        System.out.println("$" + sidePrice + " **** " + side);
        System.out.println("$" + desertPrice + " **** " + desert);
    }
}
