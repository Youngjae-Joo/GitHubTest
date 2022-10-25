package quiz05;

public class MainAccount {
	public static void main(String[] args) {
		
		Account Acc = new Account("홍길동", "1234", 3600);
		Acc.deposit(800);
		Acc.withDraw(2000);
		int bal = Acc.getbalance();
		System.out.println(Acc.name+"님의 계좌 잔액은:"+bal+"원입니다.");
		
		
		MyAccount MyAcc = new MyAccount("철수","1234",5000);
		MyAcc.deposit(1000);
		MyAcc.withDraw(2000);
		int bal2 = MyAcc.getbalance();
		System.out.println(MyAcc.name+"님의 계좌 잔액은:"+ bal2+"원입니다.");
		
	}
}
