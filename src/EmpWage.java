import java.util.Scanner;

public class EmpWage {

	public void DailyWage() 
	{
		int Full_Time = 1;
		int empRatePerHr = 20;
		int salary=0;
		int empCheck = (int) Math.floor(Math.random() * 10)% 2;
		
		if (empCheck == 1)
		{
			int empHour = 8;
			salary = (empRatePerHr * empHour);
			System.out.println("Employee present then salary is:" +salary);	
		}
		else 
		{
			int empHour = 0;
			salary = (empRatePerHr * empHour);
			System.out.println("Employee present then salary is:" +salary);
		}
			
	}
	

}
			
			
		
			
				
			  

	


