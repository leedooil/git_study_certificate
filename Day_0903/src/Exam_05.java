public class Exam_05 {

	public static void main(String[] args) {
		
//		System.out.println(func(5));
		System.out.println(fac(120));
	}
	
	static int func(int num) {
		if (num==1) {
			return 1;
		}
		return num+func(num-1);
	}
	
	static int fac(int num) {
		if (num==1) {
			return 1;
		}
		return num*fac(num-1);
	}
	
	 

}
