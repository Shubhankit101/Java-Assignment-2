package geeksterAssignment2;

public class A {

	public static void main(String[] args) {
		
		//Non Static method : Does not belong to the whole class so we have to create an object.
		
		B obj=new B();
		obj.add(7, 2);
		
		
		//Static method belong to whole class no need to use object to call it
		
		B.sum(3, 1);

	}

}
