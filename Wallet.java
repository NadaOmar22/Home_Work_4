
package gofootball;

/**
 * this class represents all information about the user wallet and have an 
 * attribute (currentBalance) 
 * @author nada omar fathi
 */
public class Wallet {
    
    /**
     * currentBalance the private attribute of the class
     */
    private int currentBalance;
    
    
    Wallet() {
        currentBalance=0;
    }
    
    /**
     * withdraw is void function that takes an int withdrawValue and 
     * decrease this value from currentBalance 
     * @param withdrawValue 
     */
    public void withdraw(int withdrawValue)
    {
        currentBalance -= withdrawValue;
    }
    
    /**
     * deposit is void function that takes an int depositValue and increase 
     * the currentBalance by this value 
     * @param depositValue 
     */
    public void deposit (int depositValue)
    {
        currentBalance += depositValue;
    }
    
   
    /**
     * setcurrentBalance is void function that takes an int currentBalance 
     * and store it
     * @param currentBalance that refer to the currentBalance of the Wallet
     */
    public void setcurrentBalance(int currentBalance)
    {
        this.currentBalance = currentBalance;
    }
    
    /**
     * getcurrentBalance is a return function that
     * @return the currentBalance as an integer value
     */
    public int getcurrentBalance()
    {
        return currentBalance;
    }
}
