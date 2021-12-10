import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;


public class TextAreaPracticeFrame extends JFrame {
	// row 5, column 10 인 JTextArea 생성 - private
	private JTextArea ta=new JTextArea(5,10);
	// 0부터 100까지 범위를 가지는 시작값이 0인 JSlider 생성 - private
	private JSlider slider=new JSlider(0,100,0);
	public TextAreaPracticeFrame() {
		// 학번 이름 - 클래스 제목으로 타이틀 설정
		super("1914337-이서진-TextAreaPracticeFrame");
		// slider의 Major 스페이싱 설정 - 20 단위로
		slider.setMajorTickSpacing(20);
		// slider minor 스페이싱 설정 - 5단위
		slider.setMinorTickSpacing(5);
		// slider PaintTicks, PaintLabels true로 설정
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		// slider 에 changeListener 추가
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(ta.getText().length()<=slider.getValue())
					slider.setValue(ta.getText().length());
				else {
					try {
						ta.setText(ta.getText(0,slider.getValue()));
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
			// stateChanged 함수 재정의
			/*
			 * 1. 텍스트박스의 텍스트 길이 <= 슬라이더의 value
			 * 	슬라이더의 value 설정하기 (텍스트 박스의 텍스트 길이로)
			 * 2. 텍스트박스 텍스트 길이 > 슬라이더의 value
			 * 	텍스트박스 텍스트 설정 (텍스트박스의 텍스트 가져오기 (0부터 슬라이더의 길이만큼)) --> 슬라이더보다 텍스트 박스의 글자가 더 많다면 지워주는 것
			 * --> BadLocationException 에러 try - catch 문으로 처리해주기
			 */
		ta.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				int len=ta.getText().length();
				if(len>=100) {
					try {
						ta.setText(ta.getText(0,100));
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				slider.setValue(len);
			}
		});
		// 텍스트 박스에 KeyListener 추가하기
			// keyTyped 함수 재정의
			/*
			 * 텍스트 박스의 길이 가져와서 변수에 저장
			 * 
			 * 길이가 100 이상이라면
			 * 	텍스트 박스의 텍스트 설정 (텍스트 박스에서 텍스트를 0 ~ 100까지만 가져오기) --> 100글자 이상의 텍스트는 적지 못하게 하는 것
			 * BadLocationException 에러 try - catch 로 처리해주기
			 * 슬라이더를 길이로 세팅해주기 (setValue)
			 */
		
		// 판넬 생성 - BorderLayout 초기 레이아웃 설정
		JPanel panel=new JPanel();
		panel.add(new JScrollPane(ta),"NORTH");
		// 텍스트 박스를 JScrollPane로 생성해주고 판넬의 북쪽에 추가
		// 슬라이더를 판넬의 센터에 추가
		panel.add(slider,"CENTER");
		// 판넬 추가
		add(panel);
		// 창 크기 400, 200
		setSize(400,200);
		// defaultCloseOperation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// visible 설정
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextAreaPracticeFrame();
	}

}
