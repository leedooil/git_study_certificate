
public class Exam_06 {
	
	public static void main(String[] args) {
		// ��ȣ, �̸� ,���� ,����, ���� ������ �̿��Ͽ�
		// ��ȣ, �̸� , ����, ��տ� �����ϴ� ���α׷� �ۼ�
		
		int bun = 1101;
		String name = "ȫ�浿";
		int kor = 90;
		int eng = 77;
		int mat = 87;
		
		int sum = (kor+eng+mat);
		double avg = sum/3.0;
		
		System.out.println("��ȣ : " + bun);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println();
		
		System.out.println("��ȣ\t�̸�\t����\t���");
		System.out.println(bun+"\t"+name+"\t"+sum+"\t"+avg);
	}
}
