package quiz05;

public class Account {
	String name;
	String password;
	int balance;
	
	Account(){ //기본생성자가 없으면 문제가 되는 경우가 있기도..
		
	}
	
	Account(String s, String a, int b){
		name=s;
		password=a;
		balance=b;
	}
	
	
	void deposit(int a) {
		balance+=a;
	}
	
	void withDraw(int a) {
		balance-=a;
	}
	
	int getbalance() {
		return balance;
	}

}
