
public class Exam_11 {

	public static void main(String[] args) {
		// �Ҽ� �Ǻ�
		
		int dec = 7;
		
		for (int i = 2; i <= dec; i++) {
			if (dec % i == 0) {
				if (dec==i) {
					System.out.println(dec + " �� �Ҽ��Դϴ�.");
				}else {
					System.out.println(dec + " �� �Ҽ��� �ƴմϴ�.");
				}
			}
		}
	}
}
