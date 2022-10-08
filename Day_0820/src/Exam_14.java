
public class Exam_14 {

	public static void main(String[] args) {
		System.out.println("7&5="+(7&5));
		System.out.println("7|5="+(7|5));
//		System.out.println("7&&5="+(7&&5));
		System.out.println("(7>5)&&(5<3)="+((7>5)&&(5<3)));
		System.out.println("(7>5)||(5<3)="+((7>5)||(5<3)));
		
		// 비트 연산자
		System.out.println("(7>5)&(5<3)="+((7>5)&(5<3)));
		System.out.println("(7>5)|(5<3)="+((7>5)|(5<3)));
		
		System.out.println("(7<5)&&(5>3)="+((7<5)&(5>3)));
		System.out.println("(7<5)&(5>3)="+((7<5)&(5>3)));
	}

}
