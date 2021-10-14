package geeksterAssignment2;

public class ConsonentsAndVowls {

	public static void main(String[] args) {
		String str="This is a simple question";
		str=str.toLowerCase();
		int n=str.length();
		int v=0, c=0;
		for(int i=0;n>i;i++)
		{
			if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='o')||(str.charAt(i)=='i')||(str.charAt(i)=='u'))
			{
				v++;
			}
			else if(str.charAt(i)==' ')
			{
				continue;
			}
			else c++;
			
				
		}
		System.out.println("vovels "+v);
		System.out.println("consonent "+c);
		
		}


}
