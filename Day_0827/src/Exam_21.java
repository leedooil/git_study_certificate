import java.util.Scanner;

public class Exam_21 {

	public static void main(String[] args) {
		// �ִ밪, �ּҰ�
		
		int arr[] = {7,4,9,8,6,4,3,2};
//		int max = 0;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println();
		
//		int min = 0;
		int min = arr[0];  //�ִ밪 ���� �ʱ�ȭ : ���� ������, �ּҰ� ���� �ʱ�ȭ : �迭�������� �� ū��
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min : " + min);
	}
}
