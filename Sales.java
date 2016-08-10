import java.util.Scanner;
public class Sales {
	Scanner input=new Scanner(System.in);
	int c;
	int[] sale;
	int[] a=new int[9];
	public void set()
	{
		System.out.println("Enter the no. of Salespersons");
		c=input.nextInt();
		sale=new int[c];
	}
	public void setData()
	{
		System.out.println("Enter their Sales Grosses");
		for(int i=0;i<sale.length;i++)
		{
			sale[i]=input.nextInt();
		}
	}
	public void cal()
	{
		for(int i=0;i<sale.length;i++)
		{
			sale[i]=(int) (200+(0.09)*sale[i]);
				
		}
	}
	public void check()
	{
		for(int k=0;k<a.length;k++)
			a[k]=0;
		for(int j=0;j<sale.length;j++)
		{
			if((sale[j]>=200) && (sale[j]<300))
				a[0]++;
			else if((sale[j]>=300) && (sale[j]<400))
				a[1]++;
			else if((sale[j]>=400) && (sale[j]<500))
				a[2]++;
			else if((sale[j]>=500) && (sale[j]<600))
				a[3]++;
			else if((sale[j]>=600) && (sale[j]<700))
				a[4]++;
			else if((sale[j]>=700) && (sale[j]<800))
				a[5]++;
			else if((sale[j]>=800) && (sale[j]<900))
				a[6]++;
			else if((sale[j]>=900) && (sale[j]<1000))
				a[7]++;
			else    a[8]++;
		}
		System.out.println("$200-299  $300-399  $400-499  $500-599  $600-699  $700-799  $800-899  $900-999  $1000&above");
		for(int k=0;k<a.length;k++)
				System.out.printf("    "+a[k]+"     ");
		
		}
		
	
	public static void main(String[] args) {
	Sales s1=new Sales();
	s1.set();
	s1.setData();
	s1.cal();
	s1.check();
	}

}
