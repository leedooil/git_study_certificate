public class Exam_07 {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
//		stu1.hakbun=1101;
//		stu1.name="���л�";
//		stu1.age=21;
		stu1.hakbunPrint();
	
		System.out.println();
		
		Student stu2 = new Student();
		stu2.hakbun=1111;
		stu2.name="���л�";
		stu2.age=24;
		stu2.hakbunPrint();
		

		
	}
	

	
}

class Student{
	// �Ӽ��� ������ ����
	
	String nation ="���ѹα�";
	int hakbun; // �й�
	String name; // �̸�
	int age; // ����
	
	//����� �޼ҵ�� ����
	void hakbunPrint() {
		System.out.println("������ " + nation + "�Դϴ�.");
		System.out.println("�й��� " + hakbun + "�Դϴ�.");
		System.out.println("�̸��� " + name + "�Դϴ�.");
		System.out.println("���̴� " + age + "�Դϴ�.");
	}
}