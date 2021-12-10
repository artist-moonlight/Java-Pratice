import java.io.File;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;


public class ImageGallery extends JFrame {
	// ImageIcon 타입의 Vector 만들기 - private
	private Vector<ImageIcon> imgVector=new Vector<ImageIcon>();
	// 초기값 0인 index 변수 생성하기 - private
	public int index=0;
	// 이미지 파일들을 가져와서 Vector 에 넣어주는 함수
	public void loadImages(String path) {
		// path 위치 파일 변수 생성
		File file=new File(path);
		// 생성한 파일 변수를 이용하여 해당 폴더의 하위에 존재하는 파일들의 목록 가져오기 --> listFiles()
		File files[]=file.listFiles();
		// 하위 파일들의 목록 갯수만큼 for 문을 반복하여 imgVector에 넣어주기 (ImageIcon 형태로 변형하여)
		for(int i=0;i<files.length;i++) {
			imgVector.add(new ImageIcon(files[i].getPath()));
		}		
	}
	
	public ImageGallery() {
		// 학번 이름 - 클래스 제목으로 타이틀 설정
		super("1914337 이서진-ImageGallery");
		// panel 하나 생성 (전체 판넬, BorderLayout)
		JPanel panel=new JPanel();
		// 라디오 버튼 가질 판넬 하나 생성
		JPanel radio=new JPanel();
		// JRadioButton 두개 생성 - left(true), right
		JRadioButton left=new JRadioButton("left",true);
		JRadioButton right=new JRadioButton("right");
		// 라디오 버튼 두개를 버튼 그룹으로 묶어주기 - ButtonGroup .add
		ButtonGroup group=new ButtonGroup();
		group.add(left);
		group.add(right);
		// loadImages 함수를 호출하여 현재 프로젝트 하위의 images 폴더에 있는 사진 목록 가져오기
		loadImages("./images");
		// JLabel 를 사용하여 이미지 가져오기 - 생성자 호출 시 vector 의 0번째 값으로 첫 이미지 설정하기
		JLabel img=new JLabel(imgVector.get(0));
		// img(label) 를 클릭하면 다음/이전 이미지를 호출하므로 MouseListener 추가하기
		img.addMouseListener(new MouseAdapter(){
			// mouseClicked 함수를 재정의해주고
			public void mouseClicked(MouseEvent e) {
				// right 라디오 버튼이 눌러졌는지 확인
				if(right.isSelected()) {
					index++;
					System.out.println("1");
				}
				else if(left.isSelected() && index!=0) {
					index--;

				}
				img.setIcon(imgVector.get(index));
				if(index>=imgVector.size()) {
					index=0;
				}

			}
		});
		// 라디오 판넬에 라디오버튼 두개 추가
		radio.add(left);
		radio.add(right);
		// 판넬의 북쪽에 라디오 판넬 추가
		panel.add(radio,BorderLayout.NORTH);
		// img(label)을 판넬의 센터에 추가
		panel.add(img,BorderLayout.CENTER);
		// 판넬 추가
		add(panel);
		// 창 크기 400, 300
		setSize(400,300);
		// defaultCloseOperation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// visible 설정
		setVisible(true);
	}
	public static void main(String[] args) {
		new ImageGallery();
	}

}
