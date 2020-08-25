package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Account> list = new ArrayList<Account>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		for(Account acc : list) {
			
		System.out.printf(" %d: %.2f%n", acc.getNumber(), acc.getBalance());
			
			
		}
		System.out.println("-------------------------"); 
		double soma = 0.0;
		
		for (Account acc :  list) {
			
			soma += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", soma);
		
	
	    for (Account acc :  list) {
		
		acc.deposit(10.0);
	}
	    for (Account acc :  list) {
	    	
	    	System.out.printf("Updated account %d: %.2f%n", acc.getNumber(), acc.getBalance());
	    }
	    
	}	
}