public class Exam_18 {

	public static void main(String[] args) {
		
		//�̱��� ��ü�� �ƴҶ�
		
		Exam e1 = new Exam(); // 100����
		e1.count();
		Exam e2 = new Exam(); // 200����
		e2.count();
		Exam e3 = new Exam(); // 300����
		e3.count();
		
		System.out.println(e3.getCount());
	}
	
}

class Exam {
	Exam() {
		
	}
	
	private int count = 0;
	
	void count(){
		count++;
	}
	
	int getCount() {
		return count;
	}
	
}
