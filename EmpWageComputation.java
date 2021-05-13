
public class EmpWageComputation {

	public static void main(String[] args) {
		int fullTime=1;
		int ratePerHr=20;
		int salary;
		int empCheck=(int) (Math.floor(Math.random()*10)%2);
		if(empCheck==fullTime)
		{
			System.out.println("Emloyee is present");
			int empHrs=8;
			salary=empHrs*ratePerHr;
			System.out.println("Employee Wage: "+salary);
		}
		else
		{
			System.out.println("Employee is absent");
			int empHrs=0;
			salary=empHrs*ratePerHr;
			System.out.println("Employee Wage: "+salary);
		}	

	}

}
