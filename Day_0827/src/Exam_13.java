
public class Exam_13 {

	public static void main(String[] args) {
		// º°Âï±â
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 4-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				cnt++;
				System.out.print(cnt+"\t");
			}
			System.out.println("");
		}
		
		System.out.println();
		int cnt2 = 0;
//		int sum=0;
		for (int i = 0; i < 5; i++) {
			int sum=0;
			for (int j = 0; j < 5; j++) {
				cnt2++;
				sum+=cnt2;
				System.out.print(cnt2+"\t");
			}
			System.out.println(sum);
		}
	}
}
