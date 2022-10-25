package day03;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		//정렬 ->선택정렬-가장 쉬운정렬방법 but 숫자가 크면 느려진다, 퀵정렬-가장빠른 정렬방법,  (총7가지)
		
//		자리바꾸기
//		int x=10;
//		int y=20;
//		int temp=x;
//		x=y;
//		y=temp;
		
		int[] arr = {5, 23, 1, 43, 100, 200, 40};
//		
//		for(int i=0;i<arr.length-1;i++) { //-1을 하는 이유: 다 돌아갈 필요 없음. 정렬을 진행하면 결국 마지막꺼는 진행하기 전에 알아서 정렬되어있을거니까
//			
//			for(int j=i+1;j<arr.length;j++) { //비교할때는 마지막거 까지 비교를 해줘야 하기 때문에 -1을 하지 않는다. 
//				
//				if(arr[i] >arr[j]) { //오름차순. 내림차순은 부등호만 바꾸면 됨
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//			
//		}
//		System.out.println(Arrays.toString(arr));
//	
		
		Arrays.sort(arr); //빨리 정렬해주는 방법
		System.out.println(Arrays.toString(arr));
	}
}
