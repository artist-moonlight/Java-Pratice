import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MouseDraggingFrame extends JFrame {
	public MouseDraggingFrame() {
		// title 설정 (학번 이름 - 클래스 이름)
		super(" MouseDraggingFrame");
		// Container 생성 = getContentPane();
		Container c= getContentPane();
		// container 의 배경색 설정 - default Green
		c.setBackground(Color.green);
		// MyMouseListener 정의
		MyMouseListener ml=new MyMouseListener();
		// container 에 mouseListener 추가
		c.addMouseListener(ml);
		// container 에 mouseMotionListener 추가
		c.addMouseMotionListener(ml);
		// size 400 * 200
		setSize(400,200);
		// default close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// visible true
		setVisible(true);
	}

	class MyMouseListener extends MouseAdapter {
		public void mouseDragged(MouseEvent e) {
			// Container 생성 = e.getSource();
			Container c= (Container) e.getSource();
			c.setBackground(Color.yellow);// 배경색 설정 - yellow
		}

		public void mouseReleased(MouseEvent e) {
			// Container 생성
			Container c= (Container) e.getSource();
			// 배경색 설정 - green
			c.setBackground(Color.green);
		}
	}

	public static void main(String[] args) {
		new MouseDraggingFrame();
	}

}
