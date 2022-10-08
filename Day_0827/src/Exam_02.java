import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		// a = 10, b = 7;
		// 1 -> +
		// 2 -> -
		// 3 -> *
		// 4 -> /
		// 5 -> %
		
		Scanner sc = new Scanner(System.in);
		System.out.print("계산기 : "); // 8 - 5
		int a = sc.nextInt(); // 정수
		String op = sc.next(); // 연산자
		int b = sc.nextInt(); // 정수
		
		// op == "+"
		if (op.equals("+")) {
			System.out.println(a + op + b + "=" + (a+b));
		}else if (op.equals("-")) {
			System.out.println(a + op + b + "=" + (a-b));
		}else if (op.equals("*")) {
			System.out.println(a + op + b + "=" + (a*b));
		}else if (op.equals("/")) {
			System.out.println(a + op + b + "=" + (a/b));
		}else if (op.equals("%")) {
			System.out.println(a + op + b + "=" + (a%b));
		}else {
			System.out.println("연산자 오류입니다.");
		}
	}

}
