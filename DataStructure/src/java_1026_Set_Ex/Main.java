package java_1026_Set_Ex;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		//랜덤한 숫자를 추출하기 위한 인스턴스 생성
		Random r = new Random();
		
		//ArrayList 활용
		ArrayList<Integer> al = new ArrayList<>();
		
		//ArrayList의 size가 6보다 작을 때 까지
		while(al.size()<6) {
			//1-45까지의 숫자를 랜덤하게 추출 
			int su = r.nextInt(45)+1;
			//중복검사를 해서 통과하면 add하고 통과하지 못하면 add 수행하지 않음
			if(al.contains(su)) {
				continue;
			}else {
				al.add(su);
			}
		}
		
		//출력하기 전에 정렬
		al.sort(null);//comparator 안불러도 됨. 숫자니까
		System.out.println(al);
		
		
		//TreeSet : 중복된 데이터를 저장하지 않고 저장된 순서를 기억함
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		while(treeSet.size()<6) {
			//1-45까지의 숫자를 랜덤하게 추출 
			int su = r.nextInt(45)+1;
			//TreeSet은 중복된 데이터를 저장하지 않기 때문에 검사할 필요가 없음
				treeSet.add(su);
		}
		//출력
		for(Integer i : treeSet) {
			System.out.print(i +"\t");
		}
		
		
	}
}
