public class Exam_06 {

	public static void main(String[] args) {
		
		// 클래스 : 설계도 --> 구조체 --> 사용자 정의 자료형
		// 객체  : 기능(메소드)과 속성(변수)이 포함된 
		
		int a; // 정수 변수 선언 --> 지역변수
		a=10;
		
		Point p; // Point 클래스로 변수 선언
		p = new Point(); // 객체 생성(인스턴스 생성)
		System.out.println(a);
		System.out.println(p); 
		p.x=100;
		System.out.println(p.x);
		System.out.println(p.y);

		
	}
	

}

class Point{ // 자료형
	int x; // 멤버변수, 멤버필드
	int y; // 
	
}