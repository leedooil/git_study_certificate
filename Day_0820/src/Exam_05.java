
public class Exam_05 {

	public static void main(String[] args) {
//		논리 상수 : true / false
//		숫자 : 0~9, +, -, .
//		10진수 : 0 ~ 9
//		2진수 : 0, 1 -> 0b로시작
//		8진수 : 0~7 -> 0으로시작
//		16진수 : 0~9, A(10)~F(15) -> 0x로 시작
//		문자 : ''. 문자열 : ""
		
//		45(10진수), 045(8진수), 0x45(16진수), 0b1010(2진수)
//		078이면 0으로 시작해서 8진수인데 8들어가서 오류남
//		문자 : '' -> 문자한개만, 문자열은 ""
//		'1' : o , '12' : x
//		'1' : o , "12" : o
		
//		7 + 8 = 15;
		System.out.println("7 + 8 = 15");
		System.out.println("7 + 8 = " + (7+8));
		System.out.println();

		// int형 변수 선언
		int a;

		// 선언된 변수에 값 대입
		a = 7;
		
		// 선언과 동시에 대입
		int b = 8;
		System.out.println("a + b" + " = " + (a+b));
		System.out.println(a + " + " + b +" = "+ (a+b));
	}

}
