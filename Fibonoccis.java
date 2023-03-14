import java.util.Scanner;
public class Fibonoccis 
{
	static void printfibonocci(int n)
	
	{
		int f1=0, f2=1;
		while(f1<n)
		{
			System.out.println(f1+" ");
			int f3=f1+f2;
			f1=f2;
			f2=f3;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n=sc.nextInt();
		printfibonocci(n);
	}

}
