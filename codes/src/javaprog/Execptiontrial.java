package javaprog;

import java.util.Scanner;

class InsuffcientException extends Exception{
	
	public InsuffcientException(String s) {
		super(s);
	}
	
}


class Account{
	private int balance;
	
	
	public Account(int b) {
		this.balance=b;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void Debitcash(int amt) throws InsuffcientException{
		if(this.getBalance()<amt) {
			throw new InsuffcientException("Available Balance = "+this.getBalance()+" <---- INSUFFICIENT FUNDS TO WITHDRAW");
		}
		else {
			System.out.println("Amount Debited--->"+amt+"\n"+"Updated Balance ---> "+(this.getBalance()-amt));
			this.setBalance(this.getBalance()-amt);
		}
	}
	
}


public class Execptiontrial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Balance Amount-----> ");
		int y= sc.nextInt();
		System.out.println("Enter the Amount to Debited-----> ");
		int x = sc.nextInt();
		Account acc = new Account(y);
		try {
			acc.Debitcash(x);
		}
		catch(InsuffcientException e) {
			System.out.println("Exception Occureed---->\n");
			//e.printStackTrace();
			System.out.println(e.toString());
		}
	}

}
