package guvi;
import java.util.Scanner;

public class hunter133 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=in.nextLine();	
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				System.out.println(s.substring(i+1)+ " "+s.substring(0,i));
			}
		}
	
		
	}

}
