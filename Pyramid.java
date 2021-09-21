package geeksterAssignment2;

public class Pyramid {

	public static void main(String[] args) {
		
		int n=5;
	
		for(int i=1;n>=i;i++)
		{
			//for printing space
			for(int j=n;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
            for(int j=2;j<=i;j++)
            {
                System.out.print(" *");
            }
			
			
			System.out.println();
		}
	
}

}
