
public class EmpWageComputation {

	public static void main(String[] args) {
	    final int fullTime=1;
		final int partTime=2;
		int ratePerHr=20;
		int salary;
		int empHrs=0;
		int empCheck=(int) (Math.floor(Math.random()*10)%3);
		switch(empCheck)
		{
		case fullTime:
					System.out.println("Emloyee is Fulltime");
					empHrs=8;
					salary=empHrs*ratePerHr;
					System.out.println("Employee Wage: "+salary);
					break;
		case partTime:
					System.out.println("Employee is PartTime");
					empHrs=4;
					salary=empHrs*ratePerHr;
					System.out.println("Employee Wage: "+salary);
					break;
		default:
					System.out.println("Employee is Absent");
		}

	}

}
