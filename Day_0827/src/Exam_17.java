import java.util.Scanner;

public class Exam_17 {

	public static void main(String[] args) {
		//Ű����� 10������ �Է��ϰ� 2������ ��ȯ ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("10���� �Է� : ");
		int dec = sc.nextInt();
		String bin="";
		while (dec != 0) {
			int mok = dec / 2;
			int nmg = dec % 2;
			bin = nmg + bin;
			
			dec = mok;
		}
		System.out.println(bin);
		System.out.println();
		
		do {
			int mok = dec / 2;
			int nmg = dec % 2;
			bin = nmg + bin;
			
			dec = mok;
		} while (dec != 0);
		System.out.println(bin);
	}
	
}
