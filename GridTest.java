package org.sp.app0627.frame;
//배치관리자중 GridLayout학습
//GridLayout은 행,열을 갖는 배치방법을 지원함

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridTest {
	
	public static void main(String[] args) {
		Frame f=new Frame("GridLayout학습");
		
		//프렐임에 gridLayout적용하기
		GridLayout gr=new GridLayout(5,3);
		f.setLayout(gr);//프레임에 배치관리자 적용
		
		//객체자료형도 자료형이므로 객체자료형에 대한 배열선언은 당연히 가능
		Button[][] btn=new Button[5][3];
		
		for(int i=0;i<btn.length;i++) {
			for(int a=0;a<btn[i].length;a++) {
				btn[i][a]=new Button(i+"F"+a);
				f.add(btn[i][a]);
			}
		}
		
		f.setSize(300,400);
		f.setVisible(true);
	}
}
