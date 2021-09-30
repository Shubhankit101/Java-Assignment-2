package geeksterAssignment2;

import java.util.Scanner;

public class MinElement {
	
	public static void main(String [] args)
	{
		int n; System.out.println("Enter Size of Array");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter Elements of Array");
		
		int a[] =new int[n];
		for(int i=0;n>i;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;n>i;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		sc.close();
	}
	
}


