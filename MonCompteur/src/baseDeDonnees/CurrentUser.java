package baseDeDonnees;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class CurrentUser {
	
	String password;
	String userName;
	public CurrentUser(String userName, String password)
	{
		this.password = password;
		this.userName = userName;
		File file1 = new File("C://Été 2019/lessons/Compteur/"+userName+".txt");
		
	}
	
	

	
	public int getGoal()
	{	
		File file1 = new File("C://Été 2019/lessons/Compteur/"+userName+".txt");
		try 
		{
			BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1), "UTF-8"));
			String line = reader1.readLine();
			for( int a=1;a < 6; a++)
			{
				line = reader1.readLine();
			}
			return Integer.parseInt(line);
		}catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	
     }
	
	public int getStatut()
	{	
		File file1 = new File("C://Été 2019/lessons/Compteur/"+userName+".txt");
		try 
		{

			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1), "UTF-8"));
			int compteur = 0;
			while (reader.readLine() != null)
			 compteur++;
			reader.close();
			BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1), "UTF-8"));
			String line = reader1.readLine();
			for( int a=1;a < compteur; a++)
			{
				line = reader1.readLine();
			}
			reader1.close();
			return Integer.parseInt(line);
		}catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return 0;
	}

}

