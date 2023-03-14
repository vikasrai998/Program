import java.util.Scanner;
public class fsmallno 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two integer no :");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int small=x;
		if(x<y)
		{
			System.out.println(x+":is Smallest No");
		}
		else
		{
			System.out.println(y+":is Smallest No");
		}
		
		
	}

}
