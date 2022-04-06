/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroPOO_JAVA;
import java.util.ArrayList;



/**
 *Fruit class with some basic attributes
 * @author EFRAIN LAVERDE
 */
public class Fruit {
    
    //Attributes

    public String name;
    private float averageWeight;
    public ArrayList<String> colors = new ArrayList<>();
    public String color;
    
    
    //Constructors
    /**
     * Fruit constructor
     * @param name Name of the fruit
     * @param averageWeight Average weigth of teh fruit giving in pounds
     */
    public Fruit(String name, float averageWeight){
        this.name = name;
        this.averageWeight = averageWeight;
    } 
    
    
    
    //Methods
    
    /**
     * Methods to set the color of the fruit
     * @param name Name of the fruit
     * @param color Color to add to the list of colors for that fruit
     */

    public void setColor(String name, String color){
        if(this.name.equals(name)){
            this.colors.add(color);
        }else{
            System.out.println("The fruit: " + name + " doesn't exit.");
            
        }
    }   
        
    /**
     * 
     * @return Return the colors values for the fruit
     */

    public ArrayList<String> getColors() {
        return colors;
    }
    
    /**
     * 
     * @return Return the name of the fruit
     */

    public String getName() {
        return name;
    }
     


}
