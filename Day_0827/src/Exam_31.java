import java.util.Scanner;

public class Exam_31 {
	//main�� ���� �޼ҵ��̸� ������ static �ٿ������
	public static void main(String[] args) {
		// �޼ҵ�(�Լ�)
		// 1. ��ȯŸ�� X, �Ű����� X
		// 2. ��ȯŸ�� X, �Ű����� O
		// 3. ��ȯŸ�� O, �Ű����� X
		// 4. ��ȯŸ�� O, �Ű����� O
		
		test01();
		sum(10, 10);
		System.out.println(add());
		System.out.println(print("�����", 20));
		
	}
	
	static void test01() {
		System.out.println("test01() �޼ҵ尡 ȣ��Ǿ����ϴ�.");
	}
	
	static void sum(int a, int b) {
		int s = a+b;
		System.out.println("sum() �޼ҵ� ȣ�� : " + s);
	}
	
	static int add() { // ��ȯŸ��(�ڷ���, Ŭ����, �迭)
		int s = 0;
		for (int i = 1; i < 6; i++) {
			s += 1;
		}
		return s;
	}
	
	static String print(String name, int age) {
		String str = "�̸�  : " + name + ", ���� : " + age;
		return str;
	}
}
