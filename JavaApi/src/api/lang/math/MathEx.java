package api.lang.math;

public class MathEx {
	public static void main(String[] args) {
		
		//올림
		double d=Math.ceil(1.3);
		System.out.println(d);
		
		//내림
		double d2 = Math.floor(1.2);
		System.out.println(d2);
		
		//반올림
		double d3=Math.round(3.14);
		System.out.println(d3);
		
		//루트값
		double d4=Math.sqrt(16);
		System.out.println(d4);
		
		//절대값
		double d5=Math.abs(-4);
		System.out.println(d5);
		
		//대소비교
		int i1=Math.max(5, 3);
		System.out.println(i1);
		
		int i2 = Math.min(5, 3);
		System.out.println(i2);
		
		//현재상태에서 가장 가까운 정수를 실수형태로
		System.out.println(Math.rint(-7.21));
		
		
	}

}
