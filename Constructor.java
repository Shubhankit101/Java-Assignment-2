package geeksterAssignment2;

public class Constructor {
	
	private	String fname;
	private String lname;
	private String rollNo;
	private int age;
	
	
	//Default
	public Constructor()
	{
		System.out.println(" Default Constructor called");
		this.fname="Shubhankit";
		this.lname="Tiwari";
		this.rollNo="BCS/067";
		this.age=22;
	}
	
	//Parameterized
	public Constructor(String fname,String lname,String rollNo,int age)
	{
		this.fname=fname;
		this.lname=lname;
		this.rollNo=rollNo;
		this.age=age;
	}
	
	
	void display() {
		System.out.println(" First Name is "+ this.fname);
		System.out.println(" Last Name is "+ this.lname);
		System.out.println(" Roll no is "+ this.rollNo);
		System.out.println(" Age is "+ this.age);
		
	}
	
}
