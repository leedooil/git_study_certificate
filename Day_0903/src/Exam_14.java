public class Exam_14 {

	public static void main(String[] args) {
//		Hak h1 = new Hak(1,"���л�",23);
//		Hak h2 = new Hak(2,"���л�",27);
//		Hak h3 = new Hak(3,"���л�",33);
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

	// ������ �����ε�
	
	Hak() {
		this(1); // this() ������
	}

	
	Hak(int bun) {
		this(bun,"���л�");
		this.bun = bun;
	}


	Hak(int bun, String name) {
		this(bun,name,33);
		this.bun = bun;
		this.name = name;
	}


	Hak(int bun, String name, int age){
		this.bun=bun;		 // this�� ������ ������� �� ������ �Ű�����
		this.name=name;		 
		this.age=age;
	}
	
	void print() {
		System.out.println(bun + "\t" + name + "\t" + age);
	}
	
}


