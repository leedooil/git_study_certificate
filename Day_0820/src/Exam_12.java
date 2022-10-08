
public class Exam_12 {

	public static void main(String[] args) {
		// 산술연산자 -> 비트연산자
		// shift 연산자 : << , >>
		
		int a=4, b=4;
		int s = b++ + a<<2;
		System.out.println(b);
		System.out.println(s);
		System.out.println();
		
		String str = "";
		str = "1" + str;
		str = "2" + str;
		str = "3" + str;
		System.out.println(str);
		
		String str1 = "";
		str1 = str1+ "1";
		str1 = str1+ "2";
		str1 = str1+ "3";
		System.out.println(str1);
	}

}
