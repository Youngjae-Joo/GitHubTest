package quiz17;

public class MainClass {
	public static void main(String[] args) {
		
		
		try {
			System.out.println(Validation.masking("950101-4000000"));
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(Validation.palindromeCheck("다 같은 것은 같다"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
