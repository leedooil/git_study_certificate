import java.util.Scanner;

public class Exam_30 {

	public static void main(String[] args) {
		// ���� �迭
		
		int [][] var = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < var.length; i++) {
			for (int j = 0; j < var.length; j++) {
				System.out.print(var[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		int [][] arr = {{1,2,3,4},{5,6},{7,8,9}};
		System.out.println("�ټ� : " + arr.length);
		System.out.println("0�� �� ĭ�� : " + arr[0].length);
		System.out.println("1�� �� ĭ�� : " + arr[1].length);
		System.out.println("2�� �� ĭ�� : " + arr[2].length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
