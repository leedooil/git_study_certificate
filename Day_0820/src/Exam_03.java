
public class Exam_03 {

	public static void main(String[] args) {
		
		// 주석 처리배운다
		
		/* 여러줄
		주석 처리
		방법 */
		
		// 자바의 표준 출력 -> 모니터 출력
//		System.out.print(); -> 줄바꿈 없다
//		System.out.println(); -> 줄바꿈 있다
		
		System.out.println("*");
		System.out.println("***");
		System.out.println("*****");
		
		System.out.println("별찍기 해보자");
		for(int i=1; i<6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
