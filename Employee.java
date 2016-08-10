import java.util.Scanner;
public class Employee {
	String firstName,lastName;
	double monthSal;
	public Employee(String a,String b,double c)
	{
		firstName=a;
		lastName=b;
		if(c>=0)
			monthSal=c;
	}
	public Employee() {
		}
	Scanner input=new Scanner(System.in);
	public void setFirst()
	{
		System.out.println("Enter the Firstname");
		firstName=input.next();
	}
	public String getFirst()
	{
		return this.firstName;
	}
	public void setLast()
	{
		System.out.println("Enter the Lastname");
		lastName=input.next();
	}
	public String getLast()
	{
		return this.lastName;
	}
	public void setSal()
	{
		System.out.println("Enter the Month Salary");
		double d=input.nextDouble();
		if(d>=0)
			monthSal=d;
	}
	public double getSal()
	{
		return this.monthSal;
	}
	public void inc()
	{
		monthSal=monthSal+(0.1)*monthSal;
	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setFirst();
		e1.setLast();
		e1.setSal();
		Employee e2=new Employee("Gopala","Krishnan",10000);
		System.out.println("Yearly salary of Employee 1 is "+e1.monthSal*12+"  \nYearly salary of Employee 2(Initialized with Parameterized Constructor) is "+e2.monthSal*12);
		e1.inc();
		e2.inc();
		System.out.println("Incremented salary of Employee 1 is "+e1.getSal()*12+"  \nIncremented salary of Employee 2(Initialized with Parameterized Constructor) is "+e2.getSal()*12);
 		}

}
