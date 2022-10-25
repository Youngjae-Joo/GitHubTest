package AtCoder;

import java.util.Scanner;

public class 행렬_이항전위 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String row1=scan.nextLine();
		int h = Integer.parseInt(row1.split(" ")[0]);
		int w = Integer.parseInt(row1.split(" ")[1]);
		int[][] a = new int[h][w];

		for(int i=0;i<h;i++) {
			String row2=scan.nextLine();
			for(int j=0;j<w;j++) {
				a[i][j]=Integer.parseInt(row2.split(" ")[j]);
			}
		}

		int[][] b = new int[w][h];
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++) {
				b[i][j]=a[j][i];
				StringBuffer sb= new StringBuffer((b[i][j]+" "));
				System.out.print(sb);	
			}
			System.out.println();
		}

		//System.out.println(Arrays.deepToString(b));
	}

}
