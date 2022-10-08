public class Exam_29 {

	public static void main(String[] args) {
//		QQ rr = new QQ();
		QQA a = new QQA();
		QQ q = new QQA();
	}

}

interface QQ{ // ¸í¼¼¼­
	void test();
	int sum(int a, int b);
}

class QQA implements QQ{

	@Override
	public void test() {
		
	}

	@Override
	public int sum(int a, int b) {
		return 0;
	}
	
}
