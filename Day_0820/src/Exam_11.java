
public class Exam_11 {

	public static void main(String[] args) {
		// 연산자 우선순위
		/* 최우선
		 *   |
		 *  단항 
		 *   |
		 *  산술 : (*,/,%,+,-)
		 *   |
		 * 쉬프트 
		 *   |
		 *  관계 : (==,!=,>,>=,<,<=)
		 *   |
		 *  논리 : (&&,||)
		 *   |
		 *  삼항
		 *   |
		 *  대입 : (=)              
     	 */
		
		int a=7, b=5;
		int c=a/b;
		System.out.println(a+" / "+b+" = "+(a/b));
		System.out.println(a+" % "+b+" = "+(a%b));
		
		// 강제 형변환
		int d = (int)(a / 3.0);
		System.out.println(d);
		
		// 자동 형변환
		double e = (double)a / b;
		System.out.println(e);
		
	}

}
