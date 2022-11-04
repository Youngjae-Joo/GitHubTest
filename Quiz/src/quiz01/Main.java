package quiz01;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main{
	public static void main(String[] args) {
		//				System.out.println(Solution.solution(" WITh GREAT POWER   "));
		//				
		//				String s =" WITH   GREAT POWER   ";
		//				String[] sr=s.split(" ");
		//				System.out.println(Arrays.toString(sr));

		System.out.println(Solution.solution("3 + 4"));

	}

	public static class Solution {
		public static int solution(String my_string) {
	        int answer = 0;
	        my_string=my_string.replaceAll(" ", "");
	        answer = Integer.parseInt(my_string);
	        return answer;
	    }
	}


					


	//
	//		public static class Solution {
	//			public static String solution(String s) {
	//				String answer = "";
	//				String[] sr=s.split(" ");
	//				for(int i=0;i<sr.length;i++) {
	//					String[] str=sr[i].split("");
	//					for(int j=0;j<str.length;j++) {
	//						if(j%2==0) {
	//							answer+=str[j].toUpperCase();
	//						}else if(j%2!=0) {
	//							answer+=str[j].toLowerCase();
	//						}
	//					}
	//					if(i!=sr.length-1) {
	//						answer+=" ";
	//					}
	//	
	//				}
	//				return answer;
	//			}
	//		}
	//
	//






}

