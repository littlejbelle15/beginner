/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtual.world;

public class MyClone {
    private  String firstName;
    private  String lastName;

//Constructor method

    /**
     *
     * @param firstName
     * @param lastName
     */
       public MyClone(String firstName, String lastName){
     this.firstName = firstName;
     this.lastName = lastName;
        } 
 //Accessor for firstName
  public String getFirstName(){
     return firstName;
   }
    //Accessor for lastName
   public String getLastName()
   {
     return lastName;  
 }
//Mutator for firstName
  public void setfirstName(String firstName)
   {
     this.firstName = firstName;
   } 
    //Mutator for lastName
   public void setlastName(String lastName)
   {
     this.lastName = lastName;
    }
   {
       System.out.println("Name: " +firstName+ " "+lastName);
   }
   }
 