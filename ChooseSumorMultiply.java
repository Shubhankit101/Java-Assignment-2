package geeksterAssignment2;

import java.util.Scanner;

public class ChooseSumorMultiply {

public static void main(String[] args) {
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		String op;
		System.out.println("Enter first Number");
		a=sc.nextInt();
		System.out.println("Enter Second Number");
		b=sc.nextInt();
		System.out.println("Choose operation");
		sc.nextLine();
		op=sc.nextLine();
		String ad="+";
		String mp="*";
		if(op.equals(ad))
		{
			int sum=add(a,b);
			System.out.println(sum);
		}
		else if(op.equals(mp))
		{
			int pr=mul(a,b);
			System.out.println(pr);
		}
		else System.out.println("Invlaid");
		
		
		sc.close();

	}
	public static int  add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	public static int mul(int a,int b)
	{
		int sum=a*b;
		return sum;
	}


}
