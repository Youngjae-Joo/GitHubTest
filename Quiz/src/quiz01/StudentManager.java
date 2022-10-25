package quiz01;
import java.util.Scanner;

public class StudentManager {
		
	public static void main(String[] args) {
		/*
		index를 이동해서 회원정보를 출력하는 프로그램 입니다.
		index의 시작은 -1에서 시작하고
		입력이 될떄마다 count를 증가시켜주면 됩니다.
		*/
		Scanner scan = new Scanner(System.in);
		String[] nameList = new String[100];
		String[] genderList = new String[100];
		int[] ageList = new int[100];
		
		//현재 고객수가 몇명이 저장 되었는지 알기 위한 변수 count선언
		int count = 0;
		//index를 조정할 변수 선언
		int index = -1;
	boolean flag =true;
		while(flag) {
			System.out.println("[Info]-고객수:" + count + ", 현재위치:" + index);
			System.out.println("[메뉴]1.Insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete, 7.Quit");
			System.out.print("메뉴입력>");
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("==========고객정보 입력을 시작합니다==========");
				/*
				이름, 성별, 나이 를 입력받아서 각각 배열에 저장
				사람 수를 증가 시킨다.
				*/
				index=count-1;
				index++;
				String name = scan.next();
				nameList[index]=name;
				String gender = scan.next();
				genderList[index]=gender;
				int age =scan.nextInt();
				ageList[index]=age;
				count++;
				
				System.out.println("=======================================");
				
				break;
			case 2:
				System.out.println("==========이전 고객정보를 출력합니다==========");
				/*
				 * index가 0이하라면 "이전 고객정보가 없습니다"
				 * 그렇지 않으면 index를 이동해서 이전고객 정보를 출력하면 됩니다.
				 */
				if(index<=0) {
					System.out.println("이전 고객정보가 없습니다");
					index=0;
				}else {
					index--;
					System.out.println(nameList[index]);
					System.out.println(genderList[index]);
					System.out.println(ageList[index]);
					
				}
				
				System.out.println("=======================================");
				
				break;
			case 3:
				System.out.println("=========다음 고객정보를 출력합니다===========");
				/* index를 다음으로 이동하고 다음고객정보를 출력합니다.
				 * 다음 고객정보를 출력할 수 없는 조건을 생각해서 "다음 고객정보가 없습니다"
				 * 그렇지 않으면 index를 이동해서 다음고객 정보를 출력하면 됩니다.
				 */
				if(index>=count-1) {     //index는 사람수보다 무조건 하나 적음. 0p에 1명, 1p까지면 2명, 2p까지면 3명..
										//count가 2일때 인덱스는 0에 있어야 다음이 있다. index>=count-1일때 다음 정보가 없다.
					System.out.println("다음 고객정보가 없습니다");
				}else {
					index++;
					System.out.println(nameList[index]);
					System.out.println(genderList[index]);
					System.out.println(ageList[index]);
				}
				System.out.println("=======================================");
								
				break;
			case 4:
				System.out.println("=========현재 고객정보를 출력합니다===========");
				/* 현재 index의 위치의 고객정보를 출력합니다.
				 * 현재정보를 출력할수 있는 조건을 생각해서 현재 정보를 출력하면 됩니다.
				 * 그렇지 않으면 "현재 고객정보가 없습니다" 를 출력하면 됩니다
				 * 
				 */
				if(index>=count||index<0) {//index가 0보다 작으면 표지! 그 위치의 정보는 없다. 당연히 count 이상일 수도 없고.
					System.out.println("현재 고객정보가 없습니다");
				} else {
					System.out.println(nameList[index]);
					System.out.println(genderList[index]);
					System.out.println(ageList[index]);
				}
				
				System.out.println("=======================================");

				
				break;
			case 5:
				System.out.println("=========현재 고객정보를 수정합니다============");
				/* 현재 index의 위치의 고객정보를 수정합니다.
				 * 현재정보를 출력할수 있는 조건을 생각해서 
				 * 스캐너를 통해서 순서대로 이름, 성별, 나이를 입력받아서 배열의 값을 수정하세요. 
				 * 
				 * 그렇지 않으면 "수정할 데이터가 없습니다" 를 출력하면 됩니다
				 */
				if(index>=count) {
					System.out.println("수정할 데이터가 없습니다");
				} else {
					String nname = scan.next();
					nameList[index]= nname;
					String ngender =scan.next();
					genderList[index]=ngender;
					int nage=scan.nextInt();
					ageList[index]=nage;
					
				}
				
				System.out.println("=======================================");
				
				break;
			case 6:
				System.out.println("=========현재 고객정보를 삭제합니다============");
				/* 현재 index의 위치의 고객정보를 삭제합니다.
				 * 현재정보를 삭제할 수 있는 조건을 생각해서
				 * 현재 index부터 ~~뒤에 있는 배열요소를 당겨와서 덮어 씌웁니다.
				 * 고객수 를 감소시킵니다.
				 * 
				 * 그렇지 않으면 "삭제할 데이터가 존재하지 않습니다" 를 출력하면 됩니다
				 * 
				 */
				if(index>=count) {
					System.out.println("삭제할 데이터가 존재하지 않습니다");
				} else {
					for(int i=index;i<count-1;i++) { //적힌 사람수까지만 돌면 된다. 단, 그냥 count면 마지막 번째까지 돌고, 범위를 벗어난 값을 돌게 된다. 따라서 -1을 해주는 것.
						nameList[i]=nameList[i+1];
						genderList[i]=genderList[i+1];
						ageList[i]=ageList[i+1];
					}
					count--;
				}
				
			
				break;
				
			case 7:
				System.out.println("프로그램을 종료합니다");
				/* 
				 * 무한루프를 완전히 탈출 
				 */
				flag=false;
				scan.close();
				
				break;
			default:
				System.out.println("메뉴를 잘못 입력했습니다.");
				
				break;
			}
		
		}
	}



}