import java.util.Scanner;

public class Exam_28 {

	public static void main(String[] args) {
		//  1	2	3	4	10	
		//	5	6	7	8	26
		//	9	10	11	12	42	
		
		int arr[][] = new int [5][5];
		int cnt=0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				cnt++;
				arr[i][j] = cnt;
				arr[i][4] = arr[i][4] + cnt; // 가로합
				arr[4][j] += cnt; // 세로합
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
