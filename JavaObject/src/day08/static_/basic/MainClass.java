package day08.static_.basic;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		//PrintArray parr = new PrintArray();
		
		
		int[] arr= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		System.out.println(PrintArray.toArray(arr));
		
		char[] crr = {'a','b','c','d'};
		System.out.println(PrintArray.toArray(crr));
		
		String[] srr = {"안", "녕", "하", "세", "요"};
		System.out.println(PrintArray.toArray(srr));
	}

}
