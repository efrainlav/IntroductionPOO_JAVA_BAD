/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroPOO_JAVA;
import java.util.Date;

/**
 * Person Class with basic attributes
 * @author EFRAIN LAVERDE
 */
public class Person {
    
    //Attributes
    
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    
    //Constructor
    /**
     * 
     * @param name First name of the person
     * @param lastName1 First Last name of the person
     * @param lastName2 Second last name of the person
     */
    public Person(String name, String lastName1, String lastName2){
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
    }
    
    //Methods
    
        /**
     * Method to set the name
     * @param name First Name of the person 
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Method to get the name
     * @return Name of the person with the two last name
     */
       
    public String getName(){
        return "Name: " + name + "\nlastName1: " + lastName1;        
    }
    
}
