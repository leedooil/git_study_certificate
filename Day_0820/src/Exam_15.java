
public class Exam_15 {

	public static void main(String[] args) {
		// 조건 연산자
		
		int a=7,b=5;
		int m = (a>b) ? a : b;
		System.out.println(m);
		
		int c=7, d=5, e=8;
		int max = (c>d)? c : d;
		max = (max > e) ? max : e;
		System.out.println(max);
	}

}
