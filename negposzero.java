import java.util.Scanner;
public class negposzero 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int x=sc.nextInt();
		
		if (x>0) {
			System.out.println("THE VALUE IS POSITIVE");
		}
		if(x<0)
		{
			System.out.println("THE VALUE IS NEGATIVE");
		}
		if(x==0)
		{
			System.out.println("THE VALUE IS ZERO");
		}
	}
}
