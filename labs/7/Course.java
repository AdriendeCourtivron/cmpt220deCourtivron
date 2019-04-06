

public class Course {
	private String courseName;
	private String[] students;
	private int numberOfStudents;
	
	public Course (int length) 
	{
		courseName = "???";
		students = new String[length];
		numberOfStudents = 0;
		
	}
	
	public boolean addStudent(String newStudent)
	{
		boolean win = false;
		if (numberOfStudents < students.length)
		{
			students[numberOfStudents] = newStudent;
			numberOfStudents++;
			win = true;
		}
		return (win);
	}
	public void increaseSize()
	{ 
		numberOfStudents += 5;
	}
	

	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}
	public void clear()
	{
		for (int i = 0; i < students.length; i++)
		{
			students[i] = null;
		}
	}
	

	public String getCourseName() 
	{
		return courseName;
	}

	public String[] getStudents() 
	{
		return students;
	}
	

	public int getNumberOfStudents() 
	{
		return numberOfStudents;
	}
	
	public void dropStudent(String student) {
		
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				for (int j=i+1; j < numberOfStudents; j++)
					students[j - 1] = students[j];
				numberOfStudents--;
				return;
			}
		}
	}
	public void printStuff()
	{
		System.out.print("There ar");
	if (numberOfStudents > 0) 
	{
		for (int i = 0; i < students.length; i++)
			{
				System.out.println(students[i] );
			}
	} 
	else System.out.println("There are no students in this course: " + courseName + ".");
 }
}