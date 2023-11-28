package RPG_Game;

public class Creature
{	
	static int hp;
	static int att;
	static int def;
	static int exp;
	static String name;
	static boolean isdead_C = false;
	
	void OnAttacked_C(int att)
	{
		hp -= att - def;
	}
	
	void IsDead_C() 
	{
		if(hp <= 0)
		{
			isdead_C = true;
		}
		else 
		{
			isdead_C = false;
		}
	}
}