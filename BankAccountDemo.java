import java.util.Scanner;

/**
 * Demonstration class for interfacing with the BankAccount custom class
 * Prompts the user to choose either whole dollar mode (integer) or currency mode (double) for incoming values for a starting balance, annual interest rate, 
 * the number of months to calculate the balance with the monthly interest.
 * Prompts the user for the monthly deposits and withdrawals 
 * Reports back a summary of the ending balance, total deposits, withdraws, and interest for the number of months entered.
 * @author Professor Rico Cassoni, rcassoni@sdccd.edu, additional edits: Levi Crouch, lcrouch@student.sdccd.edu
 * @version 1.0.1
 * @since 3/29/2026 
 * 
 */
public class BankAccountDemo  //Update to Main for Replit or MyProgram for codeHS
{
    public static void main (String[] args) {
        //Create necessary code that forces a 1 or 2 input
        int userChoice;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("Please enter 1 to enter whole dollar amounts, or 2 to enter currency: ");
            userChoice = keyboard.nextInt();
            //if user selects 1, call useWholeDollarMode()
            if (userChoice == 1) {
                useWholeDollarMode();
            } else if (userChoice == 2) {
                //else call useCurrencyMode()
                useCurrencyMode();
            }
        } while (userChoice != 1 && userChoice !=2);
    }

    //used for menu option 1
    /**
     * useWholeDollarMode asks the user for the starting balance, the interest, and the number of months to
     * process.  A BankAccount object is created with balance and interest rates as args.
     * A loop runs based on number of months to process.  For each month deposits, withdraws,
     * and interest rate is calculated.  After the loop processes, ending balance, total deposits,
     * total withdraws, and total interest is displayed.  
     */
    public static void useWholeDollarMode() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your starting balance: $");
        int balance = keyboard.nextInt();
        System.out.print("What is your interest rate? (ie enter 4.4 for 4.4%): ");
        double intRate = keyboard.nextDouble();
        System.out.print("How many months do you want to calculate? ");
        int counter = keyboard.nextInt();
        System.out.println("===============================");   //formatting
        BankAccount bankAccount = new BankAccount(balance, intRate);  //creates new BankAccount object to use BankAccount methods
        for (int i = 1; i <= counter; i++) {
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextInt());
            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextInt());
            bankAccount.calcInterest();
        }
        System.out.printf("\nEnding balance: $%,.2f",bankAccount.getBalance()); 
        System.out.printf("\nTotal deposits: $%,.2f",bankAccount.getDeposit());
        System.out.printf("\nTotal withdraw: $%,.2f",bankAccount.getWithdraw());
        System.out.printf("\nTotal interest: $%,.2f",bankAccount.getInterest());
    } //end useWholeDollarMode()

    //used for menu option 2
    /**
     * useCurrencyMode asks the user for the starting balance, the interest, and the number of months to
     * process.  A BankAccount object is created with balance and interest rates as args.
     * A loop runs based on number of months to process.  For each month deposits, withdraws,
     * and interest rate is calculated.  After the loop processes, ending balance, total deposits,
     * total withdraws, and total interest is displayed.  
     */
    public static void useCurrencyMode() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your starting balance: $");
        double balance = keyboard.nextDouble();
        System.out.print("What is your interest rate? (ie enter 4.4 for 4.4%): ");
        double intRate = keyboard.nextDouble();
        System.out.print("How many months do you want to calculate? ");
        int counter = keyboard.nextInt();
        System.out.println("===============================");   //formatting
        BankAccount bankAccount = new BankAccount(balance, intRate);  //creates new BankAccount object to use BankAccount methods
        for (int i = 1; i <= counter; i++) {
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextDouble());
            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextDouble());
            bankAccount.calcInterest();
        }
        System.out.printf("\nEnding balance: $%,.2f",bankAccount.getBalance()); 
        System.out.printf("\nTotal deposits: $%,.2f",bankAccount.getDeposit());
        System.out.printf("\nTotal withdraw: $%,.2f",bankAccount.getWithdraw());
        System.out.printf("\nTotal interest: $%,.2f",bankAccount.getInterest());
    }//end useCurrencyMode()

}//end class
