package RPG_Game;

import java.awt.Font;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

import javax.swing.*;

public class Main extends JFrame{
	public Main() {
		JFrame f1 = new JFrame();  //jFrame선언 = f1
		
		String fath = "./save.txt";
		Path filePath = Paths.get(fath);
		File file = new File(fath);
		
		if(!file.exists())
		{
			Save.issave = false;
		}
		
		JLabel lb1 = new JLabel("TEXT RPG GAME");
		Font font = new Font("Serif", Font.BOLD, 30);
		lb1.setFont(font);
		lb1.setBounds(170, 150, 300, 30);
		
		JLabel lb2 = new JLabel("Click Button or Press keyboard");
		Font font3 = new Font("Serif", Font.BOLD, 20);
		lb2.setFont(font3);
		lb2.setBounds(170, 200, 300, 30);
		
		JButton b1 = new JButton("Game Start(S)");
		b1.setBounds(230, 250, 120, 30);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				f1.dispose();
				new Description();
			}
		});
		JButton b2 = new JButton("Exit(E)");
		b2.setBounds(240, 350, 100, 30);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		JButton b3 = new JButton("Delete Save(D)");
		b3.setBounds(228, 300, 125, 30);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					Files.delete(filePath);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Save.issave = false;
			}
		});
		
		if(!Files.exists(filePath))
		{
			b3.setVisible(false);
		}
		else
		{
			b3.setVisible(true);
		}
		
		f1.addKeyListener(new KeyAdapter() 
		{
            @Override
            public void keyPressed(KeyEvent e) 
            {
                if (e.getKeyChar() == 'S' || e.getKeyChar() == 's') 
                {
                    b1.doClick();
                }
                if (e.getKeyChar() == 'D' || e.getKeyChar() == 'd')
                {
                	b3.doClick();
                }
                if (e.getKeyChar() == 'E' || e.getKeyChar() == 'e')
                {
                	b2.doClick();
                }
            }
        });
		
		f1.add(lb1);
		f1.add(lb2);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.setTitle("RPG_GAME");    //창 이름
		f1.setSize(600, 600);		//창 크기
		f1.setLayout(null);			//레이아웃
		f1.setVisible(true);		//출력
		f1.setFocusable(true);
	}
}