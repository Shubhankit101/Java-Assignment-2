package geeksterAssignment2;

public class MissingNumber {

	public static void main(String[] args) {

		int []a= {1,2,3,4,5,6,7,9,10,11};
			//System.out.println(a.length);
			int sum=0;
			for(int i=0;a.length>i;i++)
			{
				sum=a[i]+sum;
			}
			//System.out.println(sum);
			int osum=((a.length+1)*(a.length+2))/2;
			System.out.println(osum-sum);
	}

}
