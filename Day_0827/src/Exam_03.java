import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		// switch ~ case
		
		int sw = 3;
		switch (sw) { // ����, ����
			case 1:	// ����, ���, ���ڿ�, ����
				System.out.println("1�Դϴ�.");
				break;
			case 2:	
				System.out.println("2�Դϴ�.");
				break;
			case 3:	
				System.out.println("3�Դϴ�.");
				break;
			case 4:	
				System.out.println("4�Դϴ�.");
				break;
			case 5:	
				System.out.println("5�Դϴ�.");
				break;
			default: // �ش�Ǵ� ���� ������(else) 
				System.out.println("�Է¿����Դϴ�.");
		}
		
	}

}
