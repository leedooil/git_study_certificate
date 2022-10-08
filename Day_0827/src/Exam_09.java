
public class Exam_09 {

	public static void main(String[] args) {
		// 1 + 2 + 3 + 4 . . . + 10 = 55
		// 1 ~ 10 까지의 합계
		
		int s =0;
		for (int i = 1; i <= 10 ; i++) {
			System.out.print("i = "+ i + "\t");
			s+=i;
			System.out.println("s = " + s);
		}

	}
}
