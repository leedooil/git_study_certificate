public class Exam_15 {

	public static void main(String[] args) {
		AAA a1 = new AAA();
		AAA a2 = new AAA();
		AAA a3 = a1;
		System.out.println(a1 + ", " + a2 +", " + a3);
		
		if (a1==a2) { // ���� ��
			System.out.println("a1 == a2");
		}else {
			System.out.println("a1 != a2");
		}
		
		if (a1.equals(a2)) { // ���� ��ü���� ��
			System.out.println("a1 == a2");
		}else {
			System.out.println("a1 != a2");
		}
		
		if (a1==a3) { // ���� ��
			System.out.println("a1 == a3");
		}else {
			System.out.println("a1 != a3");
		}
	}
	
}


class AAA{
	int x=100;
}


