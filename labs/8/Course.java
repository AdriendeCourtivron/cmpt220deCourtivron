import java.util.ArrayList;	
public class Course
{
	private String courseName;
	private ArrayList students = new ArrayList();
	private int numberOfStudents;
	
	public Course(String courseName)
	{
		this.courseName = courseName;
	}
	
	// JA: You should not change the contract of the method
	public ArrayList getStudents() 
	{
		return students;
	}


	public void addStudent(String student)
	{
		students.add(student);
	}

	public String getCourseName() 
	{
		return courseName;
	}

	public int getNumberOfStudents() 
	{
		return numberOfStudents;
	}
	
	public void dropStudent(String student) 
	{
		students.remove(student);
	}
}
