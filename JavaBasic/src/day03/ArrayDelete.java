package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {
	public static void main(String[] args) {
		
		//배열에서 삭제 개념은 없습니다. 배열은 고정이기 때문. 삭제되는 것처럼 보여주는건 가능
		/*
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 4;i<arr.length-1;i++) { //arr.length까지 돌리면 마지막 뒤에까지 돌아가게 됨. error!
			arr[i]=arr[i+1];
		}
		System.out.println(Arrays.toString(arr)); //{1,2,3,4,6,7,8,9,10,10,}
		*/
		Scanner scan = new Scanner(System.in);
		
		String[] arr = {"어피치","라이언","제이지","네오","무지","튜브"};
		System.out.print("삭제할이름>");
		String name = scan.next();
		
		
		
		int count =arr.length; //삭제가 일어날 때 하나씩 감소
		for(int i=0;i<count;i++) {
			
			if(name.equals(arr[i])) {
				for(int j=i;j<count-1;j++) {
					arr[j]=arr[j+1]; //찾은 위치에서 뒤 원소를 당김
				}
				count--;//개수 감소. 왜? -1을 하지 않으면 반복문을 돌며 배열범위 밖의 값도 돌기 때문
			}
		}
		
		//출력
		String str ="[";
		for (int i = 0; i<count; i++) {
			str +=arr[i];
			if(i==count-1) {
				str+="]";
				break;
			}
			str +=", ";
		}
		System.out.println(str);
	}

}
