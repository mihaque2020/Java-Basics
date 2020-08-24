
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minul
 */
public class WindowMaster {
    public static void main(String[] args) {
        // variables for dimensions
        float height;
        float width;
        
        // String variables to pull user input
        String stringHeight;
        String stringWidth;
        
        // Calculation variables;
        float areaOfWindow;
        float costOfWindow;
        float perimeterOfWindow; 
        
        Scanner myScanner = new Scanner(System.in);
        
        // Get user inputs
        System.out.println("Please enter Window height:");
        stringHeight = myScanner.nextLine();
        
        System.out.println("Please enter Window width:");
        stringWidth = myScanner.nextLine();
        
        // Convert string to float
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        // Calculations
        areaOfWindow = height * width;
        perimeterOfWindow = 2 *(height + width);
        costOfWindow = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + costOfWindow);
        
    }
}
