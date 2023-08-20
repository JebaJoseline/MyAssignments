package week1.day2;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a integer value till which we need to find prime:");
		int n= sc.nextInt();
		int IsPrime=0;
		for(int i=2;i <= n-1; i++)
		{
			int num= n%i;
			if(num==0) 
			{
			  System.out.println(n+" is Not a Prime Number:");
			  IsPrime++ ;
			  break;
			  
			}
			
		}

	if (IsPrime==0)
	{
		System.out.println(n+" is a Prime Number:");
	}
	}

}
