public class Exam_27 {

	public static void main(String[] args) {
		Exam_27 a1 = new Exam_27();
		Exam_28 a2 = new Exam_28();
		int result = a1.sum(3, 2) + a2.sum(3, 2);
		System.out.println("result = " + result);
	}
	

	int sum(int x, int y) {
		return x + y;
	}

}

class Exam_28 extends Exam_27 {
	int sum(int x, int y) {
		return x - y + super.sum(x, y);
	}

}