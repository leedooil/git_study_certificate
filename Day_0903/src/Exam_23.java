public class Exam_23 {

	public static void main(String[] args) {
//		SuperB sb1 = new SuperB();
		SuperB sb1 = new SubD();
		sb1.test(1, 4);
		SuperB sb2 = new SubE();
		sb2.test(1, 4);
		SuperB sb3 = new SubF();
		sb3.test(1, 4);
		SuperB sb4 = new SubG();
		sb4.test(1, 4);
	}

}

abstract class SuperB{ //추상클래스 : 미완성 설계도 (NEW 예약어로 객체생성 불가)
	
	int add(int x) {
		int s = 0;
		for (int i = 1; i < x; i++) {
			s+=i;
		}
		return s;
	}
    abstract void test(int a, int b);
		
}

class SubD extends SuperB{

	@Override
	void test(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a+b));
	}
	
}

class SubE extends SuperB{
	
	@Override
	void test(int a, int b) {
		System.out.println(a + "-" + b + "=" + (a-b));
	}
	
}

class SubF extends SuperB{

	@Override
	void test(int a, int b) {
		System.out.println(a + "*" + b + "=" + (a*b));
		
	}
	
}

class SubG extends SuperB{
	
	@Override
	void test(int a, int b) {
		System.out.println(a + "/" + b + "=" + (a/b));
		
	}
	
}
