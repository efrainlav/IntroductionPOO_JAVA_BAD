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
public class BankAccount {
    
    //Attributes
    private final int accountNumber;
    protected boolean activated;
    
    //Constructors
    /**
     * Bank Account constructor 
     * @param accountNumber Number of the account in the bank
     * @param activated State of the account True or False
     */
    public BankAccount(int accountNumber, boolean activated){
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    
    //Methods
    
    
    /**
     * Method to set the activated state of the account-Boolean
     * @param activated Stated of the account 
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    /**
     * Method to get the activated state of the account-Boolean
     * @return Stated of the account 
     */
    public boolean getActivated() {
        return activated;
    }

    
    
}
