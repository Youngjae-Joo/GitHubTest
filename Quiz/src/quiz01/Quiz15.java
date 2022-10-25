package quiz01;

public class Quiz15 {

	public static void main(String[] args) {
		
		//힌트 ->출력은 가로 or 세로로만 가능합니다
		//정렬은 \t->>8칸 띄어쓰기 후 줄을 맞추어 줌. 문자열에 섞어서 쓸 수 있음. 그냥 띄어쓰기 하면 한자리수나 두자리수 때문에 삐뚤빼뚤하게 나옴
		
		for(int i=1;i<=9;i+=3) {
			
			for(int j=1;j<=9;j++) {
				
				System.out.print(i+"x"+j+"="+i*j+"\t");
				System.out.print((i+1)+"x"+j+"="+(i+1)*j+"\t");
				System.out.print((i+2)+"x"+j+"="+(i+2)*j);
				
				System.out.println();//줄바꿈
				
			}
			System.out.println();
		}
		
		//구구단이라고 해서 n*m같은 식을 생각하지 말고 유도리있게 변환. n*m,(n+1)*m,(n+2)*m 등등등..
		//123 456 789가 아니라 147 258 369의 그룹으로 모아서 생각. 세로로 한 그룹 만들고 옆으로 증가
		//줄바꿈이 어디에 들어가는지 확인. for 중첩문에서 어디에 뭐가 들어가는지 파악함에 주의.
		
		//출력은 가로로 쫙이나 세로로 쫙만 가능 가로를 '다' 만들고 세로를 반복하기, 세로를 '다' 만들고 가로로 반복하기 
	}
}
