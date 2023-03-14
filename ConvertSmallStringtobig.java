import java.util.Scanner;
public class ConvertSmallStringtobig 
{
			static String toUpper (String str)
			{
				char ch[]= str.toCharArray();
				for(int i=0; i<ch.length; i++)
				{
					if(ch[i]>='a'&& ch[i]<='z')
						ch[i]=(char)(ch[i]-32);
				}
				str=new String(ch);
				return str;
			}
			public static void main(String[] args) 
			{
				Scanner sc= new Scanner(System.in);
				System.out.println("enter the string: ");
				String st=sc.next();
				st=toUpper(st);
				System.out.println(st);
			}
}