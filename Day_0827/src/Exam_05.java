
public class Exam_05 {

	public static void main(String[] args) {
		// ����� 90�̻� A, ����� 80�̻� B, ����� 70�̻� C,����� 60�̻� D, ��� 60 �̸� F  
		
		int kor=87, eng=88, mat=0; //����, ����, ���� ����
		int avg = (kor+eng+mat)/3;
		String str = "";
		if (avg>=90) {
			str = "A";
		}else if (avg>=80) {
			str = "B";
		}else if (avg>=70) {
			str = "C";
		}else if (avg>=60) {
			str = "D";
		}else {
			str = "F";
		}
		System.out.println("��� : " + avg);
		System.out.println("���� : " + str);
		
	}

}
