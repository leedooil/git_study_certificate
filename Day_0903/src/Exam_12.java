public class Exam_12 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.company = "현대";
		c1.carName =  "그랜저";
		c1.print();
	}
	
}

// 생성자 : 클래스 이름과 같은 메소드
// 객체 생성, 객체생성시 초기화

class Car{
	String company;
	String carName;
	
	public Car() {
		System.out.println("Car 생성자");
	}



	void print() {
		System.out.println("제조사 : " + company);
		System.out.println("차이름 : " +carName);
	}
}


