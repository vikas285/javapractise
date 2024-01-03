package vikas1project;
import java.util.*;

public class Vikas {
   private String name;
   private int age;
    public Vikas(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }



	  public static void main(String[] args) {
	    Vikas person1 = new Vikas("Ean Craig", 11);
	    Vikas person2 = new Vikas("Evan Ross", 12);
	    System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
	    System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
	  }
	  }