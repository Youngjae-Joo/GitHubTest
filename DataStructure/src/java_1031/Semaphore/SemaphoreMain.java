package java_1031.Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {
	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(2);
		
		Thread th1 = new Thread(new SemaphoreThread("맥스",semaphore));
		Thread th2 = new Thread(new SemaphoreThread("아담",semaphore));
		Thread th3 = new Thread(new SemaphoreThread("피터",semaphore));
		Thread th4 = new Thread(new SemaphoreThread("해리슨",semaphore));
		Thread th5 = new Thread(new SemaphoreThread("메리",semaphore));
		
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		
		
		
	}
}
