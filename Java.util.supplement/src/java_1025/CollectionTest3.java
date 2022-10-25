package java_1025;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest3 {
	public static void main(String[] args) {
		//100000개의 데이터를 가진 ArrayList와 LinkedList 생성
		ArrayList<Integer> al = new ArrayList<>();//원하면 초기 용량 설정 가능
		for(int i=0;i<100000;i++) {
			al.add(i);
		}
		//ArrayList에서 100000개의 데이터를 읽는데 걸리는 시간
		//데이터를 가져오는 메서드 get(인덱스)
		
		long start1 = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			System.out.println(al.get(i));
		}
		long end1 = System.currentTimeMillis();
		System.out.println(end1-start1);//307
		
		
		//LinkedList에서 100000개의 데이터를 읽는데 걸리는 시간
		//데이터를 가져오는 메서드 get(인덱스)
		LinkedList<Integer> li = new LinkedList<>();
		for(int i=0;i<100000;i++) {
			li.add(i);
		}
		
		long start2 = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			System.out.println(li.get(i));
		}
		long end2 = System.currentTimeMillis();
		System.out.println(end2-start2);//6757
		//출력이 너무 많다! 먼저 실행해서 시간 확인하고 al을 li로 변경해서 실행하고 시간 확인하기
		
		
	}

}
