import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		int currentLegnth = 5;
		String name = "???";
		Scanner input = new Scanner(System.in);
		int choice = 7;
		Course course1 = new Course(currentLegnth);
		while (choice != 0) {
			System.out.println("1. to add students");
			System.out.println("0. to quit");
			System.out.println("2. to clear a student");
			System.out.println("4. to print the list");
			choice = input.nextInt();
			if (choice == 1) {
				System.out.println("please enter the name of the student");
				String[] tempList;
				name = input.next();
				course1.addStudent(name);

				if (course1.addStudent(name) == false) {
					currentLegnth += 5;
					Course copyCourse = new Course(currentLegnth);
					tempList = course1.getStudents();
					for (int i = 0; i < tempList.length; i++) {
						copyCourse.addStudent(tempList[i]);
					}
					course1 = copyCourse;
				}
			}
			if (choice == 2) {
				System.out.print("please enter the name");
				name = input.next();
				course1.dropStudent(name);
			}
			if (choice == 4) {
				course1.printStuff();

			}

		}
	}
}
