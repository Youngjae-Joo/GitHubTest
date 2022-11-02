package This.is.java.exercise09;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int selectNo=0;
		Scanner scan = new Scanner(System.in);

		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");

				try {
					selectNo = scan.nextInt();
				}catch(Exception e) {
					scan = new Scanner(System.in);
				}
				
				if(scores==null&&studentNum==0&&selectNo!=1&&selectNo!=5) {
					System.out.println("1번부터 입력하세요");
					continue;
				}
				
				

			if(selectNo>=1&&selectNo<=5) {
			
				if(selectNo == 1) {
					System.out.print("학생수>");
					studentNum=scan.nextInt();
					if(studentNum<=0) {
						System.out.println("학생수는 1명 이상입니다");
						continue;
					}else {
						scores=new int[studentNum];
					}
				}else if(selectNo == 2){
					for(int i=0;i<scores.length;i++) {
						System.out.print("scores["+i+"]>");
						int score = scan.nextInt();
						scores[i]=score;
					}

				}else if(selectNo == 3){
					for(int i=0;i<scores.length;i++) {
						System.out.print("scores["+i+"]>");
						System.out.println(scores[i]);
					}
				}else if(selectNo == 4){
					int max=0;
					double average=0;
					double sum=0;

					for(int i=0;i<scores.length;i++) {
						if(max<scores[i]) {
							max=scores[i];
						}
						sum+=scores[i];
					}

					average=sum/scores.length;

					System.out.println("최고 점수>"+max);
					System.out.println("평균 점수>"+average);

				}else if(selectNo == 5) {
					System.out.println("프로그램 종료");
					run = false;

				}
			}else {
				System.out.println("1~5만 입력하세요");
			}
		}

		scan.close();



	}

}