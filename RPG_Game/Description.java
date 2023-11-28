package RPG_Game;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Description extends JFrame{
	public Description()
	{
		JFrame f1 = new JFrame();  //jFrame선언 = f1
		
		JLabel lb1 = new JLabel("TEXT RPG GAME DESCRIPTION");
		Font font = new Font("Serif", Font.BOLD, 30);
		Font font2 = new Font("Serif", Font.BOLD, 20);
		lb1.setFont(font);
		lb1.setBounds(60, 50, 500, 30);
		
		JLabel lb2 = new JLabel("1. Upgrade your Character with Stat Point.");
		lb2.setFont(font2);
		lb2.setBounds(110, 100, 500, 30);
		
		JLabel lb3 = new JLabel("2. Every time you raise the Level by 10,");
		lb3.setFont(font2);
		lb3.setBounds(110, 150, 500, 30);
		
		JLabel lb4 = new JLabel("    You Fight with a Boss Monster.");
		lb4.setFont(font2);
		lb4.setBounds(110, 200, 500, 30);
		
		JLabel lb5 = new JLabel("3. Acc is Attack accuracy.");
		lb5.setFont(font2);
		lb5.setBounds(110, 250, 500, 30);
		
		JLabel lb6 = new JLabel("4. If you Win to Final Boss, this game will END.");
		lb6.setFont(font2);
		lb6.setBounds(110, 300, 500, 30);
		
		JLabel lb7 = new JLabel("5. If you want to Create a new Save Data,");
		lb7.setFont(font2);
		lb7.setBounds(110, 350, 500, 30);
		
		JLabel lb8 = new JLabel("    Please press \'Delete Save\' on the Main Menu");
		lb8.setFont(font2);
		lb8.setBounds(110, 400, 500, 30);
		
		JButton b1 = new JButton("Game Start(S)");
		b1.setBounds(240, 450, 120, 30);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				f1.dispose();
				if(Save.issave == true)
				{
					new Player_Stat();
				}
				else if(Save.issave == false)
				{
					new Naming();
				}
			}
		});
		
		f1.addKeyListener(new KeyAdapter() 
		{
            @Override
            public void keyPressed(KeyEvent e) 
            {
                if (e.getKeyChar() == 'S' || e.getKeyChar() == 's') 
                {
                		b1.doClick();
                }
            }
        });
		
		f1.add(lb1);
		f1.add(lb2);
		f1.add(lb3);
		f1.add(lb4);
		f1.add(lb5);
		f1.add(lb6);
		f1.add(lb7);
		f1.add(lb8);
		f1.add(b1);
		f1.setTitle("RPG_GAME");    //창 이름
		f1.setSize(600, 600);		//창 크기
		f1.setLayout(null);			//레이아웃
		f1.setVisible(true);		//출력
		f1.setFocusable(true);
	}
}