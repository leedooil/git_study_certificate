public class Exam_20 {

	public static void main(String[] args) {
		Supper su = new Supper();
		su.x=1000;
		su.test();
		
		System.out.println();
		
		SubA sa = new SubA();
		sa.x=1111;
		sa.y=1111;
		sa.test();
		sa.exam();
	}

}

// 메소드 오버라이딩
class Supper{
	int x = 100;
	void test() {
		System.out.println("Super x = " + x);
	}
}

class SubA extends Supper{
//	int x=200;
	int y=200;
	void exam() {
		System.out.println("Super x = " + super.x);
		System.out.println("SubA x = " + x);
		System.out.println("SubA y = " + y);
	}
}

//class SubB extends Supper{
//	
//}