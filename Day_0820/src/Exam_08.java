import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� : ");
		int bun = sc.nextInt();
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
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
