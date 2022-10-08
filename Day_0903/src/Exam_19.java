public class Exam_19 {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.x = 500;
		p1.test();
		
		Child c1 = new Child();
		c1.x = 1000;
		c1.test();
	}

}

// 상속 - extends
// 생성자의 연속호출 자식 객체 생성시 부모객체부터 생성 후 자식 객체생성
class Parent {
	int x = 10;
	Parent(){
		System.out.println("Parent() 생성자 호출");
	}
	
	void test() {
		System.out.println("Parent x = " + x);
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child() 생성자 호출");
	}
}
