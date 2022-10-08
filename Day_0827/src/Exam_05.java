
public class Exam_05 {

	public static void main(String[] args) {
		// 평균이 90이상 A, 평균이 80이상 B, 평균이 70이상 C,평균이 60이상 D, 평균 60 미만 F  
		
		int kor=87, eng=88, mat=0; //국어, 영어, 수학 점수
		int avg = (kor+eng+mat)/3;
		String str = "";
		if (avg>=90) {
			str = "A";
		}else if (avg>=80) {
			str = "B";
		}else if (avg>=70) {
			str = "C";
		}else if (avg>=60) {
			str = "D";
		}else {
			str = "F";
		}
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + str);
		
	}

}
