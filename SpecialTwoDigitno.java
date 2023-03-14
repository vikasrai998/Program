import java.util.Scanner;
public class SpecialTwoDigitno {

	public static void main(String[] args) {
		
		Scanner vikas=new Scanner(System.in);
		System.out.println("Enter the 2 Digit no :");
		int x=vikas.nextInt();
		int d1=x/10;
		int d2=x%10;
		
		int sum=d1*d2 +d1+d2;
		
		if (sum==x)
			System.out.println(x+"is 2 Digit special no");
		else
			System.out.println(x+" is not a 2 Digit special no");
		
	}

}
