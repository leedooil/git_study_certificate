import java.util.Scanner;

public class Exam_33 {
	public static void main(String[] args) {
		int [] a = {10,20};
		System.out.println(a);
		System.out.println("a[0] = " + a[0] + ", a[1] = " + a[1]);
		
		swapVar(a);
		System.out.println("a[0] = " + a[0] + ", a[1] = " + a[1]);
	}
	
	static void swapVar(int a[]) {
		int temp = a[0];
		a[0]=a[1];
		a[1]=temp;
	}
}
