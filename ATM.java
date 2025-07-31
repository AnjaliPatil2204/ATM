package atm;

import java.util.Scanner;

public class ATM {
	
	public static int menu(Scanner sc) {
		System.out.println("1.Check Balance");
		System.out.println("2.Deposite");
		System.out.println("3.Withdraw");
		System.out.println("Enter your choice");
	    int choice = sc.nextInt();
	    return choice;
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		User user = new User();
		int choice;
		while((choice=menu(sc))!=0) {
		
			switch(choice) {
			
			case 1:
				System.out.println(user.checkBalance());
			    break;
			
			case 2:
				System.out.println("Enter amount :");
				double amount = sc.nextDouble();
				System.out.println(user.deposit(amount));
				break;
				
			case 3:
				System.out.println("Enter amount :");
				double amount1 = sc.nextDouble();
				System.out.println(user.withdraw(amount1));
				break;
			
			}
		}
		

	}



}
