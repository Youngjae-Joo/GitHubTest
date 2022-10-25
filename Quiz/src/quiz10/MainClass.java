package quiz10;

import java.util.Arrays;
import java.util.Scanner;


public class MainClass {
	public static void main(String[] args) {
		/* 문제1
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 * 4. main에서 User객체를  생성 후  
		 *    (홍길동, 20, 123123 )을 저장 하고 값을 확인하세요.
		 */
		User us = new User("홍길동",20,123123);

		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 30, rrn값)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
 		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
 		 * ex) User[] arr = new User[2];
		 */
		
		User[] arr = new User[2];//객체-클래스도 타입. 배열에 담을 수 있다.
		User us2 = new User("김길동", 30, 123456);//힙영역
		arr[0]=us;//스택영역, 주소값 -이는 다시 힙 영역과 연결됨.
		arr[1]=us2;//주소값

		for(User us3 : arr) {//us3는 변수일 뿐. 중요한 건 arr에 있는 us와 us2가 객체니까 "같은 형식"의 객체로 받는다는 것
			System.out.println(us3.getName());
			System.out.println(us3.getAge());
			System.out.println(us3.getRrn());
		}

		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		User[] arr5 = new User[5];
		Scanner scan = new Scanner(System.in);
		int i=0;
		while(i<5) {
			String name=scan.next();
			int age=scan.nextInt();
			int rrn=scan.nextInt();
			 
			User use = new User(name,age,rrn);
			arr5[i]=use;
			i++;
		}
		
		System.out.println(Arrays.toString(arr5));
		
		
		
		
		
	}

}
