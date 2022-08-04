import java.util.Scanner;
public class Primeno
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number you desire");
		int n=sc.nextInt();
		int count=0;
		for (int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
	{
		System.out.println("the no is prime.");
	}
	else
	{
		System.out.println("the no is not prime.");
	}
	}	

}