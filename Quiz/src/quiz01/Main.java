package quiz01;

import java.util.*;

public class Main{
	public static void main(String[] args) {
		//				System.out.println(Solution.solution(" WITh GREAT POWER   "));
		//				
		//				String s =" WITH   GREAT POWER   ";
		//				String[] sr=s.split(" ");
		//				System.out.println(Arrays.toString(sr));

		System.out.println(Solution.solution("5525","1255"));

	}

	//공던지기
	//	public static class Solution {
	//		 public int solution(int[] numbers, int k) {
	//		        int answer = 0;
	//		        String s ="";
	//		        for(int i=0;i<numbers.length;i++) {
	//		        	s+=numbers[i];
	//		        }
	//		        String s2="";
	//		        for(int i=1;i<=k-1;i++) {
	//		        	s2+=s;
	//		        }
	//		        
	//		        
	//		        for(int i=0;i<k;i+=2) {
	//		        	answer=Integer.parseInt(Integer.toString(s2.charAt(1+i)-48));
	//		        }
	//		        
	//		        
	//		        return answer;
	//		    }
	//		}


	//			for(int i=0;i<x.length;i++) {
	//				if(Y.contains(x[i])) {
	//					Y=Y.replaceFirst(x[i], "");
	//					z+=x[i];
	//				}
	//				
	//				if(Y.equals("")) {
	//					break;
	//				}
	//			}
	public class Solution {
		public static String solution(String X, String Y) {
			String answer = "";
			int[] xcount = new int[10];
			int[] ycount = new int[10];

			for(int i=0;i<X.length();i++) {
				xcount[X.charAt(i)-48]++;
			}
			for(int i=0;i<Y.length();i++) {
				ycount[Y.charAt(i)-48]++;
			}

			for(int i=9;i>=0;i--) {
				String result="";
				if(ycount[i]!=0&&xcount[i]!=0){
					result+=i;
					result=result.repeat(Math.min(xcount[i], ycount[i]));
				}
				answer+=result;
			}
			if(answer.length()==0) {
				answer="-1";
			}else {
				if(answer.charAt(0)=='0') {
					answer="0";
				}
			}
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

