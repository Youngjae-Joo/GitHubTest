package api.lang.system;

public class SystemEx {
	public static void main(String[] args) {
		
	System.out.println("출력");
	
	//System.exit(0); -종료
	//System.gc();-불필요한 객체 정리
	
	
	long start = System.currentTimeMillis();	
	//System.out.println(start);//1970 1월1일 자정(UTC)이후 현재까지의 지나온 시간을 밀리초단위로 반환
	long sum=0;
	for(long i =0;i<=10000000000L;i++) {
		sum+=i;
	}
	long end = System.currentTimeMillis();	
	//System.out.println(end);//프로그램코드가 끝날때까지 시간을 잴 수 있음
	System.out.println((end-start)*0.001+"초 소요됨");
	
	
	
	}

}
