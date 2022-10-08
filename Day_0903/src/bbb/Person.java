package bbb;
public class Person {
	// 접근 제어자
	// public : 누구나
	// protected : 동료, 가족, 상속
	// default : 동료, 가족(같은 패키지(폴더))
	// private : 자신
	
	private int bun = 1101;
	String name = "김학생"; 
	public int age = 30;
	
	public void test() {
		System.out.println("번호 : " + bun);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
