
public class Exam_11 {

	public static void main(String[] args) {
		// ������ �켱����
		/* �ֿ켱
		 *   |
		 *  ���� 
		 *   |
		 *  ��� : (*,/,%,+,-)
		 *   |
		 * ����Ʈ 
		 *   |
		 *  ���� : (==,!=,>,>=,<,<=)
		 *   |
		 *  �� : (&&,||)
		 *   |
		 *  ����
		 *   |
		 *  ���� : (=)              
     	 */
		
		int a=7, b=5;
		int c=a/b;
		System.out.println(a+" / "+b+" = "+(a/b));
		System.out.println(a+" % "+b+" = "+(a%b));
		
		// ���� ����ȯ
		int d = (int)(a / 3.0);
		System.out.println(d);
		
		// �ڵ� ����ȯ
		double e = (double)a / b;
		System.out.println(e);
		
	}

}
