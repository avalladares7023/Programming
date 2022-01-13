package votingsystem;

public abstract class Person 
{
	//Private Variables
	private int age;
	private	char gender;
	//Protected Variables
	protected
	String firstName;
	String lastName;
	String politicalParty;
		
	Person(int age, char gender, String firstName, String lastName, String politicalParty)
	{
		age = 18;
		gender = 'M';
		firstName = "John";
		lastName = "Doe";
		politicalParty = "Democrat";
	}
		
	public int getAge() 
	{
		return age;
	}
	
	public char getGender() 
	{
		return gender;
	}
		
	public abstract String getFullName();

}
