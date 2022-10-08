public class Exam_09 {

	public static void main(String[] args) {
		int val[] = {6,9,4,7,3,5};
		Process pro = new Process();
		pro.kor=100;
		System.out.println(pro.exam01(val));
		
		Process.kor=100;
		System.out.println(Process.exam01(val));
	}
	

	
}

class Process{
	static int kor;
	static int exam01(int[] num) {
		int m = num[0];
		for (int i = 0; i < num.length; i++) {
			if (m>num[i])
				m=num[i];
		}
		return m;
	}
}
