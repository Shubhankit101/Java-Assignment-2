package geeksterAssignment2;

public class IsPrime {

	public static void main(String[] args) {
		System.out.println("Prime Numbers Between 15 to 80");
		for(int i=15;i<=80;i++) {
			if(isPrime(i)) {
				
				System.out.print(i+" ");
			}
		}
	}
	public static boolean isPrime(int n) {
		boolean flag = false;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i == 0) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			return true;
		}
		return false;
	}
}
