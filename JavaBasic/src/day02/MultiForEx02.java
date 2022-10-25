package day02;

public class MultiForEx02 {

	public static void main(String[] args) {
		
		//회전 할 때마다 횟수가 변하는 중첩반복문
		/*
		 *     *			j 1개 : i가 1행 : 공백 4개
		 *    ***			j 3개 : i가 2행 : 공백 3개
		 *   *****			j 5개 : i가 3행 : 공백 2개
		 *  *******			j 7개 : i가 4행 : 공백 1개
		 * *********  		j 9개 : i가 5행 : 공백 0개
		 * 
		 * 5행				i에 따라서 j가 변함
		 * 					j = i*2-1
		 * 					공백=star-i    조건은 사칙연산하면 엥간하면 나옴
		 */
		
		int star = 5;  //변수를 써주면 변수값을 바꿀 때마다 특정한 규칙에 맞게 출력이 된다. ---->변수를 쓰는 이유!
		for(int i=1;i<=star;i++) {
			
			//공백
			for(int j=1; j<=star-i; j++){
				System.out.print(" ");
			}
			//별
			for(int j=1;j<=i*2-1;j++) { //j가 i*2-1만큼 돌아감. 이해 안되면 머리속으로 2번만 돌려보기. 공책에다 써봐도 좋고!
				
					System.out.print("*");
			}
			
			System.out.println();//줄바꿈
		}
		System.out.println("------------------------------");
		
//		/* 			j     i	공백
//		 * 9==2(star-1)+1 1 0
//		 * 7==2(star-2)+1 2 1 
//		 * 5==2(star-3)+1 3 2
//		 * 3==2(star-4)+1 4 3 
//		 * 1==2(star-5)+1 5 4
//		 * 						
//		 */
		
		for(int i=1;i<=star;i++) {
			
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(star-i)*2+1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
