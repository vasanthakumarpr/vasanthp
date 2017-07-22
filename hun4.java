package guvi;

import java.util.Scanner;

public class hunter4 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the element");
		int n=in.nextInt();
		int[] arr=new int[n];
		int c=0;
		System.out.println("Enter the Array element");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			for(int k=0;k<arr.length;k++)
			{
				if(j!=k)
			{
					if(arr[j]!=arr[k])
				{c=1;}
			else 
			{
			c=0;
			break;}
					}
				}
			if(c==1)
			{
			
		System.out.println(arr[j]);
			}
	}}
}

