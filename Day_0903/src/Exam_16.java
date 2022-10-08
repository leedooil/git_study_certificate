public class Exam_16 {

	public static void main(String[] args) {
		
		// �̱��� ���� : ��ü �����ؼ� ����
		
//		Singleton s = new Singleton();
		
		Singleton s1 =Singleton.getInstance();
		Singleton s2 =Singleton.getInstance();
		System.out.println(s1==s2);
		
		if (s1==s2) {
			System.out.println("s1==s2");
		}else {
			System.out.println("s1!=s2");
		}
		System.out.println(s1 + ", " + s2);
	}
	
}

class Singleton {
	// �ڽ��� �ڽ��� ��ü�� ����
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
