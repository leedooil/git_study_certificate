public class Exam_17 {

	public static void main(String[] args) {
		Test t1 = Test.getInstance(); // new Test() --> t1(100번지)
		t1.count();
		Test t2 = Test.getInstance(); // new Test() --> 100번지
		t2.count();
		Test t3 = Test.getInstance();
		t3.count();
		System.out.println(t1.getCount());
	}
	
}

class Test {
	private static Test instance = null;
	
	private Test() {
		
	}
	
	private int count = 0;
	static Test getInstance() {
		if (instance == null) {
			instance = new Test(); // 100번지
			return instance;
		}
		return instance;
	}
	
	void count(){
		count++;
	}
	
	int getCount() {
		return count;
	}
	
}
