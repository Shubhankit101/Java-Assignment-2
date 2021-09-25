package geeksterAssignment2;

public class Starter {

	public static void main(String[] args) {
		
		Constructor cn= new Constructor();
		cn.display();
		

		System.out.println();
		System.out.println();
		System.out.println("Using Parameterized Constuctor");
		
		Constructor pcn= new Constructor("AMC","BKC","ACD/9213",78);
		pcn.display();
		
		
		
	}

}
