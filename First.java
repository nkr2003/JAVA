//Define a class Point with two fields x and y each of type double. Also , define a method distance(Point
//p1, Point p2) to calculate the distance between points p1 and p2 and return the value in double. Use
//Math.sqrt( ) to calculate the square root.

import java.util.Scanner;
class Circle extends Point{
     public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     Point c=new Point();
       System.out.print("Enter value of x: ");
	     c.x=sc.nextDouble();
       System.out.print("Enter value of y: ");	             
       c.y=sc.nextDouble();
	     Point p=new Point();
       System.out.print("Enter value of p1: ");
	     p.x=sc.nextDouble();
       System.out.print("Enter value of p2: ");
	     p.y=sc.nextDouble(); 
	     Circle c1=new Circle();
	     c1.distance(c,p); 
    }
} 
class Point {
	double x,y;
	double distance(Point p1, Point p2)
	{
		double result;
		result = Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2));
 		System.out.print("The distance between point p1 and point p2: "+result);
		return result;		
	}
}
