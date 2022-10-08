import java.util.Scanner;

public class Exam_19 {

	public static void main(String[] args) {
		// 배열 : 동일한 이름을 가진 기억 공간
		
		int a; // 정수를 저장할 수 있는 변수 선언
//		a = 10;
		int[] arr; // 배열변수 선언
		arr = new int[10]; // 5개의 공간 확보
		
//		int[] arr = new int[5]; 선언과 동시에 공간확보
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		
//		System.out.println("arr[0] : " + arr[0]);
//		System.out.println("arr[1] : " + arr[1]);
//		System.out.println("arr[2] : " + arr[2]);
//		System.out.println("arr[3] : " + arr[3]);
//		System.out.println("arr[4] : " + arr[4]);
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
