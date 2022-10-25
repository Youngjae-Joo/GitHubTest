package day01;

public class OperatorEx01 {

	public static void main(String[] args) {
		
		//단항 연산자
		int i = -3;
		int j = -i; 
		System.out.println(j); //3
		
		//++, --
		int k = 1;
		k++;
		System.out.println(k); //2
		k--;
		System.out.println(k);//1
		
		//증감연산자는 a++, ++a 의미가 조금 다름.
		k = 1;
		int h = k++; //먼저 대입, 이후에 증가. 연산이 다 끝나고 계산한다 
		System.out.println("k값:" + k); //연산이 모두 끝난 후 k에 1을 더한 2가 된 것
		System.out.println("h값:" + h); //대입한 k = 1;값이 들어가서 h가 1이 된 것
		
		k = 1;
		int g =++k; //먼저 증가, 이후에 대입
		System.out.println("k값:" + k);
		System.out.println("g값:" + g);
		
		k = 1;
		System.out.println(k++); //k가 1인 상태로 출력되었고, 이후에 1이 붙음
		System.out.println(++k); //k에 1이 붙은 상태에 1이 더 추가되었고 그 후 출력이 된 것.
		
		System.out.println("--------------------------");
		//~ 연산자 -2진수값을 반대로
		byte b= 10; //0000 1010 뒤집으면 1111 0101이 되고 1을 더하면 1111 0110이며 이는 -10이다
		System.out.println(~b); //1111 0101 이것이 -11인지는 어떻게 아는가? 더했을때 0가 되어야 함. 
		System.out.println(~b + 1); //-10  n을 이진수로 만들고 뒤집고 1을 더하면 -n값이 나온다
		
		System.out.println("--------------------------");
		
		System.out.println(!true); //false
		boolean bool = !false;
		System.out.println(bool); //true
		
	}
	
}
