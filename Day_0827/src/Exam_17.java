import java.util.Scanner;

public class Exam_17 {

	public static void main(String[] args) {
		//키보드로 10진수를 입력하고 2진수로 변환 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("10진수 입력 : ");
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
