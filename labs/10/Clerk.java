
public class Clerk  extends Employee
{
	 
	 Clerk(String name, double age, double hourRate)
	 {
		 this.name = name;
		 this.age = age;
		 this.hourRate = hourRate;
	 }

	@Override
	public double salary(double hours) 
	{
		double salary = hourRate * hours;
				return salary;
	}

}
