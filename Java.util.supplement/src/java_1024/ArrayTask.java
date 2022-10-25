package java_1024;

import java.util.Arrays;

public class ArrayTask {
	public static void main(String[] args) {
		//문자열 배열 생성
		
		String[] ar = {"카리나", "아이린", "윈터", "조이", "슬기"};
		
		//배열을 순회
		for(String singer : ar) {
			System.out.println(singer);
		}
		//문자열의 크기 비교 하는 메서드: compareTo, compareToIgnorecase-대소문자 구분 안함
		System.out.println(ar[1].compareTo(ar[0]));
		System.out.println(ar[0].compareToIgnoreCase("Jack"));
		
		//선택 정렬
		//첫번째 부터 n-1번째 데이터 까지
		//배열의 복제
		String[] copyAr=Arrays.copyOf(ar, ar.length);
		System.out.println(Arrays.toString(copyAr));
	
		for(int i=0;i<copyAr.length;i++) {
			//자신의 뒤에 있는 모든 데이터와 비교해서
			for(int j=i+1;j<copyAr.length;j++) {
				//뒤에 있는 데이터가 더 크다면(작다면) 교환
				if(copyAr[i].compareTo(copyAr[j])<0) {
					String temp=copyAr[i];
					copyAr[i]=copyAr[j];
					copyAr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(copyAr));
		
		//그러나 이 방법은 성능이 떨어지기 때문에 실무에서는 사용하지 않음
		//정렬을 설명하기 위해, 반복문 연습하기 위해 하는 것.
		
	}

}
