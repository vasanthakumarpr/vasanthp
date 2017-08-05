package guvi;

import java.util.Scanner;

public class hunter132 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		int a=n;
		for(int j=n;j>0;j--){
		for(int i=0;i<a;i++)
		{
			System.out.print("*");
		}
		System.out.print(" ");
		for(int i=0;i<a;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		a--;
		
	
	}
	}
}
