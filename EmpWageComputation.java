
public class EmpWageComputation {

	public static void main(String[] args) {
		int fullTime=1;
		int partTime=2;
		int ratePerHr=20;
		int salary;
		int empCheck=(int) (Math.floor(Math.random()*10)%3);
		if(empCheck==fullTime)
		{
			System.out.println("Emloyee is Fulltime");
			int empHrs=8;
			salary=empHrs*ratePerHr;
			System.out.println("Employee Wage: "+salary);
		}
		else if(empCheck==partTime)
		{
			System.out.println("Employee is PartTime");
			int empHrs=4;
			salary=empHrs*ratePerHr;
			System.out.println("Employee Wage: "+salary);
		}	
		else
		{
			System.out.println("Employee is Absent");
		}

	}

}
