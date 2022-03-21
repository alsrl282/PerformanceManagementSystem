import java.util.Scanner;

public class PerformanceManager {
	public static void main(String[] agrs) {
		int num =0;
		Scanner input = new Scanner(System.in);

		while(num !=5){
			System.out.println("1. Add Students");
			System.out.println("2. Delete Students");
			System.out.println("3. Edit Students");
			System.out.println("4. View Students");
			System.out.println("0. Exit");
			System.out.println("Select one number between 0-4");
			num= input.nextInt();
			if (num ==1) {
				addStudent();
			}
			else if (num ==2) {
				deleteStudent();
			}
			else if (num ==3) {
				editStudent();
			}
			else if (num ==4) {
				viewStudent();
			}
			else if (num ==0) {
				System.exit(0);
			}
		}
	}
	private static void addStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentId = input.nextInt();
		System.out.print("Student name");
		String studentName = input.next();
		System.out.print("Email address:");
		String studentEmail = input.next();
		System.out.println(studentEmail);
	}

	private static void deleteStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentId = input.nextInt();
	}

	private static void editStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentId = input.nextInt();
	}

	private static void viewStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentId = input.nextInt();
	}

}







