package quiz01;
import java.util.Arrays;

public class Quiz23 {
	public static void main(String[] args) {
		char[] arr = {'a','b','c'};
		String result = method6(arr);
		System.out.println(result);
		int[] arr2 = {1,2,3};
		System.out.println(method7(arr2));
		System.out.println(Arrays.toString(method8("홍길동","이순신")));
		
	}
	
	
	static String method6(char[] arr) {
		String s = "";
		for(int i=0;i<arr.length;i++) {
			s+=arr[i];
		}
		return s;
	}
	static int method7(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum+=i;
		}
		return sum;
	}
	static String[] method8(String a, String b) {
		String[] str = new String[2];
		str[0]=a;
		str[1]=b;
		
		return str;
	}
	
}
