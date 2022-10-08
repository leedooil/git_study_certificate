import java.util.Scanner;

public class Exam_20 {

	public static void main(String[] args) {
		// 배열 선언과 동시에 값 할당
		
		int a[] = {10,20,30,40,50};
		int s=0;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"+");
			s += a[i];
		}
		System.out.println("="+s);
	}
}
