import java.util.Scanner;

public class Exam_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력된 점수가 80 ~ 90 이면 PASS 아니면 FAIL

		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		if(score>=80) {
			if(score<=90) {
				System.out.println("PASS");
			}else {
				System.out.println("FAIL");
			}
		}else {
			System.out.println("택도없이 탈락 집에가세요.");
		}
	}

}
