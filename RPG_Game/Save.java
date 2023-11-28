package RPG_Game;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Save{
	static boolean issave = true;
	public Save() {
	try {
		String filePath = "./save.txt";
	
		File file = new File(filePath);
	
		if(!file.exists())
		{
			file.createNewFile();
		}
	
		FileWriter fw = new FileWriter(file);
		BufferedWriter writer = new BufferedWriter(fw);
	
		writer.write(Player_U.hp + "\n");
		writer.write(Player_U.max_hp + "\n");
		writer.write(Player_U.att + "\n");
		writer.write(Player_U.def + "\n");
		writer.write(Player_U.exp + "\n");
		writer.write(Player_U.lev + "\n");
		writer.write(Player_U.name + "\n");
		writer.write(Player_U.L_Point + "\n");
		writer.write(Player_U.acc + "\n");
		writer.write(Player_Stat.isfirst + "\n");
	
		writer.close();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	return;
}}