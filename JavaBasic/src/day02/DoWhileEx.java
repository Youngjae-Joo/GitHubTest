package day02;

public class DoWhileEx {
	public static void main(String[] args) {

		//while문이 do~while 대체할 수 있어서 많이 사용하지 x 

		//1~10합
		/*int sum = 0;
		 *int i = 1;
		 *while(i<=10) {
		 *	sum+=i;
		 *	
		 *	i++;
		 *}
		 *System.out.println(sum);
		 */
		
		
		//do~while문은 조건이 거짓이더라도 무조건 한번은 실행을 합니다. 
		int sum=0;
		int i = 1;
		do {
			
			sum+=i;
			i++;			// 다 끝나면 i=11이지만 11!<=10이므로 1~10까지만 나오고, 더 이상 돌지 않는다. 
		}while(i<=10);

		System.out.println(sum);






	}

}
