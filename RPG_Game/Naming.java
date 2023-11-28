package RPG_Game;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Naming extends JFrame {
	
	public Naming(){
		Player_U C1 = new Player_U();
		JFrame f1 = new JFrame();
		
		JLabel lb1 = new JLabel("Enter Your Character Name");
		Font font = new Font("Serif", Font.BOLD, 30);
		lb1.setFont(font);
		lb1.setBounds(115, 150, 400, 30);
		
		JTextField tf1 = new JTextField(20);
		tf1.setBounds(90, 200, 300, 30);
		
		JButton b1 = new JButton("Enter");
		b1.setBounds(400, 200, 100, 30);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				C1.name = tf1.getText().toString();
				if(tf1.getText().toString() == null)
				{
					C1.name = "Nobody";
				}
				f1.dispose();
				new Player_Stat();
			}
		});
		
		f1.add(tf1);
		f1.add(b1);
		f1.add(lb1);
		f1.setTitle("RPG_GAME");    //창 이름
		f1.setSize(600, 600);		//창 크기
		f1.setLayout(null);			//레이아웃
		f1.setVisible(true);		//출력
	}	
}