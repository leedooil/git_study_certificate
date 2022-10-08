import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		// switch ~ case
		
		int sw = 3;
		switch (sw) { // 변수, 수식
			case 1:	// 정수, 상수, 문자열, 문자
				System.out.println("1입니다.");
				break;
			case 2:	
				System.out.println("2입니다.");
				break;
			case 3:	
				System.out.println("3입니다.");
				break;
			case 4:	
				System.out.println("4입니다.");
				break;
			case 5:	
				System.out.println("5입니다.");
				break;
			default: // 해당되는 값이 없으면(else) 
				System.out.println("입력오류입니다.");
		}
		
	}

}
