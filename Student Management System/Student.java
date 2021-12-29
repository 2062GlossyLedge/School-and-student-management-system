/*
 * This class represents a student that will be in the student database.
 * As shown in the constructor, each student has a name, id, and grade year. 
 * Each student can enroll in courses and each student must pay for each course that they enrolled in.
 * 
 * Ayden Smith
 * December 29, 2021
 */
package studentdatabaseapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student 
{
	//private double balance;
	private String name;
	private int grade;
	private String studentID;
	
	// Static variables are not unique to each object. Their values belong to the class--meaning the values can be seen by all objects. 
	private static int id = 1000;
	private static int costOfCourse = 600;
	
//	private String courses;
	private int tuitionCost;
	//private int costOfCourse = 600;
	

//	private List<String> ids;
//	private List<String> names;
//	private List<String> grades;
	private List<String> coursesEnrolled;
	
	// constructor : prompt user to enter name, year, number of courses they want to enroll in,
	// and balance due for each new student 
	
	public Student()
	{
//		ids = new ArrayList<String>();
//		grades = new ArrayList<String>();
//		names = new ArrayList<String>();
		coursesEnrolled = new ArrayList<String>();
//		
//		this.balance = 5000;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		this.name = input.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter grade year: ");
		this.grade = input.nextInt();
		
		setStudentID();
		
	
		//System.out.println("Name: " + name + " Grade: " + grade + " ID: " + studentID);
		
		System.out.println("How many courses is this student enrolling in?: ");
		int numOfCourses = input.nextInt();
		enrollInCourses(numOfCourses);
		
		System.out.print("Enter payment amount for tution cost: $");
		int amountPaid = input.nextInt();
		payTuition(amountPaid);
		
		
		
	}
	
//	// method to enroll students by entering in they name and grade. Method is also used for calling make id method for each student
//	
//	public void enrollStudents(int numOfStudents)
//	{
//		Scanner input = new Scanner(System.in);
//		
//		for(int i = 0; i < numOfStudents; i++)
//		{
//			System.out.println("What is the student's name?: ");
//			name = input.next();
//			names.add(name);
//			System.out.println("What grade will the student be in?: ");
//			grade = input.next();
//			grades.add(grade);
//			
//			makeID(grade);
//			
//			System.out.println("How many courses is this student enrolling in?: ");
//			int numOfCourses = input.nextInt();
//			enrollInCourses(numOfCourses);
//		}
//		
//		System.out.println(names);
//		System.out.println(grades);
//		System.out.println(ids);
//		System.out.println(coursesEnrolled);
//	}
//	
	// method to make an id for each student; each id starts with the student's grade
	
	private String setStudentID()
	{
//		String idNew = grade + "" + id;  
//		return idNew;
		
		// Each new id's ones digit will be 1 number higher than the previously made id 
		
		id++;
		
		this.studentID = grade + "" + id; 
		return studentID;
	}
//
//	public String makeID(String grade)
//	{
//		id = grade;
//		for(int i = 0; i < 4; i++)
//		{
//			int randomNum = (int) (Math.random() * 10) + 0;
//			String randomNumAsString = "" + randomNum;
//			id += randomNumAsString;
//		}
//		
//		return id;
//		
//		//ids.add(id);
//		
//	}
	
	
	// method to enroll student in as many courses as they choose and shows the cost of all courses they chose to enroll in
	
	public void enrollInCourses(int numOfCourses)
	{
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < numOfCourses; i++)
		{
			System.out.println("What course do you want enroll in (History 101, Mathematics 101, English 101, Chemistry 101, Computer Science 101): ");
			String chosenCourseToEnrollIn = input.nextLine();
			coursesEnrolled.add(chosenCourseToEnrollIn);
			tuitionCost += costOfCourse;
			
		}
		
		//System.out.println("Courses enrolled in: " + coursesEnrolled);
		System.out.println("Tuition Cost: $" + tuitionCost);
		
		
		
	}
	
	// method to view balance
	
	public void viewBalance()
	{
		System.out.println("Remaning tution cost: $" + tuitionCost);
	}
	
	// method to pay tuition cost
	
	public void payTuition(int amountPaid)
	{
		tuitionCost -= amountPaid;
		viewBalance();
		
		if (tuitionCost == 0)
			System.out.println("You have successfully paid for all your tuition. Thank You!");
	}
	
	
	// see status of a student - name, id, courses enrolled, and balance -- not sure how to do this with multiple students

	public String toString()
	{
		return "Name: " + name +
				"\nGrade Year: " + grade +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + coursesEnrolled +
				"\nBalance: $" + tuitionCost;
	}
}
