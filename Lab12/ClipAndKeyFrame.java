import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClipAndKeyFrame extends JFrame {
	public ClipAndKeyFrame() {
		// title 설정
		super("1914337 이서진-ClipAndKeyFrame");
		// MyPanel add
		add(new MyPanel());
		// default Close operation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창크기 400, 400
		setSize(400,400);
		// Visible 설정
		setVisible(true);
	}

	class MyPanel extends JPanel {
		// ImageIcon 받아와서 뒷 배경 설정
		ImageIcon icon=new ImageIcon("./images/bg.jpg");
		//ImageIcon 통해서 Image 객체 받아오기
		Image img=icon.getImage();
		//X좌표, y 좌표 변수 선언 -0, 0 으로 초기화
		private int x=0,y=0;
		public void paintComponent(Graphics g) {
			//super()
			super.paintComponent(g);
			//클리핑 영역 지정 - x, y, 50, 50
			g.setClip(x,y,50,50);
			// 뒷 배경 그리기
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),this);
			// 숨길 글자 색 지정 (setColor)
			g.setColor(Color.white);
			// 숨길 글자를 지정하기 --> drawString(글자, 가로, 세로 위치)
			g.drawString("짱절미", 40	, 300);
		}

		public MyPanel() {

			// 여기에 setFocusable & requestFocus 설정
			this.requestFocus();
			this.setFocusable(true);
			// keyListener 추가 - KeyAdapter()
			this.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					switch(e.getKeyCode()) {
					case KeyEvent.VK_UP:
						y-=10;
						if(y<10)
							y=0;
						break;
					case KeyEvent.VK_DOWN:
						y+=10;
						if(y>getHeight()-50)
							y=getHeight()-50;
						break;
					case KeyEvent.VK_LEFT:
						x-=10;
						if(x<10)
							x=0;
						break;
					case KeyEvent.VK_RIGHT:
						x+=10;
						if(x>getWidth()-50)
							x=getWidth()-50;
						break;
					
					}
				repaint();
				}
			});
			// keyPressed 함수 재정의
			// switch (e.getKeyCode()) ....
			// VK_UP, VK_DOWN, VK_LEFT, VK_RIGHT 함수 정의
			// x, y좌표를 +10, -10, 창 범위를 벗어나는 경우 처리
			// repaint();
		}
	}

	public static void main(String[] args) {
		new ClipAndKeyFrame();
	}
}
