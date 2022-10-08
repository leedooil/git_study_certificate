public class Exam_08 {

	public static void main(String[] args) {
		Cal cal = new Cal();
		cal.n=10;
		cal.m=3;
		System.out.println(" + : " + cal.add());
		System.out.println(" - : " + cal.sub());
		System.out.println(" * : " + cal.mul());
		System.out.println(" / : " + cal.div());
	}
	

	
}

class Cal{ // 계산기 클래스
	int n;
	int m;
	void print() {
		System.out.println("n = " + n + ", m = " + m);
	}
	
//	int sum() {
//		int s = 0;
//		for (int i = n; i <= m; i++) {
//			s+=i;
//		}
//		return s;
//	}
	
	int add() {
		return n+m;
	}
	
	int sub() {
		return n-m;
	}
	
	int mul() {
		return n*m;
	}
	
	int div() {
		return n/m;
	}
}

