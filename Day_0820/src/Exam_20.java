import java.util.Scanner;

public class Exam_20 {

	public static void main(String[] args) {
		// Ű����� ��ȣ, ���� , ����, ���� ������ �Է�
		// "�հ�", "���հ�"�� ����ϼ�
		// �հ����� : 3���� ��� 40�̻�, ��� 60�̻�
		// ���հݽ� "����" �Ǵ� "��չ̸�" ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		System.out.print("���������� �Է��ϼ��� : ");
		int kor = sc.nextInt();
		
		System.out.print("���������� �Է��ϼ��� : ");
		int eng = sc.nextInt();
		
		System.out.print("���������� �Է��ϼ��� : ");
		int mat = sc.nextInt();
		
		int sum = (kor+eng+mat);
		double avg = sum / 3;
		
		if(avg>=60 && kor>=40 && eng>=40 && mat>=40) {
			System.out.println("�����մϴ�. �հ��Դϴ�.");
		}else{
			if(kor<40 || eng<40 || mat<40) {
				System.out.println("������Ż���Դϴ�.");
			}else if(avg<60) {
				System.out.println("Ż���Դϴ�. ���δ��ϰ������");
			}
		}
	}

}
