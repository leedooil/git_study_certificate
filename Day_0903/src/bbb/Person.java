package bbb;
public class Person {
	// ���� ������
	// public : ������
	// protected : ����, ����, ���
	// default : ����, ����(���� ��Ű��(����))
	// private : �ڽ�
	
	private int bun = 1101;
	String name = "���л�"; 
	public int age = 30;
	
	public void test() {
		System.out.println("��ȣ : " + bun);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}
