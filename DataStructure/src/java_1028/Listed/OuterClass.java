package java_1028.Listed;

public class OuterClass {
	//내포 클래스-다른 클래스 안에 만들어진 클래스
	class Innner{
		public int num;
	}

	//버전17이라 에러 발생하지 않음. 알아서 내부에서 바꿔버림. 11버전에선 내포클래스 안에 static 멤버가 있으면 인스턴스 생성없이 사용할 수 있도록 static을 추가
	class StaticInner{
		public int num;
		public static int share;
	}

	public void method() {
		//메서드 안에 만들어진 클래스-Local Inner
		//메서드 안에서만 사용이 가능한 클래스
		//메서드 안에 만들어 놓고 쓰다가 다른 메서드에서도 필요해지면 그때 꺼내서 inner class로 사용하는 식 
		class LocalInner{
			public int num;
		}
	}
	
	
	
	
	

}
