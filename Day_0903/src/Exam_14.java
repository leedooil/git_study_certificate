public class Exam_14 {

	public static void main(String[] args) {
//		Hak h1 = new Hak(1,"김학생",23);
//		Hak h2 = new Hak(2,"방학생",27);
//		Hak h3 = new Hak(3,"강학생",33);
//		h1.print();
//		h2.print();
//		h3.print();
		
		Hak h = new Hak();
		h.print();
	}
	
}


class Hak{
	int bun;
	String name;
	int age;

	// 생성자 오버로딩
	
	Hak() {
		this(1); // this() 생성자
	}

	
	Hak(int bun) {
		this(bun,"강학생");
		this.bun = bun;
	}


	Hak(int bun, String name) {
		this(bun,name,33);
		this.bun = bun;
		this.name = name;
	}


	Hak(int bun, String name, int age){
		this.bun=bun;		 // this가 붙으면 멤버변수 안 붙으면 매개변수
		this.name=name;		 
		this.age=age;
	}
	
	void print() {
		System.out.println(bun + "\t" + name + "\t" + age);
	}
	
}


