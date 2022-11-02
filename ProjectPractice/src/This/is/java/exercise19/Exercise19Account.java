package This.is.java.exercise19;

public class Exercise19Account {
	
	private int balance;
	private static final int MIN_BALANCE=0;
	private static final int MAX_BALANCE=1000000;

	public Exercise19Account() {
		super();
	}




	public int getBalance() {
		return balance;
	}

	
	
	
	public void setBalance(int balance) {
		if(balance>=MIN_BALANCE&&balance<=MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
	

}
