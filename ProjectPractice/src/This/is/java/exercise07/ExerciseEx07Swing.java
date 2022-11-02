package This.is.java.exercise07;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ExerciseEx07Swing extends JFrame {
		
	ExerciseEx07Swing(){
		setTitle("7번 스윙");
		setSize(400,400);
		setLocation(800,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.setPreferredSize(new Dimension(200,70));
		JButton j1 =new JButton("예금");
		JButton j2 =new JButton("출금");
		JButton j3 =new JButton("잔고");
		JButton j4 =new JButton("종료");
		
		
		p2.add(j1);
		p2.add(j2);
		p2.add(j3);
		p2.add(j4);
		
		c.add(p1);
		c.add(p2);
		
		JLabel ba1 = new JLabel("뱅킹");
		p1.add(ba1);
		
		setVisible(true);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		new ExerciseEx07Swing();
	}
	

}
