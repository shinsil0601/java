package com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex06_ComboBox extends JFrame {
	public Ex06_ComboBox() {
		super("콤보박스");
		
		JPanel jp = new JPanel();
		
//		콤보박스에 들어갈 내용을 배열로 만든다.
		String[] items= {"좋아하는 운동","야구","축구","배구","농구"};
		
		JComboBox<String> jcom = new JComboBox<>(items);
		
//		특정항목을 먼저 나오게 하는 방법
//		jcom.setSelectedIndex(2);  //배열의 인덱스값을 넣으면 해당하는 배열인덱스의 내용이 먼저 보여짐
		jp.add(jcom);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-300, 500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Ex06_ComboBox();
	}
}
