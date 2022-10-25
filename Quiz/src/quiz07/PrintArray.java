package quiz07;

public class PrintArray {

	String toArray(int[] a){
		String answer="[";
		for(int i=0;i<a.length;i++) {
			if(i<a.length-1) {
				answer+=a[i]+", ";
			}
			else if(i==a.length-1) {
				answer+=a[i]+"]";
			}
		}
		return answer;
	}
	
	String toArray(char[] c) {
		String answer="[";
		for(int i=0;i<c.length;i++) {
			if(i<c.length-1) {
				answer+=c[i]+", ";
			}
			else if(i==c.length-1) {
				answer+=c[i]+"]";
			}
		}
		return answer;
	}
	
	String toArray(String[] s) {
		String answer="[";
		for(int i=0;i<s.length;i++) {
			if(i<s.length-1) {
				answer+=s[i]+", ";
			}
			else if(i==s.length-1) {
				answer+=s[i]+"]";
			}
		}
		return answer;
	}
	
}
