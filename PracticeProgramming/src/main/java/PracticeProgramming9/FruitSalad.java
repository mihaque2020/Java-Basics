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
public class FruitSalad {
    public static void main(String[] args) {
        
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry",
            "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",
            "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", 
            "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        
        
        // as many berries as possible no need to count
        int apples = 0; // want 3 max
        int oranges = 0; // max 2
        int kinds = 0; // max 12 kinds
        int index = 0; // index of fruit list that included in salad
        
        String[] fruitSalad = new String[11];
        
        for (int i = 0; i < fruit.length; i++) {
            
            if (kinds == 12) {
                break;
            }
            if (fruit[i].contains("berry")) {
                kinds++;
                fruitSalad[index] = fruit[i];
                index++;
                
            } else if (fruit[i].contains("Apple") && apples < 3) {
                apples++;
                kinds++;
                fruitSalad[index] = fruit[i];
                index++;
                
            } else if (fruit[i].contains("Orange") && oranges < 2) {
                oranges++;
                kinds++;
                fruitSalad[index] = fruit[i];
                index++;
            }
        }
        
        System.out.println("There are " + kinds + " kinds of fruit in your salad!");
        for (int i = 0; i < fruitSalad.length; i++) {
            System.out.println(fruitSalad[i]);
        }
        
        
        
        
    }
}
