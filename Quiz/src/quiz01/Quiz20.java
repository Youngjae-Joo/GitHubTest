package quiz01;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		//ABC를 char배열에 담아 보세요
		
		char[] arr2 = "ABC".toCharArray();//문자열 안만들고 바로 입력해도 됨
		System.out.println(Arrays.toString(arr2));
		
		/*또는(기본해체)
		System.out.println(abc.charAt(0));
		System.out.println(abc.charAt(1));
		System.out.println(abc.charAt(2));
		 */

		/*또는(기본)
		 * char[] brr = new char[abc.length()];
		 * 
		 * for(int i =0; i<abc.length();i++) {
		 *    	brr[i]=abc.charAt(i);
		 * 	   }
		 */


		/*
		 * 첫 번째 입력받은 값을 한 글자씩 나누어서 출력해 보세요
		 * SSFDSAFSADFSDAFASFSDAFSDFSDFSD
		 */

		String str2 = scan.next();
		char[] arr = str2.toCharArray();

		for(int i =0 ; i<str2.length();i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		/*
		 * 두 문자열을 입력받습니다.
		 * 첫 입력에 알파벳이 주어집니다.
		 * 두번째 입력에는 알파벳으로 만들어진 문자열이 주어집니다
		 *-> B
		 * ->ASFSDSADGASGASG
		 *  
		 * 첫번째 입력된 알파벳이 두번째 입력에 몇개 포함되어 있는지 출력.
		 */

		
		//문자열 다루기 -> 문자열과 문자는 다른 것. 둘 다 문자로 바꾸던지 둘 다 문자열로 바꾸던지 해야 함. 자바에선 안됨
		//문자열은 equals로 비교, 문자(이때 문자는 char로 변환되어 있음)는 ==으로 비교가능
		String find = scan.next();
		String str = scan.next();

		String[] f =str.split("");
		int len = str.length();
		int count = 0;

		for(int i =0;i<len;i++) {
			if(f[i].equals(find)) {
				count++;
			}

		}
		System.out.println(count);




	}
}
