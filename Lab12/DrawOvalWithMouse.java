import java.awt.*;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;

import javax.swing.*;
import javax.swing.JPanel;

class Circle {
	int x;
	int y;
	int w;
	int h;
	public Circle(int x,int y, int w,int h) {
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
	}
}

public class DrawOvalWithMouse extends JFrame {
	MyPanel panel=new MyPanel();
	public DrawOvalWithMouse() {
		// title 설정
		super("1914337 이서진-DrawOvalWithMouse");
		// MyPanel add
		add(new MyPanel());
		// default Close operation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창크기 400, 300
		setSize(400,300);
		// Visible 설정
		setVisible(true);
	}
	class MyPanel extends JPanel {
		// circle 타입의 Vector 선언
		Vector <Circle> circle=new Vector<Circle>();
		int dx,dy,tx,ty;
		public MyPanel() {
			setLayout(null);
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					// 이벤트 일어난 위치를 통해 시작 포인트 받아오기
					dx=e.getX();
					dy=e.getY();
				}
				public void mouseReleased(MouseEvent e) {
					//이벤트 일어난 x좌표, y좌표 받아오기
					tx=e.getX();
					ty=e.getY();
					// 벡터에 새로운 circle 객체 만들어서 추가
					circle.add(new Circle(dx,dy,tx,ty));
					// repaint()
					repaint();
			
				}
			});
		}
		public void paintComponent(Graphics g) {
			//super()
			super.paintComponent(g);
			//색깔 지정 - >green
			setForeground(Color.GREEN);
			//vector 안에 있는 circle 객체들을 그려주기 - for문 사용
			for(int i=0;i<circle.size();i++) {
				Circle c=circle.get(i);
				setForeground(Color.green);
				g.drawOval(c.x, c.y, c.w, c.h);
			}

		}
	}

	public static void main(String[] args) {
		new DrawOvalWithMouse();
	}
}

