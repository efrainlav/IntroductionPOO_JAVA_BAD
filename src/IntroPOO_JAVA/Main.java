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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ball p = new Ball(300,300);
        Ball pB = new Ball(500,500);
        System.out.println("The ball weigth is:" + pB.obtenerPeso());
        
        Fruit m = new Fruit("Apple", (float) 5.3);
        System.out.println("The fruit is:" + m.name); 
        
        m.setColor("Manzana", "Red");
        System.out.println("The fruit is:" + m.name + ", and their colors are " + m.getColors()); 
        
        m.setColor("Manzana", "Yellow");
        System.out.println("The fruit is:" + m.name + ", and their colors are " + m.getColors());       
        
        m.setColor("Pear", "Yellow");
        
        Pet Pet1 = new Pet("Misifu", "cat");
        System.out.println(Pet1.name + " is an adorable " + Pet1.species);
        System.out.println(Pet1.species);        
        Pet1.bark((String)Pet1.species);    
        
            
        Pet Pet2 = new Pet("Scooby", "dog");
        System.out.println(Pet2.name + " is an adorable " + Pet2.species);   
        Pet2.bark((String)Pet2.species);     
       
        
    }
    
    
    
}
