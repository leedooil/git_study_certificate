import java.util.Scanner;

public class Exam_23 {

	public static void main(String[] args) {
		// 사랑과 정렬을 그대에게 정렬
		
		int a[] = {89,55,78,86,90,56,75,66};
		System.out.print("data : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println("\n");
		// 선택정렬법 -> 오름차순
		System.out.print("data : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i]+"\t");
		}
	}
}
