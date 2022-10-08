
public class Exam_23 {

	public static void main(String[] args) {
		
		// 대, 중, 소 찾기
		
		int a=7, b=5, c=8;
		int temp;
		if(a<b) {
			temp = a;
			a=b;
			b=temp;
		} 
		if(a<c) {
			temp = a;
			a=c;
			c=temp;
		}
		if(b<c) {
			temp=b;
			b=c;
			c=temp;
		}
		
		System.out.println("MAX = "+a);
		System.out.println("MED = "+b);
		System.out.println("MIN = "+c);
	}

}
