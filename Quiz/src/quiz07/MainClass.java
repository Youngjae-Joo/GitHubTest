package quiz07;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
		PrintArray p=new PrintArray();
		
		int[] arr= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		System.out.println(p.toArray(arr));
		
		char[] crr = {'a','b','c','d'};
		System.out.println(p.toArray(crr));
		
		String[] srr = {"안", "녕", "하", "세", "요"};
		System.out.println(p.toArray(srr));
	}

}
