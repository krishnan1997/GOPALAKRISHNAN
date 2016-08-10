import java.util.Scanner;
public class Duplicate {
	int[] arr=new int[5];
	int n;
	Scanner input=new Scanner(System.in);
	public Duplicate()
	{
		n=0;
	}
	
	public void insert(int b)
	{	
		int i;
		for(i=0;i<n;i++)
		{
			if(arr[i]==b)
				return;
		}
		arr[i]=b;
		n++;
	}	
	public void initialize()
	{
		for(int i=0;i<5;i++)
			arr[i]=0;
	}
	public void display()
	{
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
	public void setdata()
	{
		int d = 0;
		System.out.println("Enter 5 values from 10 to 100");
		for(int k=0;k<5;k++)
		{ 
		System.out.println("Enter an element");
			d=input.nextInt();
			insert(d);
		System.out.println("The array is");
			display();
		}
		}
	public static void main(String[] args) {
		Duplicate d1=new Duplicate();
		d1.initialize();
		d1.setdata();
		}

}
