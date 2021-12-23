/*
 * This class is responsible for keeping track of the teacher's id, name, and salary.
 * 
 * Ayden Smith
 * December 22, 2021
 */
package schoolmanagement;

public class Teacher 
{
	private int id;
	private String firstName;
	private String lastName;
	private double salary;
	
	/**
	 * Initialize fields. Set parameters that are unique for each teacher. 
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param salary
	 */
	public Teacher(int id, String firstName, String lastName, double salary)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		
	}
	
	// Don't need to change the teacher's id and name
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public double getSalary()
	{
		return salary;
	}


}
