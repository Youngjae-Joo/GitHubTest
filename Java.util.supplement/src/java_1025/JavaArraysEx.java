package java_1025;

import java.util.Arrays;
//import java.util.Comparator;

public class JavaArraysEx {
	public static void main(String[] args) {
		//배열 생성
		String[] singers = {"장원영", "카리나", "지젤", "민지", "태연", "아이유", "수지"};
		
		//이분 검색
		int result =Arrays.binarySearch(singers, "수지");
		System.out.println(result);//있는데도 음수가 나오는 이유? sort를 하지 않아서 잘못된 결과가 나옴
		
		//데이터정렬
		Arrays.sort(singers);
		System.out.println(Arrays.toString(singers));
		result=Arrays.binarySearch(singers, "수지");
		if(result>=0) {
			System.out.printf("%s는 %d 번째 존재\n", "수지", result+1);
		}else {
			System.out.printf("%s는 존재하지 않음\n","수지");
		}
		
		
//		Arrays.sort(singers,new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});
//		System.out.println(Arrays.toString(singers));
		
		
		
		
	}

}
