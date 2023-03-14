import java.util.Scanner;
public class Biggest3no {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 3 integer value : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		
		
		if(x>y &&x>z)
		{
			System.out.println(x+": is biggest no");
		}
		else if(y>x && y>z)
		{
			System.out.println(y+": is biggest no");
		}
		else 
		{
			System.out.println(z+": is biggest no");
		}

	}

}
