package day03;

import java.util.Scanner;

import day01.SystemOut;

public class ArraySearch {

	public static void main(String[] args) {
		
		//배열을 다루는 방법.
		
		//탐색->순차탐색, 이진탐색(중간부터)
		//이진탐색의 전제조건: 중복없이, 순서대로 나열되어 있다는 전제조건이 필요
		
		int[] arr = {30, 10, 20, 50, 40, 60, 100, 110, 90, 80};
		
		//입력받은 값의 위치를 출력
		Scanner scan = new Scanner(System.in);
		int find = scan.nextInt();
		
		int index = -1;
		for(int i = 0;i<arr.length;i++) {
			
			
			
			if(arr[i]==find) { //찾은 경우
				index=i;//인덱스의 값을 수정
				break; //탈출
			} 
		}
		System.out.println("인덱스 위치:"+index);
		
		
		
	}
}
