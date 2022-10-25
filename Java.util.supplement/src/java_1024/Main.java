package java_1024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		PersonVO[] persons = {
				new PersonVO(1, "수지",29),
				new PersonVO(2, "아이유", 30), 
				new PersonVO(3, "카리나", 23),
				new PersonVO(4, "Adam", 46)
		}; 

//		//Arrays.sort(persons) 실행하면 예외 발생-PersonVO에는 크기 비교를 할 수 있는 메서드가 존재하지 않기 때문입니다.
//
//		//출력하면 나이가 작은 순서대로 출력됨. 음수를 리턴하면 자리를 바꿈
//		//오름차순 내림차순을 하고 싶으면 자리를 바꾸던가 *-1을 해주면 된다.
//
//		/*Arrays.sort 메서드는 배열을 대입하면 부등호 또는 compareTo라는 메서드를 호출해서
//		 *크기 비교를 한 후 정렬을 수행해 줍니다.
//		 */
//		Arrays.sort(persons);
//
//		/*
//		 * Arrays.toString은 배열의 각 요소의 toString을 전부 호출해서
//		 * 하나의 문자열로 리턴하는 메서드입니다.
//		 */
//		System.out.println(Arrays.toString(persons));
//		System.out.println(System.identityHashCode(persons));//해시코드-해시코드는 운영체제가 결정
//		//이름(문자)순으로 하려면 compareTo메서드에서 리턴을 return this.name.compareTo(o.name);로. 
//		//compareTo를 하면 양수 or 0 or 음수가 나오므로 반환은 int가 맞다.
//
//		//위의 방법은 정적으로 고정. compareTo메서드가 고정





//		//동적으로 크기 비교 하는 메서드를 설정
//				Arrays.sort(persons, new Comparator<PersonVO>() {
//		
//					@Override
//					public int compare(PersonVO o1, PersonVO o2) {
//						// TODO Auto-generated method stub
//						return o1.getName().compareTo(o2.getName());
//					}
//					
//				});
//				System.out.println(Arrays.toString(persons));

		//동적으로 정렬하기
		//1.이름의 오름차순 2.이름의 내림차순 3.나이의 오름차순 4.나이의 내림차순
		/*
		 * 무언가를 입력받을 때는 문자로! int로 받으면 에러가 날 수 있음
		 * 문자열에는 공백도 있으니, 좌우 공백을 지워줄 것.
		 *
		 *코드를 만들면서, 하나하나 다 채우는게 아니라 껍데기를 만들고 하나씩 하나씩 채워나가기
		 */


		Scanner scan = new Scanner(System.in);
		System.out.println("1.이름의 오름차순 2.이름의 내림차순 3.나이의 오름차순 4.나이의 내림차순");
		String menu=scan.nextLine();
		switch(menu.trim()) {
		case "1":
			Arrays.sort(persons, new Comparator<PersonVO>() {
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
			System.out.println(Arrays.toString(persons));
			break;
		case "2":
			Arrays.sort(persons, new Comparator<PersonVO>() {
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					return o2.getName().compareTo(o1.getName());
				}
			});
			System.out.println(Arrays.toString(persons));
			break;
		case "3":
			Arrays.sort(persons, new Comparator<PersonVO>() {
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					return o1.getAge()-o2.getAge();
				}
			});
			System.out.println(Arrays.toString(persons));
			break;
		case "4":
			Arrays.sort(persons, new Comparator<PersonVO>() {
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					return o2.getAge()-o1.getAge();
				}
			});
			System.out.println(Arrays.toString(persons));
			break;
		default:
			System.out.println("메뉴는 1~4번만 선택하세요");
			break;
		}


		scan.close();
	}
}