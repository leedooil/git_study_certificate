
public class Exam_12 {

	public static void main(String[] args) {
		// 다중 반복
		
		for (int i = 1; i <= 5; i++) { // 줄수 : 열(row)
			for (int j = 1; j <= 3; j++) { // 칸수(col)
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
