import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : "); // 8 - 5
		int a = sc.nextInt(); // ����
		String op = sc.next(); // ������
		int b = sc.nextInt(); // ����
		
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
				System.out.println("�Է¿����Դϴ�.");
				break;
			}
	}

}
