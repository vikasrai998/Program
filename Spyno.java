import java.util.Scanner;
public class Spyno {

	public static void main(String[] args) 
	{
		// product and sum of no is equal
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no :");
		int x=sc.nextInt();
		int prod=1, sum=0;
		
		While(x!=0)
		{
			int d= x%10;
			sum = sum+d;
			prod=prod*d;
			x=x/10;
		}
		if (sum== prod)
			System.out.println("SPY NUMBER");
		else {
			System.out.println("NOT SPY NUMBER");
		}
		

	}

}
