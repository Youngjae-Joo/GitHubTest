package day03;

import java.util.Scanner;

import day01.SystemOut;

public class ArraySearch2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//순차탐색과 문자열 비교
		//자바에서 문자열 비교를 ==으로 하면 false로 인식해버린다. 비교하려면 "문자열.equals("")"를 사용
		String[] arr = {"홍길동", "이순신", "카카오", "네이버", "박찬호"};
		
		String name = scan.next();
		
		
		int index=-1;
		for(int i = 0;i<arr.length;i++) {
			
			if(name.equals(arr[i])) {
				index=i;
				break;
			}
			
		}
		//System.out.println("인덱스의 위치:"+index);
		if(index==-1) {
			System.out.println(name+"은 없습니다");
		}else {
			System.out.println(name+"은 "+index+"번째에 위치합니다");
		}
		
		
	}

}
