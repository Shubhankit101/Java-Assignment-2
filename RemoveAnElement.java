package geeksterAssignment2;

public class RemoveAnElement {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,7};
		int n=a.length;
		int k=5;
		int b[]=new int[n-1];
		
		int j=0;
		for(int i=0;n>i;i++)
		{
			if(a[i]!=k)
			{
				b[j]=a[i];
				j++;
			}
		}
		for(int i=0;n-1>i;i++) {
		System.out.print(b[i]+" ");
		}
		

	}

}
