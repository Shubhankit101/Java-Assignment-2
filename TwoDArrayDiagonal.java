package geeksterAssignment2;

public class TwoDArrayDiagonal {

	public static void main(String[] args) {
		int a[][]= {{1,1,3},{1,1,9},{3,1,1}};
		int c=0;
		for(int i=0;a.length-1>i;i++)
		{
			for(int j=0;a[i].length-1>j;j++)
			{
				           if(i==j) { if(a[i][j]==a[i+1][j+1]) c++;           }
			}
		}
		if(c==2) System.out.println("True "+c);
		else  System.out.println("False "+ c);
		
	}

}
