package quiz01;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		/*
		 * 첫 행의 입력값은 배열의 크기가 됩니다
		 * 
		 * 배열의 크기만큼 반복을 돌면서, 입력받은 수들을 배열에 순서대로 저장. 
		 *
		 * 5->배열의 크기
		 * 10 -> arr[0]
		 * 20 -> arr[1]
		 * 30
		 * 40
		 * 50 -> arr[4]
		 * arr={10,20,30,40,50,}
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //배열의 크기 
		
		int[] arr = new int[a]; //a길이만큼의 배열 생성
		
		int i =0;
		while(i<a) {
			
			int b = scan.nextInt();
			arr[i]= b; //배열에 값이 지정되는 식의 모습
			i++;
		
		}
		System.out.println(Arrays.toString(arr));//배열의 모습을 문자열로 확인하는 명령문
	}

}//배열관련 외우라고 하셨던 것 다시 암기하기. 또한 배열의 각 인덱스에 값이 지정되는 모습도 암기하기.
