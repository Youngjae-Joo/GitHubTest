package day10.exception.trycatch;

public class MultiCatchEx01 {
	public static void main(String[] args) {
		
		//main에 args 사용방법
		//String[] args는 실행할 때 무언가를 받을 수 있다는 뜻.
		//run -> run configration -> arguments탭에 ${string_prompt}//실행시 값을 입력받음. 스페이스 기준 인덱스 0번째, 1번째, 2번째...
		
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int n1 = Integer.parseInt(data1);
			int n2 = Integer.parseInt(data2);
			
			System.out.println("두 수의 합:"+ (n1+n2));
			String s = null;
			s.charAt(0);
			
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("매개값은 2개 입력하세요");
		} catch (NumberFormatException e) {
			System.out.println("매개값은 숫자로 입력하세요");
		} catch (Exception e) {//어떤 실행 예외든 처리가 가능(예외의 부모) ---클래스의 상하관게는 커서를 두고 ctrl + t를 하면 됨
			System.out.println("기타 예외 입니다");
		}
		
		
		
		
		
	}

}
