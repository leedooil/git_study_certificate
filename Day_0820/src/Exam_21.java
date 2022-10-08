import java.util.Scanner;

public class Exam_21 {

	public static void main(String[] args) {
		// 키보드로 번호, 국어 , 영어, 수학 점수를 입력
		// "합격", "불합격"을 출력하셈
		// 합격조건 : 3과목 모두 40이상, 평균 60이상
		// 불합격시 "과락" 또는 "평균미만" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수험번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.print("국어점수를 입력하세요 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어점수를 입력하세요 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학점수를 입력하세요 : ");
		int mat = sc.nextInt();
		
		int sum = (kor+eng+mat);
		double avg;
		
		if(kor>=40 && eng>=40 && mat>=40) {
			avg = sum / 3;
			if(avg >= 60) {
				System.out.println("축하합니다. 합격입니다.");
			}else {
				System.out.println("불학격입니다. 공부더하고오세요");
			}
		}else {
			System.out.println("와 과락나옴");
		}
	}

}
