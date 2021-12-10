import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MoneyChangerCheckBoxFrame extends JFrame {

	public MoneyChangerCheckBoxFrame() {
		// 학번 이름 - 클래스 제목으로 타이틀 설정
		setTitle("1914337-이서진-MoneyChangerCheckBoxFrame");
		//MyPanel 생성자를 사용하여 ContentPane 설정
		MyPanel panel=new MyPanel();
		Container con=getContentPane();
		con.add(panel);
		// 창 크기 00, 300
		setSize(400,300);
		// defaultCloseOperation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// visible 설정
		setVisible(true);
	}
	

	class MyPanel extends JPanel {
		// 50000 ~ 1 원으로 구성된 int 배열 하나 생성
		
		private int[] unit= {50000,10000,1000,500,100,50,10,1};
		// "오만원" ~ "1원" 으로 구성된 String 배열 하나 생성
		private String[] str= {"오만원","만원","천원","500원","100원","50원","10원","1원"};
		// JCheckBox 배열 생성 (크기는 위 배열의 길이만큼)
		private JCheckBox[] ch=new JCheckBox[unit.length];
		// JTextField 배열 생성 (크기는 위와 동일)
		private JTextField[] tf=new JTextField[str.length];
		public MyPanel() {
			
			// 배경색을 PINK 로 설정 (디폴트 색생 빼고 다른 색으로 정의 가능)
			this.setBackground(Color.PINK);
			// 판넬 하나 생성
			JPanel north=new JPanel();
			// 판넬 색상을 위 정의한 색상과 동일하게 설정
			north.setBackground(Color.pink);
			// "금액" 라벨을 가지는 라벨 하나 생성
			JLabel hi=new JLabel("금액");
			// 15크기의 텍스트필드 하나 생성 (금액)
			JTextField input=new JTextField(10);
			// "계산" 라벨을 가지는 버튼 하나 생성
			JButton btn=new JButton("계산");
			// 판넬에 라벨, 텍스트필드, 버튼 순서대로 붙이기
			north.add(hi);
			north.add(input);
			north.add(btn);
			// 판넬 붙이기
			add(north);
			// 센터 판넬 하나 생성
			JPanel center=new JPanel();
			// 센터 판넬의 레이아웃 설정 - GridLayout (row, col) : hint) 위 배열의 길이가 행의 갯수이고, 컬럼의 경우 라벨, 텍스트필드, 콤보박스가 들어간다.
			center.setLayout(new GridLayout(8,3));
			// 센터 판넬의 배경색 설정 (위 정의한 색상과 동일하게 설정)
			center.setBackground(Color.pink);
			// 배열(클래스의 처음에 정의해준) 의 길이만큼 돌면서
			for(int i=0;i<unit.length;i++) {
				// 라벨을 String 배열의 값을 하나씩 받아오면서 설정
				JLabel la=new JLabel(str[i]);
				// 위 텍스트필드 배열에서 각각의 인덱스에 크기 10인 텍스트 필드를 생성
				tf[i]=  new JTextField(10);
				// 위 콤보박스 배열에서 각각의 인덱스에 체크 박스 생성 ("", false)
				ch[i]=new JCheckBox();
				la.setBackground(Color.pink);
				// 콤보 박스의 opaque 를 false로 설정
				// 센터 판넬에 라벨, 텍스트 필드, 콤보박스를 순서대로 추가
				center.add(la);
				center.add(tf[i]);
				center.add(ch[i]);
			}
			// 센터 판넬 추가
			add(center);
			// "클릭" 버튼에 ActionListener 추가
			btn.addActionListener(new ActionListener() {
				// actionPerformed 함수 재정의
				public void actionPerformed(ActionEvent e) {
					// 첫 텍스트 필드에서 값을 가져옴
					String string=(input.getText());
					// 만약 텍스트 필드에 아무것도 입력되어 있지 않다면 --> return ;
					// 텍스트 필드 값을 Integer 값으로 변경 (parseInt)
					int money=Integer.parseInt(string);
					// 변수 하나 생성 (몇 장 or 몇 개 계산할 변수)
					int res;
					for(int i=0;i<unit.length;i++) {
						if(i==unit.length-1) {
							tf[i].setText(Integer.toString(money));
							break;
						}
						if(!ch[i].isSelected()) {
							tf[i].setText("0");
							continue;
						}
						res=money/unit[i];
						tf[i].setText(Integer.toString(res));
						money%=unit[i];
					}
				}
			});
		}
		private JCheckBox JTextField(int i) {
			// TODO Auto-generated method stub
				return null;
		}
	}

	public static void main(String[] args) {
		new MoneyChangerCheckBoxFrame();
	}

}
