 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tutorial01;

/**
 *
 * @author SummerWorkShop
 */
public class CreditCardStatement {
    
    //final static float INIT_BALANCE = 100.00; 
    //private String accountNumber = "xxxx-000-000"; 
    //private float statementBalance = INIT_BALANCE;
    final static float INIT_BALANCE = (float) 100.00; 
    private static String accountNumber = "xxxx-000-000"; 
    private static float statementBalance = INIT_BALANCE;
    
    //public void printStatement() { 
    public static void printStatement() { 
       System.out.println("STATEMENT OF HSBC VISA CARD ACCOUNT"); 
       System.out.println("Account number: " + accountNumber); 
       System.out.println("Statement Balance: " + statementBalance); 
    }
}


