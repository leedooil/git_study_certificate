public class Exam_06 {

	public static void main(String[] args) {
		
		// Ŭ���� : ���赵 --> ����ü --> ����� ���� �ڷ���
		// ��ü  : ���(�޼ҵ�)�� �Ӽ�(����)�� ���Ե� 
		
		int a; // ���� ���� ���� --> ��������
		a=10;
		
		Point p; // Point Ŭ������ ���� ����
		p = new Point(); // ��ü ����(�ν��Ͻ� ����)
		System.out.println(a);
		System.out.println(p); 
		p.x=100;
		System.out.println(p.x);
		System.out.println(p.y);

		
	}
	

}

class Point{ // �ڷ���
	int x; // �������, ����ʵ�
	int y; // 
	
}