package practice;

public class Standers {

	String name ;
	int rollno , marks , phoneNumber ;
	static int popullation;
	Standers(String naam , int roll , int mark ,int phone){
		
		this.name = naam;
		this.rollno = roll;
		this.marks = mark;
		this.phoneNumber = phone;
		Standers.popullation += 1;
		
	}
	
	void printDetails() {
		System.out.println("serial no " + Standers.popullation);
		System.out.println("name is " + name);
		System.out.println("roll no is " + rollno);
		System.out.println("marks is " + marks);
		System.out.println("my phonNumber is " + phoneNumber);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		Standers vikas = new Standers("vikas", 23, 55 , 892334533);
		vikas.printDetails();
		
		Standers vishal = new Standers("vishal" , 24 ,65 ,893455676);
		vishal.printDetails();
		
		Standers neelam = new Standers("neelam" , 25 ,70 ,89345777);
		neelam.printDetails();
		
	
		// TODO Auto-generated method stub

	}

}
