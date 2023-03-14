import java.util.Scanner;
public class Evenno 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no :");
		int n= sc.nextInt();
		if(n%2==0)
			System.out.println(n+" is even No");
		else {
			System.out.println(n+" is odd No");
		}
		

	}
}
