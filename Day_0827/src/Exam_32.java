import java.util.Scanner;

public class Exam_32 {
	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("a = " + a + ", b = " + b);
		
		swapVar(10, 20);
		System.out.println("a = " + a + ", b = " + b);
	}
	
	static void swapVar(int a, int b) {
		int temp = a;
		a=b;
		b=temp;
		System.out.println("a = " + a + ", b = " + b);
	}
}
