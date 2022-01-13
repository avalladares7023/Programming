package votingsystem;

public class VotingMachine 
{
	//Variables
	public Candidate[] candidate;
		
	//Defined Constructor
	public VotingMachine(Candidate candidates[])
	{
		this.candidate = candidates;
		//will set the passed properties to our defined variables
	}
		
	public void vote(Voter v, Candidate c)
	{
		if(!v.hasVoted())
		{
			c.incrementVoteCount();
			return;
		}
	}

	public void tally()
	{
		int winner = 0;
		for(int i = 0; i < candidate.length; i++)
		{
			System.out.println(candidate[i].getFullName() + " has " + candidate[i].getVoteCount() + " votes");
			if (winner < candidate[i].getVoteCount())
			{
				winner = candidate[i].getVoteCount();
			}
		}
		return; 
	}
}
