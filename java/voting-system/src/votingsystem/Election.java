package votingsystem;

public class Election 
{
	public static void main(String args[])
	{
		Candidate first = new Candidate(45, 'M', "Dwayne", "Johnson", "Non-Affiliate");
		Candidate second = new Candidate(38, 'F', "Michelle", "Obama", "Democrat");
		Candidate third = new Candidate(22, 'F', "Julianne", "Torres", "Republican");
		Candidate candidate[] = {first, second, third};
		VotingMachine elect = new VotingMachine(candidate);
		Voter one = new Voter(18, 'F', "Aimee", "Valladares", "Democrat");
		Voter two = new Voter( 19, 'M', "Alex", "Valladares", "Non-Affiliate");
		Voter three = new Voter(20, 'F', "Fabiola", "Rosado", "Republican");
		Voter four = new Voter(31, 'M', "Rene", "Valladares", "Democrat");
		Voter five = new Voter(44, 'F', "Amy", "Vez", "Non-Affiliate");
		Voter six = new Voter(70, 'M', "Bob", "Dale", "Republican");
		
		elect.vote(one, first);
		elect.vote(two, second);
		elect.vote(three, first);
		elect.vote(four, first);
		elect.vote(five, third);
		elect.vote(six, third);
		
		elect.tally();
	}
}
