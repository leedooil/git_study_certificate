public class Exam_18 {

	public static void main(String[] args) {
		
		//½Ì±ÛÅæ °´Ã¼°¡ ¾Æ´Ò¶§
		
		Exam e1 = new Exam(); // 100¹øÁö
		e1.count();
		Exam e2 = new Exam(); // 200¹øÁö
		e2.count();
		Exam e3 = new Exam(); // 300¹øÁö
		e3.count();
		
		System.out.println(e3.getCount());
	}
	
}

class Exam {
	Exam() {
		
	}
	
	private int count = 0;
	
	void count(){
		count++;
	}
	
	int getCount() {
		return count;
	}
	
}
