package com.ict.edu;

public class Ex07_main {
	public static void main(String[] args) {
		Ex07_Contructor p1 = new Ex07_Contructor();

		p1.gSum(95, 95, 80);
		p1.gAvg();
		p1.gHak();
		p1.prn();

		Ex07_Contructor p2 = new Ex07_Contructor("둘리");
		p2.gSum();
		p2.gAvg();
		p2.gHak();
		p2.prn();
		
		Ex07_Contructor p3 = new Ex07_Contructor(100,95,95);
		p3.gSum();
		p3.gAvg();
		p3.gHak();
		p3.prn();
		
	}

}
