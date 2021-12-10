import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MoveStringFrame extends JFrame {
	public MoveStringFrame() {
		// title 설정
		super("1914337 - 이서진 - MoveStringFrame");
		// Panel 생성
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		// Label 생성 - default "Love Java"
		JLabel jl=new JLabel("Love Java");
		// panel 에 label 붙이기
		c.add(jl);
		// label 에 keyListener 추가 (param - KeyAdapter()) => 익명클래스 구현
		jl.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					JLabel label=(JLabel)e.getSource();
					String text=label.getText();
					jl.setText(text.substring(1)+text.charAt(0));
				}
			}
		});

		jl.setFocusable(true);
		// requestFocus 설정
		// Panel 추가
		c.add(jl);
		// size 400 * 200
		setSize(400,200);
		// default close operation
		setVisible(true);
		// visible true
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MoveStringFrame();
	}

}
