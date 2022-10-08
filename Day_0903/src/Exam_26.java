public class Exam_26 {

	public static void main(String[] args) {
//		Car1 ca = new Car1("name");
		Car1 car = new Truck("Spark");
		System.out.println(car.getName());
	}
}

abstract class Car1{ // 추상 클래스
	String name;
	abstract String getName(String val); // 추상 메소드
	Car1(String val) {
		this.name=val;
	}
	
	String getName() {
		return "Car name : " + name;
	}
}

class Truck extends Car1{
	Truck(String val){
		super(val);
	}
	String getName(String val) { // 오버라이딩
		return "Truck name : " + val;
	}
	
	String getName(byte[] val) { // 오버로딩
		return "Truck name : " + val;
	}
}