package quiz01;

public class Quiz10 {
	public static void main(String[] args) {
		
		//금액을 가장 큰 금액부터 나누어서 각 동전별로 몇개가 나와야 하는지 출력. 
		int[] arr = {1000,500,100,50,10};
		int money = 17780;
		
		int a=0;
		int b=0;
		int i = 0;
		while(i<arr.length) {
			
			a = money/arr[i];
			b = money%arr[i];
			money=b;
			
			System.out.println(arr[i]+"원:"+a);
			
			i++;
		}
//			
//			  더 간단하게, money = money%arr[i]; a랑 b를 만들 필요도 없음. 어차피 while에서 첫번째 반복이 끝나면 money의 값은 새로 지정되고, 그걸로 다시 계산할 거니까
//			
//			int i = 0;
//			while(i<arr.length) {
//				
//				money=money%arr[i];
//				
//				System.out.println(arr[i]+"원:"+money/arr[i]);
//				i++;
//			}
//			
		
		
	}

}
