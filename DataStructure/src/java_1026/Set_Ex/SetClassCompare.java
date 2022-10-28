package java_1026.Set_Ex;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassCompare {
	public static void main(String[] args) {
		//문자열을 저장하는 Set 인스턴스를 3개 생성
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		//샘플 데이터 삽입
		hashSet.add("Adam");
		linkedHashSet.add("Adam");
		treeSet.add("Adam");
		
		
		hashSet.add("eve");
		linkedHashSet.add("eve");
		treeSet.add("eve");
		
		
		hashSet.add("CAIN");
		linkedHashSet.add("CAIN");
		treeSet.add("CAIN");
		
		hashSet.add("Abel");
		linkedHashSet.add("Abel");
		treeSet.add("Abel");
		//중복데이터저장
		hashSet.add("Abel");
		linkedHashSet.add("Abel");
		treeSet.add("Abel");
		
		//데이터 출력
		//HashSet 출력-어떤 순서로 출력될 지 예측할 수 없음
		for(String a : hashSet) {
			System.out.println(a);
		}
		System.out.println("================");
		//LinkedHashSet 출력-저장한 순서대로 출력
		for(String a : linkedHashSet) {
			System.out.println(a);
		}
		System.out.println("================");
		//TreeSet 출력-정렬한 순서대로 출력되는데 숫자가 영문자보다 작고 대문자가 소문자보다 작음-아스키코드값에 따라 출력
		for(String a : treeSet) {
			System.out.println(a);
		}
		
		
		
	}

}
