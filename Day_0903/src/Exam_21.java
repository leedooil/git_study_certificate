public class Exam_21 {

	public static void main(String[] args) {
		SuperA sa = new SuperA();
		sa.show();
		System.out.println("-----------");
		SubB sb = new SubB();
		sb.show();
		System.out.println("-----------");
	}

}

class SuperA{
	// �����ε�
	void show() {
		System.out.println("SuperA");
	}
}

class SubB extends SuperA{
	// �������̵�
	void show() {
		super.show();
		System.out.println("SubB");
	}
}