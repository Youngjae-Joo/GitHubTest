package day02;

import java.util.Arrays;

public class ForEx04 {
	public static void main(String[] args) {
		
		//변수의 swap
		
//		int x = 10;
//		int y = 5;
//		
//		int temp=x;//temp는 임시값이고, 그 안은 빈 상자인데 바로 초기의 x값을 넣고 진행하는 것
//		x=y;
//		y=temp;
//		System.out.println("x:"+x+", y:"+y);
//		
		//배열의 swap -배열을 1번 랜덤하게 변경.
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int ran = (int)(Math.random()*9)+1; //Math.random();을 int로 항변환한다. 10을 곱하면 0이상10미만이라 9를 곱하고 1을 더해 1이상 10미만까지의 값을 구한다. 우린 arr[0]과 값을 바꿀 거니까 
		int temp = arr[0];
		arr[0] = arr[ran];
		arr[ran] = temp;
		
		System.out.println(Arrays.toString(arr));
		
		
				
	}

}
