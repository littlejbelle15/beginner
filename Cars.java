/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtual.world;

import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Cars {
    public static void main(String[] args) {
        // Initiate a new Scanner
        Scanner userInputScanner = new Scanner(System.in);
 
        // Testing nextLine();
        System.out.print("What is your name? ");
        String name = userInputScanner.nextLine();
 
        // Testing nextInt();
        boolean validInput = false;
        int numberOfCars = 0;
        while (!validInput) {
            System.out.print("How many cars do you have? ");
            try {
                numberOfCars = userInputScanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                validInput = false;
                userInputScanner.nextLine();
            }
        }
 
        // Testing nextDouble();
        validInput = false;
        double moneyInWallet = 0.0;
        while (!validInput) {
            System.out.print("How much money is in your wallet? $");
            try {
                moneyInWallet = userInputScanner.nextDouble();
                userInputScanner.nextLine();
                validInput = true;
            } catch (InputMismatchException e) {
                validInput = false;
                userInputScanner.nextLine();
            }
        }
 
        System.out.println("Hello " + name + "! You have " + numberOfCars
                + (numberOfCars > 1 ? " cars" : "car")
                + " and $" + moneyInWallet + " in your wallet. Better start saving for another one!! Enjoy your ride.");
    }
}

