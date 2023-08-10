package com.ict.edu;

//Local 내부클래스
public class Ex06_Local {
	String name = "둘리";

	public Ex06_Local() {
		System.out.println("외부생성자: " + this);
	}

	public void sound() {
		String str = "호이~!";
		System.out.println(str);
	}

	public void play() {
		int age = 24;

		// 내부클래스
		class Inner02 {
			String addr = "서울 용산구";

			public Inner02() {
				System.out.println("내부생성자: " + this);
			}

			public void prn() {
				System.out.println(name);
				System.out.println(age);
				System.out.println(addr);
				// System.out.println(str);
			} // 내부메서드 끝
		} // 내부클래스 끝
	}// 외부 클래스 멤버메서드 끝
}
