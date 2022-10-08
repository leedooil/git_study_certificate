import java.util.Scanner;

public class Exam_31 {
	//main과 동급 메소드이면 무조건 static 붙여줘야함
	public static void main(String[] args) {
		// 메소드(함수)
		// 1. 반환타입 X, 매개변수 X
		// 2. 반환타입 X, 매개변수 O
		// 3. 반환타입 O, 매개변수 X
		// 4. 반환타입 O, 매개변수 O
		
		test01();
		sum(10, 10);
		System.out.println(add());
		System.out.println(print("삼두일", 20));
		
	}
	
	static void test01() {
		System.out.println("test01() 메소드가 호출되었습니다.");
	}
	
	static void sum(int a, int b) {
		int s = a+b;
		System.out.println("sum() 메소드 호출 : " + s);
	}
	
	static int add() { // 반환타입(자료형, 클래스, 배열)
		int s = 0;
		for (int i = 1; i < 6; i++) {
			s += 1;
		}
		return s;
	}
	
	static String print(String name, int age) {
		String str = "이름  : " + name + ", 나이 : " + age;
		return str;
	}
}
