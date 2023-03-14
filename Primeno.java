import java.util.Scanner;
public class Primeno 
{
	static boolean isPrime(int n)
	{
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range :");
		int x=sc.nextInt();
		for (int i=1; i<x; i++)
		{
			boolean rs=isPrime(i);
			if(rs)
				System.out.println(i+" ");
		}
	}
}