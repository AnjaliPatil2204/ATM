package atm;

public class User {
	private double balance;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(double balance) {
		this.balance = balance;
	}

	public double getBalacne() {
		return balance;
	}

	public void setBalacne(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double amount) {
		if(amount>0) {
		System.out.println("Amount Deposited Successfully........");
		System.out.println("Total Balance before Deposite: ₹"+this.balance);
		this.balance +=amount;
		System.out.print("Total Balance After Deposite : ₹");
		}
		else {
			System.out.println("Invalid deposit amount. Please enter a positive value");
			System.out.print("Total Balance : ₹");
		}
		return balance;
	}
	public double withdraw(double amount) {
		if(amount >0 && amount<=this.balance) {
			System.out.println("Amount Withdraw Successfully........");
			System.out.println("Total Balance before Withdraw : ₹"+this.balance);
			this.balance -= amount;
			System.out.print("Total Balance after Withdraw : ₹");
		}
		else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
			System.out.print("Total Balance : ₹");
        } 
		else {
			System.out.println("Balance is insufficient....");
			System.out.print("Total Balance : ₹");
		}
		return balance;
	}
	public double checkBalance() {
		System.out.print("Total Balance : ₹");
		return balance;
	}
	

}
