import java.util.Scanner;

public class Exam_35 {
	public static void main(String[] args) {
		//메소드 오버로딩(Override)
		
		System.out.println(max(10, 20));
		System.out.println(max(10, 20, 30));
	}

	static int max(int a, int b) {
		int max = (a>b) ? a : b;
		return max;
	}
	
	static int max(int a, int b, int c) {
		int max = (a>b) ? a : b;
		max = (max < c) ? c : max;
		return max;
	}
}	
