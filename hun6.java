package guvi;

import java.util.Scanner;

public class hunter6 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		int[] a=new int[l];
		int k=0;
		int temp[]=new int[l];
		for(int i=0;i<l;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<l-1;i++){
		for(int j=i+1;j<l;j++){
				if(a[i]==a[j]){
					temp[k]=a[i];
					k++;
				}
			}
		}
		System.out.println(temp[0]);
	}
	}

