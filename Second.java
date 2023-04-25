//A class Shape is defined with two overloading constructors in it. Another class Test1 is partially defined which inherits the class Shape. The class Test1 should include two overloading constructors as appropriate for some object instantiation. You should define the constructors using the super class constructors. Also, override the method calculate() in Test1 to calculate the volume of a Shape.
import java.util.Scanner;
class Shape{
   double length, breadth;
   Shape(double l, double b){ 
      length = l;
      breadth= b;
    }
  Shape(double len){
     length = breadth = len;
   }
  double calculate(){ 
    return length * breadth ;
  }
}
class Test1 extends Shape{    
double height;
Test1(double l,double h)
{
 super(l);
 this.length = l;
 this.height = h;
}
Test1(double l,double b,double h)
{
  super(l,b);
  this.length=l;
  this.breadth=b;
  this.height=h;
}
double calculate()
{
 return length*breadth*height; 
}
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter value of length: ");
	double l=sc.nextDouble(); //Read length
	System.out.print("Enter value of breadth: ");
	double b=sc.nextDouble(); //Read breadth
	System.out.print("Enter value of height: ");
	double h=sc.nextDouble(); //Read height
	Test1 myshape1 = new Test1(l,h);
	Test1 myshape2 = new Test1(l,b,h);
	double volume1;
	double volume2;
	volume1 = myshape1.calculate();
	volume2=myshape2.calculate();
	System.out.println("The value of volume1(l*b): "+volume1);
	System.out.println("The value of volume2(l*b*h): "+volume2);
	}
}
