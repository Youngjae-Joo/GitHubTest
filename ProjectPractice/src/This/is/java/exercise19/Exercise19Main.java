package This.is.java.exercise19;


public class Exercise19Main {
	public static void main(String[] args) {
		
		Exercise19Account account = new Exercise19Account();
		
		account.setBalance(1000);
		System.out.println("현재 잔고: "+account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: "+account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: "+account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: "+account.getBalance());

		
	}
}
