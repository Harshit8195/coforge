package lab2;

public class Lab2_2 {
	
	public static class Account{
		
		protected double balance;
		
		public boolean withdraw(double amount) {
			if(amount <= balance) {
				balance-=amount;
				return true;
			}
			return false;
		}
		public double getBalance() {
			return balance;
		}
		
	}
	public static class SavingsAccount extends Account {
		private final double minimunBalance = 1000;
		public SavingsAccount(double balance) {
			this.balance = balance;
		}
		public boolean withdraw(double amount) {
			if(balance-amount >= minimunBalance) {
				balance-=amount;
				return true;
			}
			return false;
		}
		
	}
	
	public static class CurrentAccount extends Account {
		 
	    private double overdraftLimit;
	 
	    public CurrentAccount(double balance, double overdraftLimit) {
			this.balance = balance;
	        this.overdraftLimit = overdraftLimit;
	    }
	 
	  
	    public boolean withdraw(double amount) {
	        if (balance - amount >= -overdraftLimit) {
	            balance -= amount;
	            return true;
	        }
	        return false;
	    }
	}
	

	public static void main(String[] args) {
        Account sa = new SavingsAccount(5000);
        Account ca = new CurrentAccount(2000, 3000);
 
        System.out.println("Savings Withdraw: " + sa.withdraw(3500)); 
        System.out.println("Savings Balance: " + sa.getBalance());
 
        System.out.println("Current Withdraw: " + ca.withdraw(4000));
        System.out.println("Current Balance: " + ca.getBalance());
		
	}

}
