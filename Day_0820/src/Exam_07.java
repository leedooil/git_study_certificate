import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		// 키보드로 번호, 이름, 국어, 영어, 수학 입력
		// 총점, 평균을 구하여 모니터 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호를 입력하세요 : ");
		int bun = sc.nextInt(); // 정수를 입력 받아서 bun에 저장

		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
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
