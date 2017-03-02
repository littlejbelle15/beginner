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
public class CannedShoutout {
    private static int i;

public static void main (String[] args) { //start of program.


   // create an array of strings
 String strState[] = new String[4]; //declaring array of four items
 
              strState[0] ="North Carolina is beautiful.";
 
              strState[1] ="Texas is huge territory.";
 
              strState[2] ="Florida is hot.";
             
              strState[3] ="Vermont loves snow.";
              
//Printing array
              for (i=1; i<=4; i++)
                       System.out.println(strState[i]);
}
}