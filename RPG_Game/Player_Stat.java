package RPG_Game;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Player_Stat extends JFrame {
	int cha;
	String HP;
	String M_HP;
	String ATT;
	String DEF;
	String Name;
	String L_point;
	String ACC;
	static boolean isfirst = true;
	public Player_Stat()
	{
		String filePath = "./save.txt";
		File file = new File(filePath);
		
		if(Save.issave == true)
		{
			if(file.exists())
			{
				try(BufferedReader br = new BufferedReader(new FileReader(filePath)))
				{
					String str1 = br.readLine();
					Player_U.hp = Integer.parseInt(str1);
					String str2 = br.readLine();
					Player_U.max_hp = Integer.parseInt(str2);
					String str3 = br.readLine();
					Player_U.att = Integer.parseInt(str3);
					String str4 = br.readLine();
					Player_U.def = Integer.parseInt(str4);
					String str5 = br.readLine();
					Player_U.exp = Integer.parseInt(str5);
					String str6 = br.readLine();
					Player_U.lev = Integer.parseInt(str6);
					String str7 = br.readLine();
					Player_U.name = str7;
					String str8 = br.readLine();
					Player_U.L_Point = Integer.parseInt(str8);
					String str9 = br.readLine();
					Player_U.acc = Integer.parseInt(str9);
					String str10 = br.readLine();
					Player_Stat.isfirst = Boolean.parseBoolean(str10);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			else
			{
				new Save();
			}
		}
		
		if(Player_U.name == "null" || Player_U.name == "")
		{
			Player_U.name = "nobody";
		}
		JFrame f1 = new JFrame();
		
		Name = Player_U.name;
		M_HP = Player_U.max_hp + "";
		Player_U.hp = Player_U.max_hp;
		HP = M_HP;
		ATT = Player_U.att + "";
		DEF = Player_U.def + "";
		
		if(isfirst == true)
		{
			Player_U.L_Point += 5;
			isfirst = false;
		}
		L_point = Player_U.L_Point + "";
		ACC = Player_U.acc + "%";
		
		JButton b5 = new JButton("+3ACC(C)");
		
		if(Player_U.acc == 85)
		{
			b5.setVisible(false);
		}
		
		JLabel lb1 = new JLabel("Upgrade Your Character");
		Font font = new Font("Serif", Font.BOLD, 30);
		lb1.setFont(font);
		lb1.setBounds(145, 100, 400, 40);
		
		JLabel lb2 = new JLabel("NAME : ");
		Font font2 = new Font("Serif", Font.BOLD, 20);
		lb2.setFont(font2);
		lb2.setBounds(80, 150, 100, 30);
		
		JLabel lb3 = new JLabel();
		lb3.setFont(font2);
		lb3.setBounds(160, 150, 400, 30);
		lb3.setText(Name);
		
		JLabel lb4 = new JLabel("HP : ");
		lb4.setFont(font2);
		lb4.setBounds(80, 175, 100, 30);
		
		JLabel lb5 = new JLabel();
		lb5.setFont(font2);
		lb5.setBounds(125, 175, 400, 30);
		lb5.setText(HP);

		JLabel lb6 = new JLabel("ATT : ");
		lb6.setFont(font2);
		lb6.setBounds(80, 200, 100, 30);
		
		JLabel lb7 = new JLabel();
		lb7.setFont(font2);
		lb7.setBounds(140, 200, 400, 30);
		lb7.setText(ATT);
		
		JLabel lb8 = new JLabel("DEF : ");
		lb8.setFont(font2);
		lb8.setBounds(80, 225, 100, 30);
		
		JLabel lb9 = new JLabel();
		lb9.setFont(font2);
		lb9.setBounds(140, 225, 400, 30);
		lb9.setText(DEF);
		
		JLabel lb10 = new JLabel("Stat Point : ");
		lb10.setFont(font2);
		lb10.setBounds(235, 350, 200, 30);
		
		JLabel lb11 = new JLabel();
		lb11.setFont(font2);
		lb11.setBounds(335, 350, 400, 30);
		lb11.setText(L_point);
		
		JLabel lb12 = new JLabel("ACC : ");
		lb12.setFont(font2);
		lb12.setBounds(80, 250, 100, 30);
		
		JLabel lb13 = new JLabel();
		lb13.setFont(font2);
		lb13.setBounds(140, 250, 400, 30);
		lb13.setText(ACC);
		
		JButton b4 = new JButton("Go To Battle Field(G)");
		b4.setBounds(190, 470, 200, 30);
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Player_U.lev % 10 == 0)
				{
					b4.setText("Go to Boss Stage");
					if(b4.getText() == "Go to Boss Stage")
					{
						f1.dispose();
						new Boss_Battle_Field();
					}
					else
					{
						f1.dispose();
						new Battle_Field();
					}
				}
				f1.dispose();
				new Battle_Field();
			}
		});
		
		JButton b1 = new JButton("+20HP(H)");
		b1.setBounds(90, 400, 100, 30);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Player_U.L_Point == 1)
				{
					b4.setVisible(true);
					Player_U.hp += 20;
					HP = Player_U.hp + "";
					lb5.setText(HP);
					Player_U.L_Point -= 1;
					L_point = Player_U.L_Point + "";
					lb11.setText(L_point);
					Player_U.max_hp = Player_U.hp;
				}
				else if(Player_U.L_Point != 0)
				{
					Player_U.hp += 20;
					HP = Player_U.hp + "";
					lb5.setText(HP);
					Player_U.L_Point -= 1;
					L_point = Player_U.L_Point + "";
					lb11.setText(L_point);
					Player_U.max_hp = Player_U.hp;
				}
				else if(Player_U.L_Point == 0)
				{
					b4.setVisible(true);
				}
				else
				{
					b4.setVisible(false);
				}
			}
		});
		
		JButton b2 = new JButton("+5ATT(T)");
		b2.setBounds(190, 400, 100, 30);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Player_U.L_Point == 1)
				{
					b4.setVisible(true);
					Player_U.att += 5;
					ATT = Player_U.att + "";
					lb7.setText(ATT);
					Player_U.L_Point -= 1;
					L_point = Player_U.L_Point + "";
					lb11.setText(L_point);
				}
				else if(Player_U.L_Point != 0)
				{
					Player_U.att += 5;
					ATT = Player_U.att + "";
					lb7.setText(ATT);
					Player_U.L_Point -= 1;
					L_point = Player_U.L_Point + "";
					lb11.setText(L_point);
				}
				
				else if(Player_U.L_Point == 0)
				{
					b4.setVisible(true);
				}
				
				else
				{
					b4.setVisible(false);
				}
				
			}
		});
		
		JButton b3 = new JButton("+3DEF(D)");
		b3.setBounds(290, 400, 100, 30);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Player_U.L_Point == 1)
				{
					b4.setVisible(true);
					Player_U.def += 3;
					DEF = Player_U.def + "";
					lb9.setText(DEF);
					Player_U.L_Point -= 1;
					L_point = Player_U.L_Point + "";
					lb11.setText(L_point);
				}
				else if(Player_U.L_Point != 0)
				{
					Player_U.def += 3;
					DEF = Player_U.def + "";
					lb9.setText(DEF);
					Player_U.L_Point -= 1;
					L_point = Player_U.L_Point + "";
					lb11.setText(L_point);
				}
				else if(Player_U.L_Point == 0)
				{
					b4.setVisible(true);
				}
				else
				{
					b4.setVisible(false);
				}
			}
		});
		
		b5.setBounds(390, 400, 100, 30);
		b5.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Player_U.L_Point == 1)
				{
					b4.setVisible(true);
					Player_U.acc += 3;
					ACC = Player_U.acc + "%";
					lb13.setText(ACC);
					Player_U.L_Point -= 1;
					L_point = Player_U.L_Point + "";
					lb11.setText(L_point);
				}
				else if(Player_U.L_Point != 0)
				{
					Player_U.acc += 3;
					ACC = Player_U.acc + "%";
					lb13.setText(ACC);
					Player_U.L_Point -= 1;
					L_point = Player_U.L_Point + "";
					lb11.setText(L_point);
				}
				
				else if(Player_U.L_Point == 0)
				{
					b4.setVisible(true);
				}
				
				else
				{
					b4.setVisible(false);
				}
			
				if(Player_U.acc >= 85)
				{
					b5.setVisible(false);
				}
			}
		});
		
		if(Player_U.L_Point == 0)
		{
			b4.setVisible(true);
		}
		else
		{
			b4.setVisible(false);
		}
		
		f1.addKeyListener(new KeyAdapter() 
		{
            @Override
            public void keyPressed(KeyEvent e) 
            {
                if (e.getKeyChar() == 'H' || e.getKeyChar() == 'h') 
                {
                    b1.doClick();
                }
                if (e.getKeyChar() == 'T' || e.getKeyChar() == 't')
                {
                	b2.doClick();
                }
                if (e.getKeyChar() == 'D' || e.getKeyChar() == 'd')
                {
                	b3.doClick();
                }
                if (e.getKeyChar() == 'G' || e.getKeyChar() == 'g')
                {
                	if(Player_U.L_Point == 0)
                	{
                		b4.doClick();
                	}
                }
                if (e.getKeyChar() == 'C' || e.getKeyChar() == 'c')
                {
                	if(Player_U.acc < 85)
                	{
                		b5.doClick();
                	}
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
		f1.add(lb9);
		f1.add(lb10);
		f1.add(lb11);
		f1.add(lb12);
		f1.add(lb13);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(b4);
		f1.add(b5);
		f1.setTitle("RPG_GAME");    //창 이름
		f1.setSize(600, 600);		//창 크기
		f1.setLayout(null);			//레이아웃
		f1.setVisible(true);		//출력
		f1.setFocusable(true);
	}
}