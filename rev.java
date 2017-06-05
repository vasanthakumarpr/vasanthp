import java.util.Scanner;

public class revv
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=in.next();
	    StringBuffer s1=new StringBuffer(s);
	    StringBuffer s2=s1.reverse();
		System.out.println(s2);
		
	}

}
