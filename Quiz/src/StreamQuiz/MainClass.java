package StreamQuiz;

public class MainClass {
	public static void main(String[] args) {
	//패턴 찾기 문제 	
		
	for(int i=0;i<6;i++) {
		for(int j=5-i;j>0;j--) {
			System.out.print(" ");
			
		}
		for(int k=i;k<=9;k+=2) {
			if(k<=i) {
				System.out.print(k);
				for(int l=1;l<=k*2;l++) {
					System.out.print(" ");
				}
				if(k>0)System.out.print(k+1);
			}
		}
		
		System.out.println();
		if(i==5) {
			System.out.println("90123456789");
			
		}
	}
	
	
		
		
		
		
	//String msg = "GCCGABCGCCGCCGBACGCCGCA"
	//GCCG위치 찾기. 겹치는 것은 제외. 염기서열 문제 
		
	//log.txt
	//맨 앞은 IP, 맨 뒤는 Traffic
	//1.트래픽의 합 
	//2.IP별 접속횟수
	//3.IP별 트래픽의 합
		
		
		
		
	}

}
