package guvi;

import java.util.Scanner;

public class hunter2 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of element");
		int temp=0;
		int n=in.nextInt();
	     int[] a=new int[n];
	     System.out.println("Enter the element");
	     for(int i=0;i<n;i++)
	     {
	    	 a[i]=in.nextInt();
	     }
	     for(int i=0;i<n-1;i++)
	     {
	    	 for(int j=i+1;j<n;j++)
	    	 {
	    		 if(a[i]<a[j])
	    		 {
	    			 temp=a[i];
	    			 a[i]=a[j];
	    			 a[j]=temp;
	    			 
	    		 }
	    	 }
	     }
	     for(int i=0;i<n;i++)
	     {
	    	 System.out.println(a[i]);
	     }
	     
	     
	     
	}

}
