import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImagePracticeFrame extends JFrame {
	public ImagePracticeFrame() {		
		// title 설정
		super("1914337 이서진-ImagePracticeFrame");
		// MyPanel add
		add(new MyPanel());
		// default Close operation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창크기 300, 300
		setSize(300,300);
		// Visible 설정
		setVisible(true);

	}

	class MyPanel extends JPanel {
		// ImageIcon 받아와서 뒷 배경 설정 - ./images/image.jpg
		ImageIcon icon=new ImageIcon("./images/image.jpg");
		// ImageIcon 을 image 로 받아오기
		Image img=icon.getImage();
		// 이미지 가로, 세로 길이
		int imgWidth=icon.getIconWidth();
		int imgHeight=icon.getIconHeight();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			
			// 판넬 가로, 세로 길이
			int panelWidth=this.getWidth();
			int panelHeight=this.getHeight();
			// 이미지 네등분해서 판넬에 설정
			// drawImage(이미지, 이미지 그릴 위치(왼쪽 위부터 ~ 가로, 세로 크기), 그릴 이미지 가져오기(왼쪽 위 ~ 가로, 세로 크기), this);
			// --> 총 4번 그리기

			g.drawImage(img,0,0,panelWidth/2-5,panelHeight/2-5,0,0,imgWidth/2,imgHeight/2,this);

			g.drawImage(img,panelWidth/2+5,0,panelWidth,panelHeight/2-5,imgWidth/2,0,imgWidth,imgHeight/2,this);
			g.drawImage(img,0,panelHeight/2+5,panelWidth/2-5,panelHeight,0,imgHeight/2,imgWidth/2,imgHeight,this);
			g.drawImage(img,panelWidth/2+5,panelHeight/2+5,panelWidth,panelHeight,imgWidth/2,imgHeight/2,imgWidth,imgHeight,this);
			
		}
	}

	public static void main(String[] args) {
		new ImagePracticeFrame();
	}
}


