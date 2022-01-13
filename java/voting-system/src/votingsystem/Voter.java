package votingsystem;

public class Voter extends Person
{
	//Variables
	private int voterID;
	private boolean voted;
	
	//Defined Constructor
	Voter( int age, char gender, String firstName, String lastName, String politicalParty) 
	{
		super(age, gender, firstName, lastName, politicalParty);
	}
	
	//Getter method for voterID
	public int getVoterID() 
	{
		return voterID;
	}
	
	//Getter method for voted
	public boolean hasVoted() 
	{
		return voted;
	}
	
	//Double Check
	public void voted()
	{
		voted = true;
		return;
	}
	
	public String getFullName()
	{
		return firstName + " " + lastName;
	}
}