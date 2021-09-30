package geeksterAssignment2;

import java.util.Scanner;

public class CheckAscending {

	public static void main(String[] args) {
		int n; System.out.println("Enter Size of Array");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter Elements of Array");
		//n=sc.nextInt();
		int a[] =new int[n];
		for(int i=0;n>i;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int c=0;
		
		for(int i=0;n-1>i;i++)
		{
			if(a[i]>a[i+1])
			{
				c++;
			}
		}
		
		if(c==0) {System.out.println("True");}
		else  System.out.println("False");
		sc.close();
	}

	}

