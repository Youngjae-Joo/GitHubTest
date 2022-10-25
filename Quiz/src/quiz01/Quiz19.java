package quiz01;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		/*
		 * 1. 사람수(정수)를 입력을 받습니다.
		 * 2. 입력받은 사람수 만큼 랜덤한 배열을 생성해서 중복되지 않게 랜덤값을 저장
		 * 
		 * 랜덤값 크기 1<= x <=사람수
		 * 
		 * 3. 중복되지 않는 배열이 생성 되었다면, ○문자를 이용해서 배열의 크기를 출력
		 * 4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있습니다.
		 * 5.제대로 선택된 좌석이면 자리번호를 공개하고 출력.
		 *   제대로 선택되지 않은 좌석이면 다시 선택을 출력.
		 * 
		 * 힌트>집어넣기전에 집어넣기 직전까지 중복값이 있는지 확인
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("배정할 좌석의 크기를 지정하세요:");
		int n = scan.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<arr.length;i++) {
			int ran = (int)(Math.random()*n)+1;
			arr[i]=ran;
			for(int j =0; j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(arr));//중복되지 않는 배열 생성
//		
//		int[] count = new int[n];
//		String[] blank = new String[n];
//		for(int i=0;i<n;i++) {
//			count[i]=i+1;
//			blank[i]="○";
//		}
//		int count1=0;
//		ex:while(true) {
//			String scount = "";//순서대로 n까지 나열되는 문자열
//			String sblank = "";//n개의 ○가 나열되는 문자열, ●로 바꿀려면 얘네가 배열값을 가지고 있어야 한다
//			for(int i=0;i<n;i++) {
//				scount+=count[i]+" ";//순서는 바뀔 일이 없다. 
//				if(i==n-1) { //break를 걸지 않으면 다음에서 순서나열이 중복되서 출력됨. 
//					break;
//				}
//			}
//			for(int i=0;i<n;i++) {
//				sblank+=blank[i]+" ";
//				if(i==n-1) {
//					break;//마찬가지, break를 걸지 않으면 ○의 나열이 중복되서 출력된다.
//				}
//			}
//			System.out.println("-------좌석 선택 프로그램-------");
//			System.out.println(scount);
//			System.out.println(sblank);
//			if(count1==n) {
//				break ex;
//			}
//			System.out.print("좌석 선택>");
//			int num =scan.nextInt();
//
//			if(num>n||num<=0) {
//				System.out.println("제대로 선택하세요");
//				continue;
//			}
//
//			for(int i=0;i<n;i++) {
//				if(blank[num-1].equals("●")) {
//					System.out.println("제대로 선택하세요");
//					break;
//				}
//				if(i==num-1) {
//					blank[num-1]="●";
//					System.out.println("자리번호를 공개합니다>"+arr[i]);
//					count1++;
//					break;
//				}
//			}
//		}
		//좌석 출력
		int count = 0;
		while(true) {
			System.out.println(Arrays.toString(arr));//맨 처음 실행될 때 선택된 곳의 자리값이 0이 된다
			
			for(int i=0;i<arr.length;i++) {
				System.out.printf("%-3d",i+1); //+)참고만. 주어지는 숫자가 크더라도 자리수에 구애받지 않고 깔끔하게 정리. 
											  //%-3d = 3자리 공간을 잡고 왼쪽부터 채움. 양수면 오른쪽부터 채움 
			}
			System.out.println();
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==0) {
					System.out.printf("%-3s","●");//한번 실행 후 그자리가 0이 됐으니 그 자리를 까만 동그라미로 찍는다
				}else {
					System.out.printf("%-3s","○");
				}
			}
			System.out.println();
			
			System.out.print("좌석선택>");
			int seat = scan.nextInt();
			
			if(arr[seat-1]==0) { //인덱스 번호니까 입력받은 값보다 하나가 작다
				System.out.println("제대로 선택하실래요?");
			} else {
				System.out.println("선택좌석:"+arr[seat-1]);
				arr[seat-1]=0;
				count++; //좌석 선택시 카운트 증가
			}
			if(count==n) {
				System.out.println("종료합니다");
				break; //탈출
			}
		}
	}
}