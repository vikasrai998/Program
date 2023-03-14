import java.util.Scanner;
public class Addsubmulti 
{

	public static void main(String[] args) 
	{
		System.out.println("ENTER THE TWO INTEGER VALUE :");
		Scanner vr=new Scanner(System.in);
		int x=vr.nextInt();
		int y=vr.nextInt();
		
		System.out.println("sum is :"+(x+y));
		System.out.println("substract is :"+(x-y));
		System.out.println("multiply is :"+(x*y));
		System.out.println("division is :"+(x/y));
		System.out.println("module is :"+(x%y));
		

	}

}
