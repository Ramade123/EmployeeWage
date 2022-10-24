import java.util.Scanner;

public class Main
{
	public static void display() {
		System.out.println("\nWelcome to EmployeeWage"); 
		System.out.println("1.EmpAttendance\n2.Emp Wage\n3.PartTime Wage\n4.Employee Wage using switch case\n5.Employee wage for month\n6.Employee Wage Till100 Hrs");
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
		case 3:PartTime Part=new PartTime();
		Part.PartTimeWage();
		display();
			break;
		case 4:EmployeeWage EmpUC4=new EmployeeWage();
		EmpUC4.EmpWage();
		break;
		case 5:EmpWageForMonth UC5=new EmpWageForMonth();
		UC5.WageForMonth();
			break;
		case 6:EmpWageTill100Hrs UC6 = new EmpWageTill100Hrs();
		UC6.EmpWage();
			break;
		}
	}            

	public static void main(String[] args) {
		display();
	}

}
