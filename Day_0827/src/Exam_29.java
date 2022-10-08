import java.util.Scanner;

public class Exam_29 {

	public static void main(String[] args) {
		// 출력 결과 0001010
		
		int [] a = new int[8];
		int i = 0, n=10;
		while (n != 0) {
			a[i++] = (n%2);
			n /= 2;
		}
		for (i = 7; i >= 0; i--) {
			System.out.printf("%2d", a[i]);
		}
	}
}
