package geeksterAssignment2;
import java.util.Scanner;
public class TotalCharacterCount {
	

	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			int n=str.length();
			int c=0;
			for(int i=0;n>i;i++)
			{
				if(str.charAt(i)==' '){
					
				}
				else c++; 
			}
			System.out.print(c);
			sc.close();
			
		}

	}
