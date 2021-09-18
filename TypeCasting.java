package geeksterAssignment2;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		
		int x;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		
		//Implicit typeCasting
		
		float f=x;
		long l=x;
		
		System.out.println("float "+ f);
		System.out.println("long "+ l);
		//Explicit TypeCasting
		short s=(short)x;
		double d=(double)x;
		System.out.println("short "+ s);
		System.out.println("double "+ d);
		
		
		
		sc.close();
		

	}

}
