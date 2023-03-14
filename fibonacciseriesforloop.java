import java.util.Scanner;
public class fibonacciseriesforloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n : ");
		int n=sc.nextInt();
		int first=0;
		int second=1;
		System.out.println(first+" ");
		System.out.println(second+" ");
		int third =0;
		for(int i=0; third<n; i++)
		{
			third =first+second;
			if (third>n)
				break;
			System.out.println(third);
			
			first=second;
			second=third;
		}
		
	}

}