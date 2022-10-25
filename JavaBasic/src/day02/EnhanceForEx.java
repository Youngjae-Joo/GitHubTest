package day02;

public class EnhanceForEx {
	
	public static void main(String[] args) {
	
	 int[] arr = {1,2,3,4,5,}; 
	 
	 //일반 for
//	 for(int i = 0; i<arr.length;i++) {
//		System.out.println(arr[i]); 
//	 }
	
	 
	 //향상된 for 
	 for(int a : arr ){
		 System.out.println(a);
		 
	 }
	 
	 System.out.println("----------------------------");
	 
	 String[] sArr = {"월","화","수","목","금","금","금"};
	 for(String s: sArr) {
		 System.out.println(s);
	 }
	 
	 System.out.println("----------------------------");
	 
	 //배열 요소들의 합계와 평균을 소수 2자리만 출력
	 int[] score = {34,54,23,53,65};
	 int sum =0;
	 
	 for(int i:score) {
		 sum+=i;//누적
	 }
	 System.out.println("합계:"+sum);
	 System.out.println("평균:" + (double)sum/score.length);//형변환을 출력문 안에서 했다.
	 System.out.printf("평균 :%.2f\n",(double)sum/score.length);//double이 기본이기 때문에 float라는 뜻으로 f사용.소수 두자리수니까 %.2사용
	 
	 
 }
}
