package com.ict.edu2;

public class Test01_review {
	public static void main(String[] args) {
//		이름이 홍길동인 사람의 점수가
//		국어 90, 영어 80, 수학 80점이다.
//		총점과 평균을 구하자
//		화면 출력은 이름, 총점, 평균만 출력하자
//		(단, 평균은 소수점 첫째자리까지 구하자)
		
//		입력정보: 원하는 정보를 얻기위한 정보(재료)
		String name = "홍길동";
		int kor = 90;
		int eng = 80;
		int math = 80;
		
//		총점과 평균 구하기
		int sum= kor + eng + math;
		double avg = sum / 3.0;
		avg = (int)(avg*10)/10.0;  //"833 / 10.0"->나누는 값을 '실수'로 변환
		
//		이름, 총점, 평균 출력
		System.out.println("이름: "+name +"의 총점: " + sum + ", 평균: " + avg);
	}

}
