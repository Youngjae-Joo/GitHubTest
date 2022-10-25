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



	}

	public static class Solution {
	    public int[][] solution(int[] num_list, int n) {
	        int[][] answer = new int[num_list.length/n][n];
	        
	        int h=0;
	        for(int i=0;i<num_list.length/n;i++) {
	        	for(int j=0;j<n;j++) {
	        		answer[i][j]=num_list[h];
	        		h++;
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

