/**
* BankAccount custom class used to maintain a balance that includes monthly withdrawals and deposits as well as calculate monthly interest
* @author Levi Crouch, lcrouch@student.sdccd.edu
* @version 1.0.0
* @since 3/29/2026
*/
public class BankAccount {
    double balance;
    double deposit;
    double withdraw;
    double interest;
    double monthlyInterestRate;
    
    /**
     * No-Arg constructor that sets the default monthly interest rate to: 0.366% based on the set annual rate of: 4.4%.
     */
    public BankAccount () {
        monthlyInterestRate = 0.044/12;
    }
    
    /**
     * Overload constructor that sets the account balance and interest rate based upon incoming values.
     * 
     * @param inBalance the starting account balance as a whole number (integer)
     * @param intRate the annual interest rate (double) used to set the monthly interest
     */
    public BankAccount (int inBalance, double intRate) {
        monthlyInterestRate = (intRate / 100) / 12;
        balance = inBalance;
    }
    
    /**
     * Overload constructor that sets the account balance and interest rate based upon incoming values.
     * 
     * @param inBalance the starting account balance as a double
     * @param intRate the annual interest rate (double) used to set the monthly interest
     */
    public BankAccount (double inBalance, double intRate) {
        monthlyInterestRate = (intRate / 100) / 12;
        balance = inBalance;
    }
    
    /**
     * Sets the balance and deposit fields by adding the incoming amount to the existing amounts
     * 
     * @param add amount to be added to the balance
     */
    public void makeDeposit (int add) {
        balance += add;
        deposit += add;
    }
    
    /**
     * Sets the balance and deposit fields by adding the incoming amount to the existing amounts
     * 
     * @param add amount to be added to the balance
     */
    public void makeDeposit (double add) {
        balance += add;
        deposit += add;
    }
    
    /**
     * Sets the balance and withdraw fields by subtracting the incoming amount from the existing amounts
     * 
     * @param sub amount to be subtracted from the balance
     */
    public void makeWithdraw (int sub) {
        balance -= sub;
        withdraw += sub;
    }
    
    /**
     * Sets the balance and withdraw fields by subtracting the incoming amount from the existing amounts
     * 
     * @param sub amount to be subtracted from the balance
     */
    public void makeWithdraw (double sub) {
        balance -= sub;
        withdraw += sub;
    }

    /**
     * Calculates the monthly interest and adds that amount to the balance and interest fields
     */
    public void calcInterest () {
        double monthlyInterest;

        if (balance > 0) {
            monthlyInterest = balance * monthlyInterestRate;
            balance += monthlyInterest;
            interest += monthlyInterest;
        }
    }

    /**
     * Returns the balance field value
     * 
     * @return the balance as a double
     */
    public double getBalance () {
        return balance;
    }

    /**
     * Returns the deposit field value
     * 
     * @return the deposit as a double
     */
    public double getDeposit () {
        return deposit;
    }

    /**
     * Returns the withdraw field value
     * 
     * @return the withdraw as a double
     */
    public double getWithdraw () {
        return withdraw;
    }

    /**
     * Returns the interest field value
     * 
     * @return the interest as a double
     */
    public double getInterest () {
        return interest;
    }

}