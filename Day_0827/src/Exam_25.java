import java.util.Scanner;

public class Exam_25 {

	public static void main(String[] args) {
		// 2���� �迭
		
//		int arr[][] = new int[5][4]; // row(��), col(�÷�)
		
		int arr[][] = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
