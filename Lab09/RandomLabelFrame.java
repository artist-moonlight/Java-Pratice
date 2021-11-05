import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;
public class RandomLabelFrame extends JFrame{ // JFrame 상속
	// Random 객체 생성
	// JPanel 생성
	JPanel jp=new JPanel();
	// 크기 20 인 JLable 배열 생성
	JLabel jl[]=new JLabel[20];
	public int getLabelLocation() {
		//return   random 한 값 50 ~ 250
		return (int)(Math.random() * 200) + 50;
	}

	/* RandomLabelFrame 생성자
	 	* 부모 생성자 호출, parameter : 클래스 이름;
	 	* panel layout null로 설정
	 	* label list length for loop..
	 		* 각 요소에 JLabel 생성
	 		* 배경색 노란색
	 		* setOpaque true 로 설정
	 		* size 15*10 
	 		* location 설정 -> getLabelLocation 호출
	 		* panel 에 label 붙이기
 		* panel 붙이기
 		* visible 설정
 		* size 300*300
	 */
	public RandomLabelFrame() {
		super("RandomLabelFrame");
		jp.setLayout(null);
		for(int i=0;i<jl.length;i++) {
			jl[i]=new JLabel((int)(Math.random() * 100)+"");
			jl[i].setBackground(Color.yellow);
			jl[i].setOpaque(true);
			jl[i].setSize(15,10);
			jl[i].setLocation(getLabelLocation(),getLabelLocation());
			jp.add(jl[i]);
			
		}
		add(jp);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RandomLabelFrame();
	}

}
