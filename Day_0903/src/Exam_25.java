public class Exam_25 {

	public static void main(String[] args) {
		SubBBAA bb = new SubBBAA(5);
		bb.print();
	}

}

class BBAA{
	int a;
	BBAA() {
	}
	
	BBAA(int a){ // 매개변수가 있는 생성자 생성
		this.a=a;
	}
	
	void print() {
		System.out.println("a = " + a);
	}
}

class SubBBAA extends BBAA{

	SubBBAA(int a) {
		super(a);
	}
	
}
