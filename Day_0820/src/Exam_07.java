import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		// Ű����� ��ȣ, �̸�, ����, ����, ���� �Է�
		// ����, ����� ���Ͽ� ����� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȣ�� �Է��ϼ��� : ");
		int bun = sc.nextInt(); // ������ �Է� �޾Ƽ� bun�� ����

		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int mat = sc.nextInt();
		
		int sum = (kor+eng+mat);
		double avg = sum / 3.0;
		
		System.out.println();
		System.out.println("��ȣ�� : " + bun);
		System.out.println("�̸��� : " + name);
		System.out.println("������ : " + sum);
		System.out.println("����� : " + avg);
	}

}
