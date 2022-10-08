public class Exam_13 {

	public static void main(String[] args) {
		AA a2 = new AA();
		AA a1 = new AA(1,100);
		System.out.println("x = " + a1.x);
		System.out.println("y = " + a1.y);
		
	}
	
}


class AA{
	int x;
	int y;

	// 생성자 오버로딩
	
	public AA() {
		
	}

	AA(int n, int m){  // 생성자 --> 메소드
		x=n;
		y=m;
	}
	
}


