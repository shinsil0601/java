package com.ict.edu3;

public class Main {
	public static void main(String[] args) {
		Mp3_Phone mp3 = new Mp3_Phone();
		mp3.call();
		mp3.sms();
		mp3.sound();
		System.out.println();
		
		Dca_Phone dca = new Dca_Phone();
		dca.call();
		dca.sms();
		dca.picture();
	}
}
