package RPG_Game;

public class Player_U {
	static int hp = 100;
	static int max_hp = 100;
	static int att = 15;
	static int def = 2;
	static int exp = 0;
	static int lev = 1;
	static String name;
	static int L_Point = 0;
	static int acc = 55;
	static boolean isdead_P = false;
	void OnAttacked_P(int att)
	{
		if(att > def)
		{
			hp -= att - def;
		}
	}
	
	void Level_Up()
	{
		if(exp >= 100)
		{
			exp -= 100;
			lev++;
			L_Point+=5;
		}
	}
	
	void IsDead_P() 
	{
		if(hp <= 0)
		{
			isdead_P = true;
		}
		else 
		{
			isdead_P = false;
		}
	}	
}