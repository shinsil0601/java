package com.ict.edu;


public class Ex05_Menmer_Main {
	public static void main(String[] args) {
		// 내부클래스를 별도로 객체 생성할 수 없다.(static은 제외)
		// Inner01 test1 = new Inner01();

		// 외부클래스를 통해서 내부클래스 객체를 생성한다.(Member내부클래스)
		Ex05_Member_InnerClass test2 = new Ex05_Member_InnerClass();
		//주소에 $표시는 내부클래스를 의미함
		Ex05_Member_InnerClass.Inner01 exam = test2.new Inner01();
		
		exam.prn();
	}
}
