/**
* import scanner.
*/
import java.util.Scanner;

//Creating the Student class.
public class Student{

	// The private instance variables
	private String name;
	private double [] grades;
	private int totalNumberOfStudents = 2;

/** Constructs a Student instance */
public Student(){
	this.name = name;
	this.grades = grades;
	this.totalNumberOfStudents = totalNumberOfStudents;

}

// Setters and Getters

/** Returns the name of this Student */
public String getName(){
	return name;
}

/** 
* Sets the name.
*/
// Method to update variable name
public void setName(String name){
	this.name = name;
}

// Returns the grades instance of this Student

public double[] getGrades(){
	return grades;
}

// method to update variable grade of the student
public void setGrades(double [] grades){
	this.grades = grades;
}
// Returns the totalNumberOfStudents
public int getNumberOfStudents(){
	return totalNumberOfStudents++;
}
// calculate grades average
public double getAverageGrade(){
	double sum = 0;
	for(int i = 0; i < grades.length; i++){
		sum += grades[i];

	}
	return sum/grades.length; //returns average
	}

	//method to display student's details
	public void printStudentDetails(){
		//print the students details on the console
		System.out.println("student name is "+this.name+ "," + " average grade is " 
			+getAverageGrade()+ " and the number of students are "+totalNumberOfStudents+".");
	}
}