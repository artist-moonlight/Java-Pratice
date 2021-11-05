import java.awt.*;
import javax.swing.*;

public class MultiPanelFrame extends JFrame{ // JFrame 상속
	
	public JPanel getNorthPanel() {
//		 JPanel 생성
		JPanel north=new JPanel();
//		  north panel 에 존재하는 버튼 3개 생성(열기, 닫기, 나가기)
		north.add(new JButton("열기"));
		north.add(new JButton("닫기")); 
		north.add(new JButton("나가기"));	
//		  panel 에 붙이기
		add(north);
//		  panel return
		return north;
		 
	}
	
	public JPanel getSouthPanel() {
//		 JPanel 생성
		JPanel south=new JPanel();
//		 button 생성 - "Word Input"
		JButton button=new JButton("Word Input");
//		 size 15인 textField 생성
		JTextField tf=new JTextField(15);		
//		 panel 에 button, tf 붙이기 
		south.add(button);
		south.add(tf);
//		 panel return
		return south;
	}
	
	public int getRandomLocation() {
		return (int)(Math.random() * 200) + 50;
	}
	
	public JPanel getCenterPanel() {
//		 JPanel 생성
		JPanel center=new JPanel();
//		 layout null 로 설정
		center.setLayout(null);
//		 배경색 흰색으로 설정
		center.setBackground(Color.white);
//		 size 5 인 JLabel list 생성
		JLabel jl[]=new JLabel[5];
//		 jlabel length for loop....
		for(int i=0;i<jl.length;i++) {
//		 	각 요소 별 JLabel 생성 "*"
			jl[i]=new JLabel("*");
//		 	fontcolor - setForegroud 함수 사용
			jl[i].setForeground(Color.RED);
//		 	size 10*10
			jl[i].setSize(10,10);
//		 	location 설정 - getRandomLocation 호출
			jl[i].setLocation(getRandomLocation(),getRandomLocation());
//		 	panel 에 label 붙이기
			center.add(jl[i]);
		}
//		 return panel
		return center;
		 
	}
	
	public MultiPanelFrame() {
		
//		 	부모 생성자 호출, parameter :  클래스 이름;
		super("MultiPanelFrame");
//		 	DefaultCloseOperation- JFrame.EXIT_ON_CLOSE
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		 	panel 하나 생성
		JPanel jp=new JPanel();
//		 	BorderLayout 으로 설정
		jp.setLayout(new BorderLayout());

//		 	각 위치 별 panel 붙이기(함수 호출 getNorth...)
		jp.add(getNorthPanel(),BorderLayout.NORTH);
		jp.add( getSouthPanel(),BorderLayout.SOUTH);
		jp.add( getCenterPanel() ,BorderLayout.CENTER);
//		 	panel 붙이기
		add(jp);	
//		 	visible 설정
		setVisible(true);
//		 	size 350*350 
		setSize(350,350); 
	}

	public static void main(String[] args) {
		new MultiPanelFrame();
	}

}
