package ashu1;
import java.util.*;
public class ashu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter years of experience = ");
		int years = myObj.nextInt();
		System.out.println("Years are = " + years);
		if(years >= 5) {
			System.out.print("Enter your salary = ");
			double salary = myObj.nextDouble();
			
			salary = salary + (salary*5/100);
			System.out.println("your new salary is = " + salary);
			
		}
		else {
			System.out.println("for new salary you need minimum 5 year experience  ");
		}
		
		}

}
