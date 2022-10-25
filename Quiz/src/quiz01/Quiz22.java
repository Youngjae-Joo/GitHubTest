package quiz01;
import java.util.Scanner;

public class Quiz22 {
	public static void main(String[] args) {
		method1();
		System.out.println(method2("hello"));
		System.out.println(method3(1,2,2.7));
		System.out.println(method4(8));
		method5("안녕",7);
		System.out.println(maxNum(2,7));
		System.out.println(abs(-64));
		String str =java(9);
		System.out.println(str);
		System.out.println(sum(6));
		
	}//바로 출력했는데, 어떻게 받는지도 확인하기. int인지, double인지, String인지 등



	static void method1() {
		System.out.println("안녕");
	}
	static String method2(String s) {
		return s;
	}
	static double method3(int a, int b, double c) {
		double d = a+b+c;
		return d;
	}
	static String method4(int a) {
		if(a%2==0) {
			return "짝수";
		}else {
			return "홀수";
		}
	}
	static void method5(String a, int b) {
		for(int i=1;i<=b;i++) {
			System.out.print(a);
		}
		System.out.println();
	}
	static int maxNum(int a, int b) {
		return a>b?a:b;
	}
	static int abs(int a) {
		return a>0? a:-a;
	}

	static String java(int a){
		String s="";
		for(int i=1;i<=a;i++) {
			if(i%2==0) {
				s+="바";
			}else {
				s+="자";
			}
		}
		return s;
	}

	static int sum(int a) {
		int sum =0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				sum+=i;
			}
		}
		return sum;
	}



}
