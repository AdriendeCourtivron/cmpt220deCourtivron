
public class Manager extends Employee
{

	 
	 Manager(String name, double age, double hourRate)
	 {
		 this.name = name;
		 this.age = age;
		 this.hourRate = hourRate;
	 }


	public double salary(double hours) 
	{
		double salary = hourRate * hours;
				return salary;
	}

}
