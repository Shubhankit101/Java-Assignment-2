package geeksterAssignment2;

public class Merge2Sorted_Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {4,5,6,7,8};
		int an=a.length;
		int n=a.length+b.length;
		int c[]=new int [n];
		for(int i=0;an>i;i++)
		{
			c[i]=a[i];
		}
		int j=0;
	//	System.out.println(bn);
		for(int i=an;i<n;i++)
		{	
			c[i]=b[j];
			j++;
			
		}
		for(int i=0;n>i;i++)
		{
			System.out.print(c[i]+" ");
		}
	
		

	}

}
