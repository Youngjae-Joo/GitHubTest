package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
	public static void main(String[] args) {
		
		//배열한계점 - 크기가 고정
		//입력받은 문자열을 배열에 순서대로 저장.
		
		/* 참고)next()->스페이스바을 기준으로 앞에까지 입력 받음, nextLine()->엔터까지 포함해서 기준으로 값을 받음, 
		 * nextInt()->문자열로 받는 값을 정수로 치환. 그래서 엔터를 포함하지 않고 직전까지 받음. ex) 5 enter를 하면 nextInt는 5만 받음. 
		 * nextint와 nextline을 혼용하면 nextint가 씹힌다
		 */
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[100];
		
		//"그만" 문자가 들어오기 전까지 입력.
		
		int count = 0; //인덱스를 나타내는 변수. 무한반복문에서 이렇게 사용해도 된다.
		while(true) {
			
			System.out.print(">");
			String menu = sc.nextLine();
			
			if(menu.equals("그만")) {
				break;
			}
			
			arr[count] = menu; //저장
			count++;//인덱스 증가
		}
		//출력도 반복문을 돌려서. 그냥 출력하면 입력되지 않은 값들이 null로 모두 출력됨.
		String str ="["; //문자열에 숫자나 문자 더하기
		
		for(int i=0;i<count;i++) {//7개를 받았을 경우 count는 8! break를 했으니까 "그만"을 입력해도 count는 증가하지 않음
			str +=arr[i]; //값 붙이고
			if(i==count-1) {  //마지막이면 ,를 붙이지 않고 ]를 붙임 
			str +="]";
			break;
			}
			str += ", ";  //, 붙이기
			
		}
			System.out.println(str);
	}

}
