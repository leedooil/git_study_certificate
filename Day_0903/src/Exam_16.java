public class Exam_16 {

	public static void main(String[] args) {
		
		// 싱글톤 패턴 : 객체 생성해서 공유
		
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
	// 자신이 자신의 객체를 생성
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
