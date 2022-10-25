package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch3 {
	public static void main(String[] args) {
		
		//이진탐색-절반으로 나눠가며 찾아가는 과정
		//조건 - 순서대로 나열된 데이터
		
		/* 0과 7의 중간인 3번인덱스에서 시작. 500을 찾을 때 100보다 크므로 인덱스를 하나 올려서 시작인덱스를 4로.-1번
		 * 그리고 4인 110에서 끝(7)인500을 또 절반으로 나눠 중간인덱스에서 시작. 4번인덱스와 7번인덱스의 중간인 5번인덱스(250)에서 500을 비교.-2번
		 * 아직 500이 크므로 5번인덱스와 7번인덱스의 중간인 6번인덱스에서 다시 시작 6번인덱스에서 비교. 아직 500이 큼. 인덱스를 하나 더올려 7로.-3번
		 * 7번인덱스와 500을 비교. 같음-4번
		 * 이런식으로 4번이 걸림. 인덱스 갯수가 클수록 엄청 빨라짐.
		 */
		int[] arr = {30, 50, 80, 100, 110, 250, 300, 500};
		
		Scanner scan = new Scanner(System.in);
		
		int num=scan.nextInt();

		//System.out.println(Arrays.binarySearch(arr, num)); 사실 찾는 인덱스값이 몇인지 바로 알 수 있는 식이 있다
		
		int low=0;//맨 처음 시작 인덱스
		int high=arr.length-1;//마지막 인덱스.7
		
		while(low<=high) { //반대로 넘어가면 false. 멈춘다.
			int mid = (low+high)/2;
			
			if(num==arr[mid]) {
				System.out.println("인덱스위치:"+mid);
				break;
			}
			
			if(num>arr[mid]) { //입력값이 중간값보다 큰경우
				low=mid+1;
			}else {//입력값이 중간값보다 작은경우
				high=mid-1;
			}
			
		}
		if(low>high) {
		System.out.println("찾는 값은 없습니다");
		}
	}

}
