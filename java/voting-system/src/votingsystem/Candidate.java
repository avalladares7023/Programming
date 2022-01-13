package votingsystem;

public class Candidate extends Person
{
	//Variables
	private int voteCount = 0; //Defaults to 0
		
	//Defined Constructor
	Candidate(int age, char gender, String firstName, String lastName, String politicalParty) 
	{
		super(age, gender, firstName, lastName, politicalParty);
	}
		
	//Getter method for voteCount
	public int getVoteCount() 
	{
		return voteCount;
	}
		
	//Double Check
	public void incrementVoteCount()
	{
		voteCount++;
		return;
	}
		
	public String getFullName()
	{
		if(politicalParty == "Democrat")
		{
			return firstName + " " + lastName + " - D";
		}
		if(politicalParty == "Republican")
		{
			return firstName + " " + lastName + " - R";
		}
		if(politicalParty == "Non-Affiliate")
		{
			return firstName + " " + lastName + " - NA";
		}
		else
		{
			return firstName + " " + lastName;
		}
	}
}
