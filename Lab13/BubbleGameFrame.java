import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BubbleGameFrame extends JFrame {
	public BubbleGameFrame() {
		// title 설정
		super("1914337 이서진-BubbleGameFrame");
		// Panel 생성
		JPanel jp=new JPanel();
		// panel layout 없애기
		jp.setLayout(null);
		// panel 에 listener 추가 - param : MouseAdapter()
		jp.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				BubbleThread bthread=new BubbleThread(jp,e.getX(),e.getY());
				bthread.start();
			}
		});
		
		// mousePressed() 재정의해주기
		// --> BubbleThread 생성 + start() 하기
		// --> bubblethread 생성자 호출 시 paramger(panel, x좌표, y좌표)
		// 콘텐트팬 Panel로 설정
		Container con=getContentPane();
		con.add(jp);
		// default close operation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창 size 400, 400
		setSize(400,400);
		// visible 설정
		setVisible(true);
	}

	public static void main(String[] args) {
		new BubbleGameFrame();
	}
}

class BubbleThread extends Thread {
	// Lable, Panel 변수 선언 - private
	JLabel bubble;
	JPanel jp;
	int x,y;
	public BubbleThread(JPanel jp, int x, int y) {
		// bubble img 받아와서 label imageIcon 설정하기
		ImageIcon img=new ImageIcon("./images/bubble.jpg");
		bubble=new JLabel(img);
		// label(bubble) size 설정 (img.getIconWidth()... )
		bubble.setSize(img.getIconWidth(),img.getIconHeight());
		// bubble 위치 설정 (x, y)
		bubble.setLocation(x,y);
		// 받아온 panel 로 전체 panel 설정해주기
		this.jp=jp;
		// 판넬에 bubble 추가
		jp.add(bubble);
		// 추가한 것을 반영해주기 위해 repaint()
		jp.repaint();
	}

	@Override
	public void run() {
		while (true) {
			// x좌표는 변화없음, y좌표는 5씩 감소
			int x=bubble.getX();
			int y=bubble.getY()-5;
			// y가 0보다 작아지게 되면
				// 이미지 라벨 제거
				// 제거한 것을 반영해주기 위해 repaint()
			if (y < 0) {
				jp.remove(bubble);
				jp.repaint();
				// or bubble.setVisible(false);
				return;
			}
			// x, y 세팅
			// repaint()로 반영
			bubble.setLocation(x,y);
			jp.repaint();
			try {
				sleep(20);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}
