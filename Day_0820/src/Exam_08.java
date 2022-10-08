import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록 : ");
		int bun = sc.nextInt();
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		int sum = (kor+eng+mat);
		double avg = sum / 3.0;
		
		System.out.println();
		System.out.println("번호는 : " + bun);
		System.out.println("이름은 : " + name);
		System.out.println("총점은 : " + sum);
		System.out.println("평균은 : " + avg);
	}

}
