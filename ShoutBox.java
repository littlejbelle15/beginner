/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtual.world;

/**
 *
 * @author jamie.miles
 */
//defines the scanner method so users can input data
import java.util.Scanner;

public class ShoutBox {

     public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//Decide the number of friends
                //Parse allows the integer entered to be a seperate piece.
		System.out.print("Enter how many friends: ");
		int numOfFriends = Integer.parseInt(scan.nextLine());
		//Create a string array to store the names of your friends
		String arrayOfNames[] = new String[numOfFriends];
                
                //For loop allows user to input a name and save it in an index.
		for (int i = 0; i < arrayOfNames.length; i++) {
			System.out.print("Enter the name of friend " + (i+1) + " : ");
		        arrayOfNames[i] = scan.nextLine();
		}		    
		//Now show your friend's name one by one
		for (int i = 0; i < arrayOfNames.length; i++) {
// These are the results for each array that was entered. 
			System.out.print("My friend " + (i+1) + " : ");
		        System.out.print(arrayOfNames[i] + "\n");
		}
     }
}