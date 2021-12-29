/*
 * This class runs an application that adds students to a student database.
 * 
 * My biggest mistake when doing this project before looking how Master Skills did it was that I tried
 * to make one student object represent all the students that would be in the database. 
 * 
 * The right way, shown below,is to make the student object represent one student, and to have an array that holds multiple students. 
 * 
 * Ayden Smith
 * December 29, 2021
 */
package studentdatabaseapp;

import java.util.Scanner;

public class DatabaseApp 
{

	public static void main(String[] args) 
	{
		
		// ** Problem here: I created an object named student that represents all students in the database. 
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("How many students are going to be added to the database?: ");
//		
//		int numOfStudents = input.nextInt();
//		
//		Student first = new Student();
//		
//		first.enrollStudents(numOfStudents);
//		
//		first.getBalance();
		
		
		
		// ** Fix: Create a new student object for every student added to the database
		
//		Student stu1 = new Student();
//		
//		System.out.println(stu1.toString());
		

		// prompt user to input the number of students that will be added to the database
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many students are going to be added to the database?: ");
	
		int numOfStudents = input.nextInt();
		
		// Enter the number of students inputed from above into the database -- How do I use a for loop to create new student objects?
		// Create an array of students. Enroll each student. 
		
		Student[] students = new Student[numOfStudents];
		
		for(int i = 0; i < students.length; i++)
		{
			students[i] = new Student();
		}
			
		// Print out the status of each student in the database
		
		for(int j = 0; j < students.length; j++)
		{
			System.out.println(students[j].toString());
		}
	}

}
