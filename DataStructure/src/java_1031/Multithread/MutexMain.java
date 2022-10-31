package java_1031.Multithread;

public class MutexMain {
	public static void main(String[] args) {
		//Runnable 인터페이스로부터 상속받은 클래스
		ShareData shareData = new ShareData();
		//스레드 생성
		Thread th1 = new Thread(shareData);
		th1.start();
		Thread th2 = new Thread(shareData);
		th2.start();
		
		
		try {
			//30초 대기-앞의 작업이 스레드로 동작하기 때문에 작업이 끝날때까지 대기하고 결과를 출력
			//바로찍으면 getResult가 먼저 실행될 수도 있음
			Thread.sleep(3000);//스레드가 아니면 전부 다 돌고 getResult가 나옴. 
			//스레드가 2개면 첫번째 스레드가 돌 때 반복문에서 sleep을 만나면 다른 스레드로 감. 같은 변수를 사용하기 때문에 이상한 결과값이 나옴.
			//해결방법은 간단함. synchronized로 묶어주기만 하면 됨. 단, 다른게 못쓰도록 하는 건 최소화시켜야 함
			//또는 ReentrantLock클래스 이용. 이 방법이 권장됨
			System.out.println(shareData.getResult());
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}
}
