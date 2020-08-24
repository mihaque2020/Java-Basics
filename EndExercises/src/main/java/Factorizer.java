
import java.util.ArrayList;
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
public class Factorizer {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int factorCount = 0;
        int factorSum = 0;
        
        System.out.print("What number would you like to factor? ");
        int num = Integer.parseInt(sc.nextLine());
        
        ArrayList<Integer> factorList = new ArrayList<Integer>();
        
        for (int i = 1; i <= num; i++) {
            
            if (num % i == 0) {
                factorCount++;
                factorList.add(i);
            }
        }
        
        factorSum = sumFactors(num, factorList);
        
        if (factorSum == num) {
            printFactors(factorList);
            isPerfect(num, factorCount);
        } else if (factorSum == num + 1) {
            printFactors(factorList);
            isPrime(num);
        } else {
            printFactors(factorList);
            isOther(num, factorCount);
        }
    }
               
    public static int sumFactors(int num, ArrayList<Integer> arrayList) {
        int sum = 0;
        System.out.println("The factors of " + num + " are: ");
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        sum -= num;
        return sum;
    }
    
    public static void isPerfect(int num, int factorCount) {
        System.out.println(num + " has " + factorCount + " factors.");
        System.out.println(num + " is a perfect number.");
        System.out.println(num + " is not a prime number.");
    }

    public static void isPrime(int num) {
        System.out.println(num + " has 2 factors.");
        System.out.println(num + " is not a perfect number.");
        System.out.println(num + " is a prime number.");
    } 
    
    public static void isOther(int num, int factorCount) {
        System.out.println(num + " has " + factorCount + " factors.");
        System.out.println(num + " is not a perfect number.");
        System.out.println(num + " is not a prime number.");
    }
    
    public static void printFactors(ArrayList<Integer> factors) {
        for (int i = 0; i < factors.size(); i++){
            System.out.print(factors.get(i) + " ");
        }
        System.out.println("");
    } 
}
