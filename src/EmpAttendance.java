
public class EmpAttendance {

	public void Attendance() {
		int Is_Full_Time = 1;
				int empCheck = (int) Math.floor(Math.random() * 10)% 2;
				if(empCheck == Is_Full_Time)
				System.out.println("Employee is Present");
				else
					System.out.println("Employee is Absent");
	}

}
