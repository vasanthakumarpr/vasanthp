package guvi;

import java.util.Scanner;

public class pro  
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int count=1;
		String a[]={"vasanth","vasn","vasanthkumar"};
		for(int i=1;i<a.length-1;i++)
		{
			count=0;
			for(int j=0;j<Math.min(a[i].length()-1,a[i+1].length()-1);j++)
			{
				if(a[i].substring(0,j+1).equals(a[i+1].substring(0,j+1)))
				{
					count++;
				}}
			
			
		}if(count!=0){
			System.out.print("The prefix of given string array is : ");
		for(int i=0;i<=count;i++){
		System.out.print(a[0].substring(i,i+1));}
		}else{
			System.out.println("There is no prefix in a given array of string.");
		}
	}
	}		

	


