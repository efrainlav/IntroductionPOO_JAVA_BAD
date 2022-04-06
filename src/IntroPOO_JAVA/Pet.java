/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroPOO_JAVA;

/**
 *
 * @author EFRAIN LAVERDE
 */
public class Pet {
   //Attributes
   public String name;
   public String species;
   public int age;
   
    //Constructors
    /**
     * Pet constructor
     * @param name Name of the pet
     * @param species kind of species of the Pet
     */
   public Pet(String name, String species){
       this.name = name;
       this.species = species;
       
   }
   
   public void play(){
       System.out.println("Playing with " + name + "!");
   }
   
   public void pet(){
      
      System.out.println("Petting the pet " + name + "!"); 
   }
   
   public void bark(String specie){
       if(this.species.equals("dog")){
            System.out.println("Bark, Bark!!!");           
       }else{
            System.out.println("The " + species + " doesn't bark.");           
       }
   }
   
   
   
    
}
