import java.util.Scanner;

public class Main {
	
	private static final String helloMessage = "Welcome to your daily billing solution";
	private static final String debitHelperMessage = "For adding debit amounts press \'D<SPACE>[Amount]\'";
	private static final String creditHelperMessage = "For adding debit amounts press \'C<SPACE>[Amount]\'";
	private static final String displayTotalMessage = "For query account balance press \'Q\'";
	private static final String exitMessage ="Type EXIT to quit";
	private static final String finalAmount = "Final account balance: ";
	private static final String err1 ="Wrong Input. Please re-enter:";
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(helloMessage);
		System.out.println(debitHelperMessage);
		System.out.println(creditHelperMessage);
		System.out.println(displayTotalMessage);
		System.out.println(exitMessage);
		String s = in.nextLine();
		Account ac = new Account();
		while(!s.equalsIgnoreCase("EXIT")){
			accountProcess(s,ac);
			s=in.nextLine();
		}
		System.out.print(finalAmount);
		ac.displayTotal();
		in.close();
		
	}


	private static void accountProcess(String s,Account ac) {
		
		if(s.startsWith("D")){
			String[] ar = s.split(" ");
			ac.addDebit(Integer.parseInt(ar[1]));
		}else if(s.startsWith("C")){
			String[] ar = s.split(" ");
			ac.addCredit(Integer.parseInt(ar[1]));
		}else if(s.startsWith("Q")){
			ac.displayTotal();
		}else{
			System.out.println(err1);
		}
		
	}

}
