
public class Exam_10 {

	public static void main(String[] args) {
		int a = 5, b=1, c=0;
//		c = b + ++a;
//		System.out.println("a = "+a);
//		System.out.println("c = "+c);

		c = b + a++;
		System.out.println("a = "+a);
		System.out.println("c = "+c);
		
//		a++; -----> a=a+1;
	}

}
