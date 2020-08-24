/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming8;

import java.util.Random;

/**
 *
 * @author Minul
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {
        
        String color = getRandomColor(); // call color method here
        String animal = getRandomAnimal(); // call animal method again here
        String colorAgain = getRandomColor(); // call color method again here
        int weight = getRandomNumber(5, 200); // call number method,
            // with a range between 5 - 200
        int distance = getRandomNumber(10, 20); // call number method,
            // with a range between 10 - 20
        int number = getRandomNumber(10000, 20000); // call number method,
            // with a range between 10000 - 20000
        int time = getRandomNumber(2, 6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
        
    }
    
    public static String getRandomColor(){
        Random rng = new Random();
        
        int number = rng.nextInt(6);
        
        switch(number) {
            case 0:
                return "blue";
            case 1: 
                return "red";
            case 2: 
                return "yellow";
            case 3:
                return "green";
            case 4:
                return "orange";
            case 5:
                return "pink";
        }
        return "None";
    }
    
    public static String getRandomAnimal() {
        Random rng = new Random();
        
        int number = rng.nextInt(6);
        
        switch(number) {
            case 0:
                return "giraffe";
            case 1: 
                return "shark";
            case 2: 
                return "bird";
            case 3:
                return "lizard";
            case 4:
                return "tiger";
            case 5:
                return "dog";
        }
        return "None";
    }
    
    public static int getRandomNumber(int min, int max) {
        Random rng = new Random();
        
        int number = rng.nextInt((max - min) + 1) + min;
        
        return number;
    }
    
    
    
}
