
public class Exam_09 {

	public static void main(String[] args) {
		// 단항 연산자 (+,-)
		int a = 1;
		System.out.println("a = " + a);
		
		a = -a;
		System.out.println("a = " + a);
		
		// ++, -- : 1씩증가, 감소
		int b = 5, c = 0;
		c= b++; //후위연산
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		c = ++b; //전위연산
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		
		
		
	}

}
