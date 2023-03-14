import java.util.Scanner; 
public class Palindrome 
{
	static boolean isPalindrome(int n)
	{
	int rev=0, temp=n;
		do 
		{
		int r=n%10;
		rev=rev*10+r;
		n=n/10;
		}
		while(n!=0);
		return rev==temp;
	public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value :");
			int x= sc.nextInt();
			boolean rs=isPalindrome(x);
			if(rs)
				System.out.println("palindrome");
			else
				System.out.println("Not palindrome");

		}
	}
}
