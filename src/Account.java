import java.util.ArrayList;

/*
 * Intended use : Account of an individual 
 * Encapsulates the debit and credit process 
 * Keeps track of total balance in the ledger
 */
public class Account {
    private ArrayList<Integer> debit;
	private ArrayList<Integer> credit;
	private int total;
	Account(){
		debit = new ArrayList<Integer>();
		credit = new ArrayList<Integer>();
		total=0;
	}
	
	public void addDebit(int amount){
		debit.add(amount);
		total-=amount;
	}
	public void addCredit(int amount){
		credit.add(amount);
		total+=amount;
	}
	public void displayTotal(){
		System.out.println(total);
	}
 
}
