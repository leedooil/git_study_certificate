public class Exam_03 {

	public static void main(String[] args) {
		System.out.println("exam01 : " + exam01(new int[] {6,9,4,6,3}));
		System.out.println("exam02 : " + exam02(6,9,4,6,3));
	}
	
	static int exam01(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max=a[i];
			}
		}
		return max;
	}
	
	static int exam02(int ... a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max=a[i];
			}
		}
		return max;
	}
	
	

}
