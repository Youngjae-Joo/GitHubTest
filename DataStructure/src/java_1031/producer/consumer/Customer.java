package java_1031.producer.consumer;

public class Customer extends Thread{
	public Product myList;
	
	public Customer(Product myList) {
		this.myList=myList;
	}
	
	@Override
	public void run() {
		for(char ch ='A';ch<='Z';ch++) {
			myList.get();
		}
	}
}
