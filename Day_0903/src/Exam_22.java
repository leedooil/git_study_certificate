public class Exam_22 {

	public static void main(String[] args) {
		BA b1 = new BA();
		b1.test();
		
		System.out.println();
		
		BBA b2 = new BBA();
		b2.test();
		System.out.println();

		BA b3 = new BBA();
		b3.test();
		System.out.println();
		
//		BBA b4 = new BA();
	}

}

class BA {
	int x = 10;
	void test() {
		System.out.println("HELLO");
	}
}

class BBA extends BA {
	int y = 20;
	void test() {
		System.out.println("HELLO WORLD");
	}
}
