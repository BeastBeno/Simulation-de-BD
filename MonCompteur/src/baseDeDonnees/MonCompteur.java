package baseDeDonnees;

//KingBeno creations


public class MonCompteur {
	
	int objectif = 10000;

	public MonCompteur(int objectif)
	{
		this.objectif = objectif;
	}
	
	public int getCompteur()
	{
		return objectif;
	}
	
	public void addHours(int NumbersHours)
	{
		objectif = this.getCompteur() + NumbersHours;
	}
	
	public void substactHours(int NumbersHours)
	{
		objectif = this.getCompteur() - NumbersHours;
	}
	
}

