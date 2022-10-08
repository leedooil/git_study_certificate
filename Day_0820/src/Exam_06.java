
public class Exam_06 {
	
	public static void main(String[] args) {
		// 번호, 이름 ,국어 ,영어, 수학 점수를 이용하여
		// 번호, 이름 , 총점, 평균울 츌력하는 프로그램 작성
		
		int bun = 1101;
		String name = "홍길동";
		int kor = 90;
		int eng = 77;
		int mat = 87;
		
		int sum = (kor+eng+mat);
		double avg = sum/3.0;
		
		System.out.println("번호 : " + bun);
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println();
		
		System.out.println("번호\t이름\t총점\t평균");
		System.out.println(bun+"\t"+name+"\t"+sum+"\t"+avg);
	}
}
