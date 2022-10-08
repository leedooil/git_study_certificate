import java.util.Scanner;

public class Exam_34 {
	public static void main(String[] args) {
		int arr[] = { 5, 8, 4, 9, 7 };
		arrSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

	static void arrSort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}
}
