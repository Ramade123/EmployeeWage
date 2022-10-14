import java.util.Scanner;

public class Main {
	public static void display() {
		System.out.println("\nWelcome to EmployeeWage"); 
		System.out.println("1.EmpAttendance\n2.Emp Wage");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1:EmpAttendance Emp=new EmpAttendance();
		Emp.Attendance();
		display();
			break;
		case 2:EmpWage wage=new EmpWage();
		wage.DailyWage();
		display();
			break;
		}
	}            

	public static void main(String[] args) {
		display();
	}

}
