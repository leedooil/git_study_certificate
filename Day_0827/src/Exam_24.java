import java.util.Scanner;

public class Exam_24 {

	public static void main(String[] args) {
		// ����� ������ �״뿡�� ����
		
		int a[] = {89,55,78,86,90,56,75,66};
		System.out.print("data : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println("\n");
		// �������Ĺ� -> ��������
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.print("Sort : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
}
