package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class hunter1 
{

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		
		int n=in.nextInt();
		int[] a=new int[n];
		
		System.out.println("Enter the array elements : ");
		
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		in.close();
		
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		
	}

}
