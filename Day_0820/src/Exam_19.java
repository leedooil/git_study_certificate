import java.util.Scanner;

public class Exam_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �Էµ� ������ 80 ~ 90 �̸� PASS �ƴϸ� FAIL

		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		if(score>=80) {
			if(score<=90) {
				System.out.println("PASS");
			}else {
				System.out.println("FAIL");
			}
		}else {
			System.out.println("�õ����� Ż�� ����������.");
		}
	}

}
