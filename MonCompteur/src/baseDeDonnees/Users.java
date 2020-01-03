package baseDeDonnees;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Users {
	
	String firstName;
	String lastName;
	String userName = "pass";
	String password;
	String mail;
	int goal;
	
	File file = new File("C://Été 2019/lessons/Compteur/TheUsers.txt"); // Noublie pas de le creee dans  le main aussi
	File file1 = new File("C://Été 2019/lessons/Compteur/"+userName+".txt");
	
	public Users(String firstName, String lastName, String userName, String password, String mail, int goal)
	{
		this.firstName = firstName;
		this.userName = userName;
		this.lastName = lastName;
		this.password = password;
		this.mail = mail;
		this.goal = goal;
		
		if(!file.exists())
		{
			try {
				file.createNewFile();
			} catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
				
			try 
			{
				FileWriter writer = new FileWriter(file, true);
				BufferedWriter bw = new BufferedWriter(writer);	
				bw.newLine();
				bw.write("User information");
				bw.newLine();
				bw.write(firstName);
				bw.newLine();
				bw.write(lastName);
				bw.newLine();
				bw.write(userName);
				bw.newLine();
				bw.write(password);
				bw.newLine();
				bw.write(mail);
				bw.newLine();
				bw.write("===============");
				bw.close();
				writer.close();
				
				File file1 = new File("C://Été 2019/lessons/Compteur/"+userName+".txt");
				
				if(!file1.exists())
				{
					try {
						file.createNewFile();
					} catch (IOException e) 
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				}
						
					try 
					{
						FileWriter writer1 = new FileWriter(file1, true);
						BufferedWriter bw1 = new BufferedWriter(writer1);	
						bw1.write(firstName);
						bw1.newLine();
						bw1.write(lastName);
						bw1.newLine();
						bw1.write(userName);
						bw1.newLine();
						bw1.write(password);
						bw1.newLine();
						bw1.write(mail);
						bw1.newLine();
						bw1.write(""+goal);
						bw1.newLine();
						bw1.write(""+0);
						bw1.newLine();
						bw1.close();
						writer1.close();
						
				   }catch(IOException b) {
						b.printStackTrace();
					}
				
		   }catch(IOException b) {
				b.printStackTrace();
			}
	
	}
	
	
	public String getFirstName()
	{
		try 
		{
			RandomAccessFile ran= new RandomAccessFile(file1,"r");
			ran.seek(1);
			return ran.readLine();
		}catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public String getLastName()
	{
		try 
		{
			RandomAccessFile ran= new RandomAccessFile(file1,"r");
			ran.seek(2);
			return ran.readLine();
		}catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	
	public String getUserName()
	{
		try 
		{
			RandomAccessFile ran= new RandomAccessFile(file1,"r");
			ran.seek(3);
			return ran.readLine();
		}catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public String getPassword()
	{
		try 
		{
			RandomAccessFile ran= new RandomAccessFile(file1,"r");
			ran.seek(4);
			return ran.readLine();
		}catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public String getMail()
	{
		try 
		{
			RandomAccessFile ran= new RandomAccessFile(file1,"r");
			ran.seek(5);
			return ran.readLine();
		}catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	static long getUserNumber()
	{	
		try 
		{
			File file3 = new File("C://Été 2019/lessons/Compteur/TheUsers.txt");
			int compteur = 0;
			//RandomAccessFile ran= new RandomAccessFile(file3,"r"); I don't know why I did this
			//System.out.print(ran.length());
			//return ran.length() / 7;
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file3), "UTF-8"));
			String line = reader.readLine();
			while(line != null)
			{
				compteur++;
				line = reader.readLine();
			}
			return (compteur / 7);
		}catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public int getGoal()
	{	
		try 
		{
			RandomAccessFile ran= new RandomAccessFile(file1,"r");
			ran.seek(6);
			return Integer.parseInt(ran.readLine());
		}catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	


	public void setFirstName(String myName)
	{
		firstName = myName;
	}
	
	
	public void setMail(String myMail)
	{
		mail = myMail;
	}	
	
	public void setPassword(String myPassword)
	{
		password = myPassword;
	}	
	
	public void setLastame(String myName)
	{
		lastName = myName;
	}
	
	public void setUserName(String myName)
	{
		userName = myName;
	}

}

