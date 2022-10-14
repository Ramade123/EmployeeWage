
public class PartTime {
	
	public void PartTimeWage() 
	{
		int Full_Time = 1;
		int Part_Time = 2;
		int empRatePerHr = 20;
		int salary=0;
		int empCheck = (int) Math.floor(Math.random() * 10)% 3;
		
		if (empCheck == 1)
		{
			int empHour = 8;
			salary = (empRatePerHr * empHour);
			System.out.println("Employee present then salary is:" +salary);	
		}
		if (empCheck == 2)
		{
			int empHour = 4;
			salary = (empRatePerHr * empHour);
			System.out.println("Employee present for half day then salary is:" +salary);	
		}
		else 
		{
			int empHour = 0;
			salary = (empRatePerHr * empHour);
			System.out.println("Employee Absent then salary is:" +salary);
		}
			
	}

}
