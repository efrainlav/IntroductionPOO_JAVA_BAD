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
public class Car {
    //Attributes
    int idCar;
    double weight;
    double height;
    double size;
    int numberDoor;
    String model;
    int speed;
    
    //Constructors 
    /**
     * Car constructor
     * @param idCar
     * @param model 
     */
    public Car(int idCar, String model){
        this.idCar = idCar;
        this.model = model;
    }
    
    //Methods
    /**
     * Get the id of the car
     * @return identification of the car
     */
    public int getIdCar() {
        return idCar;
    }
    /**
     * Set the id of the car
     * @param idCar identification of the car
     */
    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }
    
    /**
     * Get the model of the car
     * @return model of the car
     */
    public String getModel() {
        return model;
    }
    
    /**
     * Set the model of the car
     * @param model of the car
     */
    public void setModel(String model) {
        this.model = model;
    }    
    
    /**
     * Method to increase the speed of the car
     * @param increment The velocity increment of the car
     * @return velocity of the car
     */
    int increaseSpeed(int increment) {
        this.speed = this.speed + increment;
        return this.speed;
    }
          
}
