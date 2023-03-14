import java.util.Scanner;
public class Biggestno {

	public static void main(String[] args) 
	{
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two integer value : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int biggest=a;
		
		if(a>b)
		{
			System.out.println(a + ": is biggest no");
		}
		else {
			System.out.println(b+ ": is biggest no");
		}
		

	}

}
