package com.ict.edu;

import com.ict.edu.Ex07_static.Inner01;

public class Ex07_main {
	public static void main(String[] args) {
//		static 사용법과 같음
	System.out.println(Inner01.count);
	
//	별도로 객체 생성 가능
	Inner01 test = new Inner01();
	System.out.println(test.addr);
	System.out.println(test.roomNumber);
	test.prn();
		
	}
}
