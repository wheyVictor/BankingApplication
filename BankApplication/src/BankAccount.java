
/**
 * @author PauloSilva
 *
 */
public class BankAccount {
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname, String cid)
	{
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(int amount) {
		if (amount > 0)
		{
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
    void withdraw(int amount) {
    	balance = balance - amount;
    	previousTransaction = -amount;
  }
    void getPreviousTransaction() {
    	if(previousTransaction > 0)
    	{
    		System.out.println("Deposited: " +previousTransaction);
    	}
    	else if (previousTransaction < 0)
    	{
    		System.out.println("Withdrawn: " +Math.abs(previousTransaction));
    	}
    	else
    	{
    		System.out.println("No transactions occured.");
    	}
    	void showMenu()
    	{
    		
    	}
    }
}
