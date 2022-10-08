import java.util.Scanner;

public class Exam_27 {

	public static void main(String[] args) {
		//  1	6
		//	2	7
		//	3	8
		//	4	9
		//	5	10
		
		int arr[][] = new int [5][5];
		int cnt=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				cnt++;
				arr[j][i] = cnt;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
