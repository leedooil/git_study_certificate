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

// ��� - extends
// �������� ����ȣ�� �ڽ� ��ü ������ �θ�ü���� ���� �� �ڽ� ��ü����
class Parent {
	int x = 10;
	Parent(){
		System.out.println("Parent() ������ ȣ��");
	}
	
	void test() {
		System.out.println("Parent x = " + x);
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child() ������ ȣ��");
	}
}
