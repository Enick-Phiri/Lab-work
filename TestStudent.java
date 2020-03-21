//import scanner
import java.util.Scanner;
//create class object
public class TestStudent{
	
	public static void main(String [] args){

		//create a scanner object
		Scanner input = new Scanner(System.in);
		//prompt the user to enter a student name
		System.out.println("Enter a student name: ");
		String name = input.nextLine();
		//prompt the user to enter student grades
		System.out.println("Enter 3 student grades: ");
		// creating an array for grades
	    double[]grades = new double[3];
	    for(int i = 0;i<grades.length;i++){
	    	grades[i] = input.nextDouble();

	    }
		//create Student object student1
		Student student1 = new Student();
		student1.setName(name);
		student1.setGrades(grades);
		student1.printStudentDetails();
	}
} 