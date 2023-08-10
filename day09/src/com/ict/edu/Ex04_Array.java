package com.ict.edu;

import java.util.Iterator;

public class Ex04_Array {

	public static void main(String[] args) {
//		순위 구하기
//		1. 모든 사람의 순위를 1등으로 초기값을 지정한다.
//		2. 모든사람과 비교해야 된다.(자기자신은 제외)
//		3. 나(i)보다 남(j)이 크면 내순위를 증가시킨다.
		int[] su = {90,80,95,70,85,75,65,100};
		int[] rank = {1,1,1,1,1,1,1,1};
		
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (su[i] == su[j]) continue;  //조건이 맞으면 밑에 비교 안하고 넘어간다
				if (su[i] < su[j]) {
					rank[i]++;
				}
			}
		}
		for (int i = 0; i < rank.length; i++) {
			System.out.print(rank[i]+" ");
		}
		System.out.println("\n=================");
	}

}






