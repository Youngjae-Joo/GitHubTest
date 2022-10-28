package java_1028.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaMain {
	public static void main(String[] args) {
		//배열의 정렬
		String[] str = {"아담", "이브", "카인", "골리앗", "야훼"};

		//배열의 내림차순 정렬
		//Arrays.sort(배열, 비교를 위한 Comparator<T> 인터페이스를 구현한 클래스의 객체)를 호출해야 함
		Arrays.sort(str, new Comparator<String>() {//sort는 한번만 쓸 거니까 Anonymous 사용
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}});

		//Lambda
		//Comparator는 메서드가 1개만 존재합니다.->이것이 람다를 위한 전제 조건. 메서드는 1개만 있어야 함
		//람다를 만들 때는 인터페이스 이름과 메서드 이름은 중요하지 않음.
		//중요한 건 매개변수의 개수와 리턴타입만 확인하면 됨
		//매개변수는 2개이고 리턴타입은 정수
		//매개변수가 1개이면 ()생략도 가능
		Arrays.sort(str,(o1,o2)->{return o2.compareTo(o2);});
		//{}안에 return하는 문장만 존재하면 둘 다 생략 가능
		Arrays.sort(str,(o1,o2)->o2.compareTo(o1));
		//메서드의 매개변수로 코드(함수)를 대입한 것처럼 보이도록 함
		//메서드의 매개변수로 코드(함수)를 대입할 수 있는 방식을 "함수형 프로그래밍"이라고 함-자바는 함수형 프로그래밍을 지원하지 않음. 보이도록 한 것일 뿐. 
		

		//배열의 요소를 빠르게 확인
		System.out.println(Arrays.toString(str));
	}
}
