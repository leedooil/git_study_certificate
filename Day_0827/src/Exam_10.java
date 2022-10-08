
public class Exam_10 {

	public static void main(String[] args) {
		int s =0;
//		for (int i = 1; i <= 10 ; i+=2) {
//			s+=i;
//		}

//		for (int i = 1; i <= 10 ; i++) {
//			if (i%2==0) {
//				s+=i;
//			}
//		}

		for (int i = 1; i <= 10 ; i++) {
			if (i%2==1) {
				s+=i;
			}else {
				s-=i;
			}
		}
		System.out.println(s);

	}
}
