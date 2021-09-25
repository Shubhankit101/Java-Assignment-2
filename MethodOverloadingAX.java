package geeksterAssignment2;

import java.util.Scanner;

public class MethodOverloadingAX {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		double ax=(double)a;
		double bx=(double)b;
		
		MethodOverloadingBX.sum(a,b);
		MethodOverloadingBX.sum(a,b,c);
		MethodOverloadingBX.sum(ax,bx);
		
		sc.close();
		

	}

}
