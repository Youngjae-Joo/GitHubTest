package java_1028.Thread;

//Thread 클래스로부터 상속받는클래스를 생성
class ThreadEx extends Thread{
	//public void run이라는 메서드 오버라이딩
	@Override//안써도 에러는 나지 않음. 이 어노테이션은 상위 클래스나 인터페이스에서 제공하는 메서드가 아닌 경우 에러를 발생시켜 줌. 오버라이딩을 할 때 이름이 틀렸으면 에러가 남
	public void run() {
		//스레드로 수행할 내용
		//1초마다 Thread 클래스라는 문장을 10번 출력
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread 클래스");
			} catch (InterruptedException e) {
				System.out.println(e.getLocalizedMessage());
			}

		}
	}
}



//Runnable 인터페이스를 구현한 클래스를 생성
class RunnableImpl implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Runnable 인터페이스");
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}
}


public class ThreadCreate {
	public static void main(String[] args) {

		//Thread클래스로부터 상속받은 클래스를 이용해서 스레드를 생성하고 실행
		Thread th1 = new ThreadEx();
		//start를 호출하면 run메서드의 내용을 수행
		th1.start();//메서드 자체가 Thread의 run메서드를 호출하는 애임. run을 부르면 Process처럼 움직임.
		
		//Runnable 인터페이스를 implements 하는 클래스를 이용해서 스레드를 생성하고 실횅
		Thread th2 = new Thread(new RunnableImpl());//Runnable인터페이스는 별도로 실행하는 스레드를 호출해주는 역할 
		th2.start();

		//Runnable 인터페이스를 Anonymous클래스를 이용해서 사용
		Thread th3 = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<10;i++) {
					try {
						Thread.sleep(1000);
						System.out.println("Anonymous 활용");
					} catch (Exception e) {
						System.out.println(e.getLocalizedMessage());
					}}}});
		th3.start();

		//Runnable 인터페이스는 public void run 메서드 1개만 소유
		//즉, 람다 사용 가능
		Thread th4 = new Thread(()->{for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("람다 활용");
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}}});
		th4.start();


	}

}
