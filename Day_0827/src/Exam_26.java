import java.util.Scanner;

public class Exam_26 {

	public static void main(String[] args) {
		//  1	2	3	4	5
		//	6	7	8	9	10 
		//	11	12	13	14	15
		//	16	17	18	19	20
		//	21	22	23	24	25
		
		int arr[][] = new int [5][5];
		int cnt=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				cnt++;
				arr[i][j] = cnt;
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
