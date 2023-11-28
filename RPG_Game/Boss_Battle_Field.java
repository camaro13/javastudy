package RPG_Game;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;

import javax.swing.*;

public class Boss_Battle_Field extends JFrame{
	boolean ishit = false;
	int ran;
	int first_heal = 0;
	String HP;
	String ATT;
	String DEF;
	String Name;
	String L_point;
	String ACC;
	String EXP;
	String LEV;
	String HP_M;
	String ATT_M;
	String DEF_M;
	String Name_M;
	
	public void percent() 
	{
		Random rand = new Random();
		int r = rand.nextInt(99);
		if (r > Player_U.acc)
		{
			ishit = false;
		}
		else if (r < Player_U.acc)
		{
			ishit = true;
		}
	}
	
	public void Get_Boss_Monst()
	{
		Monster Mons = new Monster();
		if(Player_U.lev <= 20)
		{
			Monster.Big_Slime big_slime = Mons.new Big_Slime();
			getStat_M();
		}
		else if(Player_U.lev > 20 && Player_U.lev <= 45)
		{
			Monster.Demon demon = Mons.new Demon();
			getStat_M();
		}
		else if(Player_U.lev > 45 && Player_U.lev <= 70)
		{
			Monster.Shogun shogun = Mons.new Shogun();
			getStat_M();
		}
		else if(Player_U.lev > 70)
		{
			Monster.Terminator terminator = Mons.new Terminator();
			getStat_M();
		}
	}
	
	public void getStat_P()
	{
		Name = Player_U.name;
		HP = Player_U.hp + "";
		ATT = Player_U.att + "";
		DEF = Player_U.def + "";
		L_point = Player_U.L_Point + "";
		ACC = Player_U.acc + "%";
		EXP = Player_U.exp + "%";	
		LEV = Player_U.lev + "";
	}
	
	public void getStat_M()
	{
		Name_M = Creature.name;
		HP_M = Creature.hp + "";
		ATT_M = Creature.att + "";
		DEF_M = Creature.def + "";
	}
	
	public Boss_Battle_Field()
	{
		if(first_heal == 0)
		{
			first_heal++;
		}
		
		JFrame f1 = new JFrame();  //jFrame선언 = f1
	
		Player_U P_U = new Player_U();
		Creature C_T = new Creature();
		
		getStat_P();
		Get_Boss_Monst();
		getStat_M();
		
		new Save();
		
		JLabel lb1 = new JLabel("Fight With Enemy");
		Font font = new Font("Serif", Font.BOLD, 30);
		lb1.setFont(font);
		lb1.setBounds(180, 10, 400, 40);
		
		JLabel lb2 = new JLabel("NAME : ");
		Font font2 = new Font("Serif", Font.BOLD, 20);
		lb2.setFont(font2);
		lb2.setBounds(60, 150, 100, 30);
		
		JLabel lb3 = new JLabel();
		lb3.setFont(font2);
		lb3.setBounds(140, 150, 400, 30);
		lb3.setText(Name);
		
		JLabel lb4 = new JLabel("HP : ");
		lb4.setFont(font2);
		lb4.setBounds(60, 175, 100, 30);
		
		JLabel lb5 = new JLabel();
		lb5.setFont(font2);
		lb5.setBounds(105, 175, 400, 30);
		lb5.setText(HP);

		JLabel lb6 = new JLabel("ATT : ");
		lb6.setFont(font2);
		lb6.setBounds(60, 200, 100, 30);
		
		JLabel lb7 = new JLabel();
		lb7.setFont(font2);
		lb7.setBounds(120, 200, 400, 30);
		lb7.setText(ATT);
		
		JLabel lb8 = new JLabel("DEF : ");
		lb8.setFont(font2);
		lb8.setBounds(60, 225, 100, 30);
		
		JLabel lb9 = new JLabel();
		lb9.setFont(font2);
		lb9.setBounds(120, 225, 400, 30);
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
		lb12.setBounds(60, 250, 100, 30);
		
		JLabel lb13 = new JLabel();
		lb13.setFont(font2);
		lb13.setBounds(120, 250, 400, 30);
		lb13.setText(ACC);
		
		JLabel lb14 = new JLabel("EXP : ");
		lb14.setFont(font2);
		lb14.setBounds(60, 275, 100, 30);
		
		JLabel lb15 = new JLabel();
		lb15.setFont(font2);
		lb15.setBounds(120, 275, 400, 30);
		lb15.setText(EXP);
		
		JLabel lb25 = new JLabel("LEVEL : ");
		lb25.setFont(font2);
		lb25.setBounds(60, 300, 100, 30);
		
		JLabel lb26 = new JLabel();
		lb26.setFont(font2);
		lb26.setBounds(145, 300, 400, 30);
		lb26.setText(LEV);
		
		JLabel lb16 = new JLabel("NAME : "); //몬스터 정보 출력
		lb16.setFont(font2);
		lb16.setBounds(350, 150, 100, 30);
		
		JLabel lb17 = new JLabel();
		lb17.setFont(font2);
		lb17.setBounds(430, 150, 400, 30);
		lb17.setText(Name_M);
		
		JLabel lb18 = new JLabel("HP : ");
		lb18.setFont(font2);
		lb18.setBounds(350, 175, 100, 30);
		
		JLabel lb19 = new JLabel();
		lb19.setFont(font2);
		lb19.setBounds(395, 175, 400, 30);
		lb19.setText(HP_M);

		JLabel lb20 = new JLabel("ATT : ");
		lb20.setFont(font2);
		lb20.setBounds(350, 200, 100, 30);
		
		JLabel lb21 = new JLabel();
		lb21.setFont(font2);
		lb21.setBounds(410, 200, 400, 30);
		lb21.setText(ATT_M);
		
		JLabel lb22 = new JLabel("DEF : ");
		lb22.setFont(font2);
		lb22.setBounds(350, 225, 100, 30);
		
		JLabel lb23 = new JLabel();
		lb23.setFont(font2);
		lb23.setBounds(410, 225, 400, 30);
		lb23.setText(DEF_M);
		
		JLabel lb24 = new JLabel("Monster Is Dead. Go to Next Stage");
		lb24.setFont(font2);
		lb24.setBounds(140, 325, 500, 30);
		lb24.setVisible(false);
		
		JLabel lb27 = new JLabel("Healing : ");
		lb27.setFont(font2);
		lb27.setBounds(385, 350, 200, 30);
		
		JLabel lb28 = new JLabel();
		lb28.setFont(font2);
		lb28.setBounds(465, 350, 400, 30);
		lb28.setText(first_heal + "");
		
		JButton b4 = new JButton("Go To Next Stage(G)");
		b4.setBounds(190, 470, 200, 30);
		b4.setVisible(false);
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Player_U.hp <= 0)
				{
					f1.dispose();
					new U_Die();
				}
				
				else
				{
					Player_U.hp = Player_U.max_hp;
					f1.setVisible(false);
					new Battle_Field();
				}
			}
		});
		
		JButton b1 = new JButton("Player Stat(P)");
		b1.setBounds(75, 400, 120, 30);
		if(Player_U.L_Point >= 1)
		{
			b1.setVisible(true);
		}
		else
		{
			b1.setVisible(false);
		}
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {				
				f1.dispose();
				new Player_Stat();
				
			}
		});
		
		JButton b2 = new JButton("Attack(A)");
		b2.setBounds(240, 400, 100, 30);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				getStat_P();
				getStat_M();
				P_U.IsDead_P();
				C_T.IsDead_C();
				percent();
				if(Player_U.isdead_P == false)
				{
					if(ishit == true)
					{
						C_T.OnAttacked_C(Player_U.att);
					}
					P_U.OnAttacked_P(Creature.att);
					P_U.IsDead_P();
					C_T.IsDead_C();
					if(Player_U.isdead_P == true)
					{
						f1.dispose();
						new U_Die();
					}
					if(Creature.isdead_C == true)
					{
						Player_U.exp += Creature.exp;
						P_U.Level_Up();
						lb24.setVisible(true); //죽었는지 보여주는 라벨 추가
						b2.setVisible(false);
						b4.setVisible(true);
					}
				}
				else
				{
					f1.dispose();
					new U_Die();
				}
				getStat_P();
				getStat_M();
				lb5.setText(HP);
				lb7.setText(ATT);
				lb9.setText(DEF);
				lb11.setText(L_point);
				lb13.setText(ACC);
				lb15.setText(EXP);
				lb17.setText(Name_M);
				lb19.setText(HP_M);
				lb21.setText(ATT_M);
				lb23.setText(DEF_M);
			}
		});
		
		JButton b3 = new JButton("+0~30HP");
		b3.setBounds(380, 400, 110, 30);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(first_heal == 1)
				{
					Random rand = new Random();
					int ra = rand.nextInt(30);
					Player_U.hp += ra;
					first_heal--;
					getStat_P();
					lb5.setText(HP);
					lb28.setText(first_heal + "");
				}
			}
		});
		
		JButton b5 = new JButton("Main Menu(M)");
		b5.setBounds(10, 15, 115, 30);
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				f1.dispose();
				new Main();
			}
		});
		
		f1.addKeyListener(new KeyAdapter() 
		{
            @Override
            public void keyPressed(KeyEvent e) 
            {
                if (e.getKeyChar() == 'P' || e.getKeyChar() == 'p') 
                {
                	if(Player_U.L_Point >= 1)
                	{
                		b1.doClick();
                	}
                }
                if (e.getKeyChar() == 'A' || e.getKeyChar() == 'a')
                {
                	if(Creature.isdead_C == false)
                	{
                		b2.doClick();
                	}
                }
                if (e.getKeyChar() == 'H' || e.getKeyChar() == 'h')
                {
                	b3.doClick();
                }
                if (e.getKeyChar() == 'G' || e.getKeyChar() == 'g')
                {
                	if(Creature.isdead_C == true)
                	{
                		b4.doClick();
                	}
                }
                if (e.getKeyChar() == 'M' || e.getKeyChar() == 'm')
                {
                	b5.doClick();
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
		f1.add(lb14);
		f1.add(lb15);
		f1.add(lb16);
		f1.add(lb17);
		f1.add(lb18);
		f1.add(lb19);
		f1.add(lb20);
		f1.add(lb21);
		f1.add(lb22);
		f1.add(lb23);
		f1.add(lb24);
		f1.add(lb25);
		f1.add(lb26);
		f1.add(lb27);
		f1.add(lb28);
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