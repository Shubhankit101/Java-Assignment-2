package geeksterAssignment2;

import java.util.Scanner;

public class ReplaceNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number you want to replace");
		int k1=sc.nextInt();
		int []a= {121,223,33,44,76,14,9,90};
		System.out.println("Enter the new Element");
		int in=sc.nextInt();
		int ind=0;
		for(int i=0;a.length>i;i++)
		{
			if(k1==a[i])
			{
				ind=i;
				a[ind]=in;
			}
		}
		for(int i=0;a.length>i;i++)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

}
