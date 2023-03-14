import java.util.Scanner;
public class ValidMonthorNot 
{
	// we have to find the perticular month has how much day
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month no : ");
		int n=sc.nextInt();
		
		if(n==1 || n==3 || n==5 || n==7 ||n==8|| n==10 || n==12)
			System.out.println( n +" Month has 31 Days");
		else if(n==4 || n==6 || n==9 ||n==11)
			System.out.println(n+" Month has 30 Days");
		else if(n==2)
			{
			System.out.println(n+" Month has 28 or 29 Days");
			}
		else 
		{
			System.out.println(n+" Invalid month No");
		}	
	}
}
