package day02;

public class WhileEx06 {

	public static void main(String[] args) {
		
		//배열과 반복문
		//반복할때 =<가 아닌 <를 하면 됨. 왜? 배열의 index 번호에서 마지막은 길이-1임을 기억!0부터 시작하니까 마지막이 길이의 숫자와 다르다
		//시작은 0~길이미만
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		
		int sum = 0;
		int i=0;
		while(i < arr.length) { //배열의 길이를 알아내는 식, 미만으로 쳐야 인덱스 처음 번호인 0부터 시작해서 마지막까지 가능. --->   i <=arr.length-1 단, 이때 i는 1부터 시작
			
			
			//System.out.println(i); 0...9
			//System.out.println(arr[i]); -->배열 안에 있는 값들을 나타냄 	
		sum += arr[i];
			
			
		i++;
		
		}
		System.out.println("배열요소의 합:" + sum);
	}
}
