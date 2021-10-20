package geeksterAssignment2;

public class TwoDArraySumOf {

	public static void main(String[] args) {
		int [][]a= {{5,50,55},{8,8,16},{3,4,7}};
		int c=0;
		for(int i=0;a.length>i;i++)
		{
			int j=0;
				if(a[i][j]+a[i][j+1]==a[i][j+2])
				{
				c++;	
				}
			
		}
		if(c==3) System.out.println("True");
		else System.out.println("False");
	}

}
