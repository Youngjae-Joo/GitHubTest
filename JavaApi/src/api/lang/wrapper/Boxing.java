package api.lang.wrapper;

public class Boxing {
	public static void main(String[] args) {
		
		int a =100;
		double b = 3.14;
		Long c = 200L;
		
		//기본형->객체형 포장하는 작업을 boxing 
		Integer val = new Integer(a);
		Double val2 = new Double(b);
		Long val3 = new Long(c);
		
		Object[] arr = {val, val2, val3};//객체형 변수를 Object배열에 저장
		
		//객체형->기본형 변경하는 작업 unboxing
		int a1=val.intValue();
		double b1=val2.doubleValue();
		Long c1 = val3.longValue();
		
		
		
		
	}

}
