/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroPOO_JAVA;

/**
 *Ball class with some basic attributes
 * @author EFRAIN LAVERDE
 */
public class Ball {
    //Attributes
    float radio;
    float weight;
   
    //Constructors
    public Ball()
    {
        radio=100;
        weight=250;
    }
    
    public Ball(float radio, float weight)
    {
        this.radio=radio;
        this.weight=weight;
    }
    
    
    //Methods
    public float obtenerRadio()
    {
        return radio;
    }
    
    public float obtenerPeso()
    {
        return weight;
    }
    
   
}
