import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		System.out.println(sum(1,10));
		int a[] = {1,2,3,4,5};
		System.out.println(sum(a));
	}
	
	// 메소드 오버로딩
	
	public static int sum(int n, int m) {
		int s=0;
		for (int i = n; i <= m ; i++) {
			s+=i;
		}
		return s;
	}
	
	public static int sum(int arr[]) {
		int s=0;
		for (int i = 0; i < 5 ; i++) {
			s+=arr[i];
		}
		return s;
	}

}
