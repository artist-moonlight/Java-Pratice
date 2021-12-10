import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseWheelFrame extends JFrame {
	public MouseWheelFrame() {
		// title 설정 (학번 이름 - 클래스 이름)
		super("MouseWheelFrame");
		// default close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 배치관리자 설정 -FlowLayout
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		// "Love Java" 텍스트 라벨
		JLabel label=new JLabel("Love Java");
		// add label
		c.add(label);
		// "Arial", plain, 15 픽셀 크기
		label.setFont(new Font("Arial",Font.PLAIN,15));
		// 라벨에  mouseWheelListener 추가 및 익명 클래스 정의
		label.addMouseWheelListener(new MouseWheelListener(){
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n=e.getWheelRotation();
				if(n<0)
				{
					Font f=label.getFont();
					int size=f.getSize();
					if(size<=5)
						return;
					label.setFont(new Font("Arial",Font.PLAIN,size-5));
				}
				else {

					Font f=label.getFont();
					int size=f.getSize();
					label.setFont(new Font("Arial",Font.PLAIN,size+5));
				}
			}
		});

		c.add(label);
		// size 300*150
		setSize(300,150);
		// visible true
		setVisible(true);
	}
	
	static public void main(String [] args) {
		new MouseWheelFrame();
	}
}
