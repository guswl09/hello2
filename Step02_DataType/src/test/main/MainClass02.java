package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//국어점수
		int kor=95;
		//영어점수
		int eng=100;
		
		//국어점수와 영어점수의 평균을 구해서 변수에 담고 그 결과를 콘솔창에 출력해 보세요.
		//int type과 double type을 연산하면 결과는 double type이다.
		double avg=(kor+eng)/2.0d;
		System.out.println("평균:"+avg);
	}
}
