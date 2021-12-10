import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GraphicsAndMouseDraggingFrame extends JFrame {
	public GraphicsAndMouseDraggingFrame() {
		// title 설정
		super("1914337 이서진-ClipAndKeyFrame");
		// MyPanel add
		add(new MyPanel());
		// default Close operation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창크기 350, 500
		setSize(350,500);
		// Visible 설정
		setVisible(true);
	}

	class MyPanel extends JPanel {
		// ImageIcon 받아와서 뒷 배경 설정 - ./images/back.jpg
		ImageIcon icon=new ImageIcon("./images/back.jpg");
		// ImageIcon 을 image 로 받아오기
		Image img=icon.getImage();
		// 시작 위치 100, 100 으로 설정
		int x=100,y=100;
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			// 뒷 배경 그리기
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),this);
			// color 설정 (yellow)
			g.setColor(Color.yellow);
			// 채운 동그라미 그리기 ( x, y 위치에 , 20 크기로)
			g.fillOval(x,y,20,20);
		}

		public MyPanel() {
			// mosueMotionListener 추가 - MouseAdapter()
			this.addMouseMotionListener(new MouseAdapter() {
				public void mouseDragged(MouseEvent e) {
					x=e.getX();
					y=e.getY();
					repaint();
				}
			});
			// --> mouseDragged 함수 재정의
			// event 가 발생한 위치를 x, y로 설정
			// 해당 위치로 다시 그리기
		}

	}

	public static void main(String[] args) {
		new GraphicsAndMouseDraggingFrame();
	}

}
