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
		System.out.print("���� : "); // 8 - 5
		int a = sc.nextInt(); // ����
		String op = sc.next(); // ������
		int b = sc.nextInt(); // ����
		
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
			System.out.println("������ �����Դϴ�.");
		}
	}

}
