public class Exam_07 {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
//		stu1.hakbun=1101;
//		stu1.name="김학생";
//		stu1.age=21;
		stu1.hakbunPrint();
	
		System.out.println();
		
		Student stu2 = new Student();
		stu2.hakbun=1111;
		stu2.name="이학생";
		stu2.age=24;
		stu2.hakbunPrint();
		

		
	}
	

	
}

class Student{
	// 속성은 변수로 정의
	
	String nation ="대한민국";
	int hakbun; // 학번
	String name; // 이름
	int age; // 나이
	
	//기능은 메소드로 정의
	void hakbunPrint() {
		System.out.println("국적은 " + nation + "입니다.");
		System.out.println("학번은 " + hakbun + "입니다.");
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "입니다.");
	}
}