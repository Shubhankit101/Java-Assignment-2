package geeksterAssignment2;

public class Varargs {
	
	public static void main(String []args) {
		
		int x=10;
		
		int y=20;
		
		varags(x,y,1,2,3,4,5,6,7,8,9);
		
	}
	
	
	
	public static void varags(int a,int b,int ...z) {
		
		int sum=0;
		
		for(int i=0;i<z.length;i++) {
	
			sum=sum+z[i];
		}
		
		int result=sum+a+b;
		System.out.println("Sum is = "+result);
	}
	

}