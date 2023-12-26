package practice;

 class student {
	String bankName , name;
	String phoneNumber;
	student(){
		bankName = "axis";
		name = "vikas";
		phoneNumber= "8920775907";
		
	}
	student(String bank, String naam , String phon ){
		bankName = bank;
		name = naam;
		phoneNumber = phon ;
	}
	void printDetails() {
		System.out.println("bankNAme is " + bankName);
		System.out.println("name of coutomer " + name);
		System.out.println("phone number is " + phoneNumber);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	student bank1 = new  student();
	student bank2 = new student("ICI" , "ramesh" , "6574840");
	bank1.printDetails();
	
	System.out.println("###################");
	bank2.printDetails();
	
	
		
	}

}
