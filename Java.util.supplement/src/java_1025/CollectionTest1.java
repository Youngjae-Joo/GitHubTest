package java_1025;

import java.util.Arrays;

public class CollectionTest1 {
	public static void main(String[] args) {
		String[] ar = {"List", "Set", "Map"};
		//배열의 데이터를 수정하는 것은 가능
		ar[2]="HashTable";
		System.out.println(Arrays.toString(ar));
		//ar.하면 add나 remove가 없음.
		
		//ar배열에 데이터를 추가
		//ar배열보다 1개 더 큰 공간을 갖는 배열을 생성
		String[] br = new String[ar.length+1];
		//ar의 내용을 복사
		for(int i=0;i<ar.length;i++) {
			br[i]=ar[i];
			
		}
		//br의 마지막에 데이터 추가
		br[br.length-1]="Properties";
		//br이 '가리키는 곳'을 ar이 가리키도록 합니다.
		ar=br;
		System.out.println(Arrays.toString(ar));
		//가능은 함. 어려울 뿐. 배열의 크기가 클수록 필요한 데이터가 커서 힘듦.
		
		//연습: Set(1번째 데이터)을 삭제하기
		String[] cr = new String[ar.length-1];
		for(int i=0;i<1;i++) {
			cr[i]=ar[i];
		}
		for(int i=2;i<ar.length;i++) {
			cr[i-1]=ar[i];
		}
		ar=cr;
		System.out.println(Arrays.toString(ar));
		
	}

}
