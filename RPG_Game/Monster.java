package RPG_Game;

public class Monster{
	class Slime extends Creature
	{
		public Slime () {
			name = "Slime";
			hp = 40 + (Player_U.lev * 5);
			att = 3 + (Player_U.lev * 2);
			def = 1 + (Player_U.lev * 1);
			exp = 10 - (Player_U.lev / 15);
			isdead_C = false;
	}}
		
	class Orc extends Creature
	{
		public Orc (){
			name = "Orc";
			hp = 55 + (Player_U.lev * 8);
			att = 5 + (Player_U.lev * 3);
			def = 1 + (Player_U.lev * 2);
			exp = 20 - (Player_U.lev / 15);
			isdead_C = false;
	}}
	
	class Skeleton extends Creature
	{
		public Skeleton (){
			name = "Skeleton";
			hp = 70 + (Player_U.lev * 13);
			att = 8 + (Player_U.lev * 4);
			def = 1 + (Player_U.lev * 3);
			exp = 30 - (Player_U.lev / 10);
			isdead_C = false;
	}}
	
	class Zombie extends Creature
	{
		public Zombie() {
			name = "Zombie";
			hp = 85 + (Player_U.lev * 16);
			att = 11 + (Player_U.lev * 5);
			def = 1 + (Player_U.lev * 4);
			exp = 40 - (Player_U.lev / 10);	
			isdead_C = false;
	}}
	
	class Big_Slime extends Creature
	{
		public Big_Slime() {  //Boss
			name = "The Big Slime";
			hp = 100 + (Player_U.lev * 20);
			att = 13 + (Player_U.lev * 7);
			def = 2 + (Player_U.lev * 5);
			exp = 50 + (Player_U.lev * 3);
			isdead_C = false;
			
	}}
	
	class Demon extends Creature
	{
		public Demon() { //Boss
			name = "The Demon";
			hp = 150 + (Player_U.lev * 25);
			att = 15 + (Player_U.lev * 10);
			def = 3 + (Player_U.lev * 6);
			exp = 70 + (Player_U.lev * 3);
			isdead_C = false;
	}} 
	
	class Shogun extends Creature
	{
		public Shogun() {  //Boss
			name = "The Shogun";
			hp = 200 + (Player_U.lev * 30);
			att = 17 + (Player_U.lev * 13);
			def = 4 + (Player_U.lev * 7);
			exp = 90 + (Player_U.lev * 3);
			isdead_C = false;
	}}
	
	class Terminator extends Creature
	{
		public Terminator() {
			name = "The Terminator";   //boss
			hp = 250 + (Player_U.lev * 40);
			att = 19 + (Player_U.lev * 20);
			def = 5 + (Player_U.lev * 10);
			exp = 150 + (Player_U.lev * 4);
			isdead_C = false;
	}}
}