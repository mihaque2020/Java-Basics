/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming9;

/**
 *
 * @author Minul
 */
public class FruitsBasket {
    public static void main(String[] args) {
        
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};
        
        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;
        
        for (int i = 0; i < fruitBasket.length; i++) {
            
            if (fruitBasket[i].equals("Orange")) {
                numOranges++;
            } else if (fruitBasket[i].equals("Apple")) {
                numApples++;
            } else {
                numOtherFruit++;
            }
        }
        
        System.out.println("Total Fruit: " + fruitBasket.length);
        System.out.println("Oranges: " + numOranges);
        System.out.println("Apples: " + numApples);
        System.out.println("Other Fruits: " + numOtherFruit);
    }
}
