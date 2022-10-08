public class Exam_04 {

	public static void main(String[] args) {
//		test(5);
		func(5);
	}

//	static int test(int n) {
//		int s=0;
//		for (int i = 1; i <= n; i++) {
//			s += i;
//		}
//		return s;
//	}

	static void test(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("Hello World");
		}
	}

	// Àç±Í È£Ãâ
	static void func(int n) {
		if (n == 0) {
			return;
		}
		
		System.out.println("Hello World");
		func(n - 1);
	}

}
