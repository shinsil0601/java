package com.ict.edu3;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ex01_main extends JFrame{
	public Ex01_main() {
		super("JTable");
		
		JPanel jp = new JPanel();
		Ex01_JTable table = new Ex01_JTable();
		JTable jTable = new JTable(table);
		JScrollPane jsp = new JScrollPane(jTable);  //제목열이 나오려면 만들어줘야함
		
//		jp.add(jsp);
//		add(jp);
		
		add(jsp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250,ds.height/2-250,500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex01_main();
	}
}
