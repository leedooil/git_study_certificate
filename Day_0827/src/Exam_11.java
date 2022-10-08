
public class Exam_11 {

	public static void main(String[] args) {
		// 소수 판별
		
		int dec = 7;
		
		for (int i = 2; i <= dec; i++) {
			if (dec % i == 0) {
				if (dec==i) {
					System.out.println(dec + " 는 소수입니다.");
				}else {
					System.out.println(dec + " 는 소수가 아닙니다.");
				}
			}
		}
	}
}
