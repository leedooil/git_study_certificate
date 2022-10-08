import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("계산기 : "); // 8 - 5
		int a = sc.nextInt(); // 정수
		String op = sc.next(); // 연산자
		int b = sc.nextInt(); // 정수
		
		switch (op) {
			case "+":
				System.out.println(a + " + " + b + " = " + (a+b));
				break;
			case "-":
				System.out.println(a + " - " + b + " = " + (a-b));
				break;
			case "*":
				System.out.println(a + " * " + b + " = " + (a*b));
				break;
			case "/":
				System.out.println(a + " / " + b + " = " + (a/b));
				break;
			case "%":
				System.out.println(a + " % " + b + " = " + (a%b));
				break;
			default:
				System.out.println("입력오류입니다.");
				break;
			}
	}

}
