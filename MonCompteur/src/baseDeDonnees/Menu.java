package baseDeDonnees;


/* Program summer 2019
   
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) throws IOException
	{
		int choice = 0;
		
		do {
			
		
		File file = new File("C://Été 2019/lessons/Compteur/TheUsers.txt"); // Noublie pas de le creee dans  le main aussi
		String userName = "";
		String password = "";
		String firstName = "";
		String lastName = "";
		String mail;
		int goal;
		int choice1;
		int hours;
		int hisHours;
		String myPassword =  "toorboot";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t\t\t\t\tWelcome guys !!!");
		System.out.println("Mske your choice");
		System.out.println("\t\t\t1-Sign in\t\t\t\t2-Create an account\t\t\t\t 3- Leave");
		System.out.print("Your choice : ");
		choice = scan.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.print("Users : ");
			userName = scan.next();
			System.out.print("Password : ");
			password = scan.next();
			File file1 = new File("C://Été 2019/lessons/Compteur/"+userName+".txt");
			
			try 
			{
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1), "UTF-8"));
				String line = reader.readLine();
			while(line != null)
			{
				if(line.equals(userName))
				{
					line = reader.readLine();
					if(line.equals(password))
						break;
				}	
				line = reader.readLine();
			}
			if(line == null)
			{
				System.out.println("Users or password not correct ");
				break;
			}
			else
			{
				CurrentUser myUser = new CurrentUser(userName, password);
				if(!file1.exists())
				{
					try {
						file1.createNewFile();
					} catch (IOException e) 
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
				System.out.println("your goal : "+myUser.getGoal()+"Your current hours: "+myUser.getStatut());
				System.out.println("\t\t\t1-add time \t\t\t\t2-Subtract time \t\t\t\t3- leave");
				System.out.print("Your choice : ");
				choice1 = scan.nextInt();
				switch(choice1)
				{
				case 1:
				{
					FileWriter writer = new FileWriter(file1, true);
					BufferedWriter bw = new BufferedWriter(writer);
					hisHours =  myUser.getStatut();	
					System.out.print("How many hours do you want to had  : ");
					hours = scan.nextInt();
					int somme = hours + hisHours;
					String mysomme = Integer.toString(somme);
					bw.write(mysomme);
					bw.newLine();
					System.out.print(hours+" hours had been had to your account: ");
					bw.close();
					break;
				}
				case 2:
				{	
					FileWriter writer = new FileWriter(file1, true);
					BufferedWriter bw = new BufferedWriter(writer);
					System.out.print("How many hours do you want to substract  : ");
					hours = scan.nextInt();
					hisHours =  myUser.getStatut();
					int substraction =  hisHours - hours ;
					String mySub = Integer.toString(substraction);
					bw.write(mySub);
					bw.newLine();
					System.out.print(hours+" hours had been substract from your account: ");
					bw.close();
					break;
				}
				
				case 3:
					break;
				}
			}
			}catch(IOException b) {
			b.printStackTrace();
			
			
		}
			break;
		}
			
		case 2 :
		{
			Boolean validate = false;
			System.out.print("First name : ");
			firstName = scan.nextLine();
			firstName = scan.nextLine();
			System.out.print("Last name : ");
			lastName = scan.nextLine();
			do {
			System.out.print("Users name : ");
			userName = scan.nextLine();
            File file2 = new File("C://Été 2019/lessons/Compteur/TheUsers.txt");
			
			try 
			{
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), "UTF-8"));
				String line = reader.readLine();
			while(line != null)
			{
				if(line.equals(userName))
					break;	
				line = reader.readLine();
			}
			if(line == null)
			{				
				System.out.println("   ---...---Users name Valide ");
				validate = true;
			}
			else
			{
				System.out.println("    ---...---User name alredy taken, Please choose another one");
			}
			}catch(IOException b) {
				b.printStackTrace();
			}
			}while(validate == false);
			System.out.print("Password : ");
			password = scan.nextLine();
			System.out.print("Mail : ");
			mail = scan.nextLine();
			System.out.print("Hours' Goal : ");
			goal = scan.nextInt();
			
			Users userAccount = new Users(firstName ,lastName ,userName ,password ,mail ,goal );
			
			System.out.println("You'll receive a confimation mail enjoy the apps!!!!!!!");
			
			
		}
		
		case 3:
			break;
		case 12520:
			String first = "";
			String second = "";
			int number = 0;
			String res = "";
			System.out.println("Welcome in the hide apps ");
			System.out.print(">>> ");
			first = scan.nextLine();
			first = scan.nextLine();
			System.out.println();
			System.out.print(">>> ");
			second = scan.nextLine();
			System.out.println();
			System.out.print(">>>");
			number = scan.nextInt();
			res = myPassword+Users.getUserNumber();
			if((first+second+number).equals(res))
				System.out.print(">>> Success ");
			else
				System.out.print(">>> failed ");
			
			break;
		
		}
		
		
		
		}while(choice != 3);
		
		
	}

}

