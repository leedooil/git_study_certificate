
public class Exam_06 {

	public static void main(String[] args) {
		// ����� 90�̻� A, ����� 80�̻� B, ����� 70�̻� C,����� 60�̻� D, ��� 60 �̸� F  
		
		int kor=87, eng=88, mat=6; //����, ����, ���� ����
		int avg = (kor+eng+mat)/3;
//		String str = "";
//		switch (avg) {
//		case 100:
//		case 99:
//		case 98:
//		case 97:
//		case 96:
//		case 95:
//		case 94:
//		case 93:
//		case 92:
//		case 91:
//		case 90:
//			str = "A";
//			break;
//		default:
//			break;
//		}
//		
//		System.out.println("��� : " + avg);
//		System.out.println("���� : " + str);
//		
//	}

		String str = "";
		switch (avg/10) {
		case 10:
		case 9:
			str = "A";
			break;
		case 8:
			str = "B";
			break;
		case 7:
			str = "C";
			break;
		case 6:
			str = "D";
			break;
		default:
			str = "F";
			break;
		}
		
		System.out.println("��� : " + avg);
		System.out.println("���� : " + str);
		
	}

}
