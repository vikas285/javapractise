package practice;

public class Vikas {
	String name;
	int rollno;
	String subject;
	
	Vikas(String naam , int number ,String sub)
	{
		this.name = naam;
		this.rollno = number;
		this.subject = sub;
	}
	
	 void printDetails(){
		System.out.println("student name is " + name);
		System.out.println("student roll number is " + rollno);
		System.out.println("student love subject is " + subject);
	}

	public static void main(String[] args) {
		
		Vikas detail1 = new Vikas("vikas", 24 , "maths");
		detail1.printDetails();
		
		System.out.println("################");
		
		Vikas details2 = new Vikas("mohit", 34 , "science");
		details2.printDetails();
		System.out.println("################");
		Vikas detail3 = new Vikas("vishal", 25 , "sst");
		detail3.printDetails();
		
		System.out.println("################");
		
		Vikas details4 = new Vikas("neelam", 26 , "generalscience");
		details4.printDetails();
		

	}

}
