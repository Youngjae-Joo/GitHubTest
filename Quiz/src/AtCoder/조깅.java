package AtCoder;

import java.util.Scanner;

public class 조깅 {
	public static void main(String[] args) {
		//조깅
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		
		int a =Integer.parseInt(time.split(" ")[0]);//걸은 초
		int b =Integer.parseInt(time.split(" ")[1]);//초속
		int c =Integer.parseInt(time.split(" ")[2]);//휴식
		
		int d =Integer.parseInt(time.split(" ")[3]);//걸은 초
		int e =Integer.parseInt(time.split(" ")[4]);//초속
		int f =Integer.parseInt(time.split(" ")[5]);//휴식
		
		int x =Integer.parseInt(time.split(" ")[6]);//지난 시간
		String result="";
		
		int taka =0; 
		for(int i=0;i<=x;i+=(a+c)) {
			if(x-i<a) {
				taka+=(x-i)*b;
			}else {
				taka+=a*b;
			}
		}
		
		int aoki =0;
		for(int i=0;i<=x;i+=(d+f)) {
			if(x-i<d) {
				aoki+=(x-i)*e;
			}else {
				aoki+=d*e;
			}
		}
		
		if(taka>aoki) {
			result+="Takahashi";
		}else if(taka<aoki) {
			result+="Aoki";
		}else if(taka==aoki) {
			result+="Draw";
		}
		System.out.println(result);
	}

}
