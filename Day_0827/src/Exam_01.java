import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		// ������ �Է��ϼ���
		// 10�� ¦�� �Դϴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int a = sc.nextInt();
		
		if(a % 2 ==0) {
			System.out.println(a + "�� ¦���Դϴ�.");
		}else {
			System.out.println(a + "�� Ȧ���Դϴ�.");
		}
	}

}
