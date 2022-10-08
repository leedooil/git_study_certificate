public class Exam_15 {

	public static void main(String[] args) {
		AAA a1 = new AAA();
		AAA a2 = new AAA();
		AAA a3 = a1;
		System.out.println(a1 + ", " + a2 +", " + a3);
		
		if (a1==a2) { // 값을 비교
			System.out.println("a1 == a2");
		}else {
			System.out.println("a1 != a2");
		}
		
		if (a1.equals(a2)) { // 같은 객체인지 비교
			System.out.println("a1 == a2");
		}else {
			System.out.println("a1 != a2");
		}
		
		if (a1==a3) { // 값을 비교
			System.out.println("a1 == a3");
		}else {
			System.out.println("a1 != a3");
		}
	}
	
}


class AAA{
	int x=100;
}


