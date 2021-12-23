/*
 * This class keeps tract of a student's id, name, grade, fees paid, and fees total.
 * 
 * Ayden Smith
 * December 22, 2021
 */

package schoolmanagement;

public class Student 
{
	private int id;
	private String firstName;
	private String lastName;
	private int grade;
	private double feesPaid;
	private double feesTotal;
	
	/**
	 * Initialize fields.
	 * The total cost to go to the school is $30,000
	 * Each student starts with no fees paid
	 * 
	 * @param id id for the student - unique
	 * @param firstName student's first name
	 * @param lastName student's last name 
	 * @param grade student's grade year
	 */
	public Student(int id, String firstName, String lastName, int grade)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		
		this.feesTotal = 30000;
		this.feesPaid = 0;
	}
	
	// Not going to alter student's name and id. Also not going to alter the total cost of going to the school.
	
	/**
	 * Update the student's grade
	 * 
	 * @param grade new grade of the student
	 */
	public void setGrade(int newGrade)
	{
		this.grade = newGrade;
	}
	
	/**
	 * Update the amount of money the student has paid, increase the fees paid to the fees already paid (if any)
	 * @param fees increase the amount of money the student has paid
	 */
	public void setFeesPaid(double fees)
	{
		this.feesPaid += fees;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getFeesTotal() {
		return feesTotal;
	}

	public double getFeesPaid() {
		return feesPaid;
	}
	
	

}
