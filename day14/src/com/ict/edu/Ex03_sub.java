package com.ict.edu;


//	자식클래스에서 부모클래스를 선택해서 상속관계를 맺는다.
//	상속관계 : 자식클래스가 부모클래스의 멤버필드와 멤버메서드를
//			   마음대로 사용할 수 있는 클래스간의 관계
//		형식 : class 자식클래스 extends 부모클래스
//		특징 : 1. 모든 클래스는 하나의 부모클래스를 갖는다.
//			   2. 부모클래스가 없으면 Object가 부모클래스다
//			   3. 다중 상속을 지원하지 않는다.(즉, 부모클래스는 하나만 존재한다)
//			   4. 다이얼그램에서는 손자-▷자식-▷부모의 화살표를 가지고 있다
//			   5. 상속관계를 갖게되면 자식 Object를 잃어버리지만 부모 Object를 쓸 수 있다.
public class Ex03_sub extends Ex03_Super{  // extends Ex03_Super를 써줌
	
//	메서드필드 선언 및 초기화
	String name = "홍반장";
	int age = 13;
	private String cat = "야옹이";
	double weight = 78.9;
	
	static String computer = "10세대";
	
//	생성자 만들기
	public Ex03_sub() {
		System.out.println("자식클래스 생성자 : "+ this);
	}

	public void play() {
		String name = "홍두깨";
		
//		클래스별 변수 우선순위
//		1.지역변수 > 2.전역변수(this) > 3.부모클래스변수(super) 
		System.out.println(name);  //홍두깨
		System.out.println(this.name); //홍반장
		System.out.println(super.name);  //홍길동(부모클래스)
		
//		지역변수가 없고, 전역변수, 부모클래스에게만 있으면 this 나 super를 씀.
		System.out.println(weight);
		System.out.println(this.weight);
		
//		this : 전역변수, super : 부모클래스변수
		System.out.println(addr);
		System.out.println(this.addr);  //전역변수가 없을때 super를 더 많이 씀
		System.out.println(super.addr);
		
//		private인 경우
		System.out.println(cat);
		// 상속관계더라도 private은 접근할 수 없다.
//		System.out.println(dog);  
//		System.out.println(super.dog);
		
//		static인 경우
		System.out.println(computer);
		System.out.println(this.computer);
		System.out.println(Ex03_sub.computer); //★권장
		
		System.out.println(playStation);
		System.out.println(this.playStation);
		System.out.println(super.playStation);
		System.out.println(Ex03_Super.playStation); //★권장
		
		
	}
	
}
