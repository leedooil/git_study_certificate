import java.util.Scanner;

public class Exam_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		if(score >= 80) {
			System.out.println("축하합니다. 합격입니다.");
		}else {
			System.out.println("안타깝게도 불합격입니다. 집에 가세요");
		}
		
	}

//		System.out.print("점수를 입력하세요 : ");
//		int score = sc.nextInt();
//		if (score >= 80) {
//			System.out.println("축하합니다. 합격입니다.");
//		} else if(score >= 70) {
//			System.out.println("턱걸이 합격입니다.");
//		} else if (score ) {
//			
//		}
//
//	}

}
