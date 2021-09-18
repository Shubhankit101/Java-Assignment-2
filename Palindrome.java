package geeksterAssignment2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		int n=s.length();
		char []c=s.toCharArray();
		String x="";
		for(int i=1;n>=i;i++)
		{
			x=x+c[n-i];
		}
		 //System.out.println(s+"  "+x);
		if(s.equals(x)) System.out.println("Palindrome");
		
		else System.out.println("Non-Palindrome"); 
		//System.out.println(x);
		sc.close();
	}
	

}
