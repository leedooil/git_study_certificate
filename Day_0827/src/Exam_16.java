
public class Exam_16 {

	public static void main(String[] args) {
		int x = 0;
		int s = 0;
		while (x<10) {
			x++;
			if (x%2==0) {
				continue;  //break;
			}
				s+=x;
		}
		System.out.println(s);
	}
}
