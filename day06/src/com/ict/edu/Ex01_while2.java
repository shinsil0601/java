package com.ict.edu;

public class Ex01_while2 {
	public static void main(String[] args) {
//		형식1)  초기식;
//		while(조건식) {
//			조건식이 참이면 실행할 문장;
//			증감식; }
//		구구단 -1
		int i =2;
		while(i < 10) {
			System.out.println("["+i+"단]");
			int j = 1;
			while(j<10) {
				System.out.println(i + "*"+ j + " = "+ (i*j));
				j++;
			}
			i++;
		}
		System.out.println("============================");
		
//		구구단 -2
		i=2;
		while(i<10) {
			int j=1;
			while(j<10) {
				System.out.print(i + "*"+ j + " = "+ (i*j) + " \t");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("============================");
		
//		구구단 -3
		i=1;
		while(i<10) {
			int j=2;
			while(j<10) {
				System.out.print(j +"*"+ i +" = "+ (j*i) + " \t");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
