public class Exam_12 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.company = "����";
		c1.carName =  "�׷���";
		c1.print();
	}
	
}

// ������ : Ŭ���� �̸��� ���� �޼ҵ�
// ��ü ����, ��ü������ �ʱ�ȭ

class Car{
	String company;
	String carName;
	
	public Car() {
		System.out.println("Car ������");
	}



	void print() {
		System.out.println("������ : " + company);
		System.out.println("���̸� : " +carName);
	}
}


