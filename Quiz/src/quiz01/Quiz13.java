package quiz01;
import java.util.Arrays;

public class Quiz13 {

	public static void main(String[] args) {
		
		//절대 중복되지 않는 3개의 숫자를 뽑기
		/*
		 * 배열을 랜덤하게 15번정도 섞는다.
		 * 0~2번째 인덱스값을 새로운 배열에 옴겨담는다. 
		 */
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		for(int i=0;i<arr.length;i++) { //랜덤하게 15번 섞는다.     
			
			int ran =(int)(Math.random()*15); //변수 위치를 안쪽에. 바깥쪽에 뽑으면 한번만 실행된다!!!
												//15를 곱하는 이유는 0이상 15미만이 되니까. arr[index] index는 0~14임. 길이-1!
			
			int temp =arr[i]; //temp변수 바로 넣어버리기. 어차피 임시임. int temp = 0;이런거 for문 위에 넣어줄 필요 없음
			arr[i]= arr[ran];
			arr[ran]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
		int[] newarr = new int[3];
		for(int i = 0;i<newarr.length;i++) {  //i는 조건문 안에서만 사용되고 사라진다. 다시 조건문에서 사용해도 됨
			newarr[i]=arr[i]; //새로운 배열에 담는다
		}
		
		System.out.println(Arrays.toString(newarr));
	}
}
