import java.util.Scanner;

public class Exam_19 {

	public static void main(String[] args) {
		// �迭 : ������ �̸��� ���� ��� ����
		
		int a; // ������ ������ �� �ִ� ���� ����
//		a = 10;
		int[] arr; // �迭���� ����
		arr = new int[10]; // 5���� ���� Ȯ��
		
//		int[] arr = new int[5]; ����� ���ÿ� ����Ȯ��
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		
//		System.out.println("arr[0] : " + arr[0]);
//		System.out.println("arr[1] : " + arr[1]);
//		System.out.println("arr[2] : " + arr[2]);
//		System.out.println("arr[3] : " + arr[3]);
//		System.out.println("arr[4] : " + arr[4]);
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
