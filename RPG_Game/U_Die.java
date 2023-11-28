package RPG_Game;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.*;

public class U_Die {
	public U_Die() {
		String fath = "./save.txt";
		Path filePath = Paths.get(fath);
	
		try {
			Files.delete(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JFrame f1 = new JFrame();  //jFrame선언 = f1
		
		JLabel lb1 = new JLabel("YOU DIE");
		Font font = new Font("Serif", Font.BOLD, 50);
		lb1.setFont(font);
		lb1.setBounds(180, 150, 300, 60);
		
		JButton b1 = new JButton("Main Menu(M)");
		b1.setBounds(233, 250, 115, 30);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Save.issave = false;
				Player_U.hp = 100;
				Player_U.att = 15;
				Player_U.def = 2;
				Player_U.acc = 55;
				Player_U.max_hp = 100;
				Player_U.exp = 0;
				Player_U.lev = 1;
				Player_U.name = "";
				Player_U.L_Point = 0;
				Player_U.isdead_P = false;
				Player_Stat.isfirst = true;
				f1.dispose();
				new Main();
			}
		});
		
		JButton b2 = new JButton("Exit(E)");
		b2.setBounds(240, 300, 100, 30);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Save.issave = false;
				System.exit(0);
			}
		});

		f1.addKeyListener(new KeyAdapter() 
		{
            @Override
            public void keyPressed(KeyEvent e) 
            {
                if (e.getKeyChar() == 'M' || e.getKeyChar() == 'm') 
                {
                    b1.doClick();
                }  
                if (e.getKeyChar() == 'E' || e.getKeyChar() == 'e')
                {
                	b2.doClick();
                }
            }
        });
		
		f1.add(lb1);
		f1.add(b1);
		f1.add(b2);
		f1.setTitle("RPG_GAME");    //창 이름
		f1.setSize(600, 600);		//창 크기
		f1.setLayout(null);			//레이아웃
		f1.setVisible(true);		//출력
		f1.setFocusable(true);
	}
}