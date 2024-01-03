package vikas1project;
import java.util.*;
public class Rectangle {
	
	
	  private double width;
	  private double height;

	  public Rectangle(double width, double height) {
	    this.width = width;
	    this.height = height;
	  }
	  public double getWidth() {
	    return width;
	  }
	  public void setWidth(double width) {
	    this.width = width;
	  }
	  public double getHeight() {
	    return height;
	  }
	  public void setHeight(double height) {
	    this.height = height;
	  }
	  public double getArea() {
	    return width * height;
	  }
	  public double getPerimeter() {
	    return 2 * (width + height);
	  }
	

	  public static void main(String[] args) {
	    Rectangle rectangle = new Rectangle(7, 12);

	    System.out.println("The area of the rectangle is " + rectangle.getArea());
	    System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());

	    rectangle.setWidth(6);
	    rectangle.setHeight(12);

	    System.out.println("\nThe area of the rectangle is now " + rectangle.getArea());
	    System.out.println("The perimeter of the rectangle is now " + rectangle.getPerimeter());
	  }
	  }


