package com.ict.edu3;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex06_Layout extends JFrame{
	public Ex06_Layout() {
		super("GridLayout");
		
		JPanel jp = new JPanel(new GridLayout(2,0));  //행(줄)기준으로 버튼생성
		jp.setLayout(null);  //절대좌표
		
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
		
//		setBounds(x,y,w,h)
		jb1.setBounds(10, 10, 200, 300);  //왼쪽,
		jb2.setBounds(220, 10, 200, 100);  //왼쪽,
		jb3.setBounds(10, 320, 420, 30);  //가로,세로,넓이,높이
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250,ds.height/2-250,500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex06_Layout();
	}
}
