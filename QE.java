import java.util.*;
class QE {

    
  public static void main(String[] Strings) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Input a: ");
            double a = sc.nextDouble();
            System.out.print("Input b: ");
            double b = sc.nextDouble();
            System.out.print("Input c: ");
            double c = sc.nextDouble();

            double result = b * b - 4.0 * a * c;

            if (result > 0.0) {
                double x = (-b + Math.pow(result, 0.5)) / (2.0 * a);
                double y = (-b - Math.pow(result, 0.5)) / (2.0 * a);
                System.out.println("The roots are " + x + " and " + y);
            } else if (result == 0.0) {
                double x = -b / (2.0 * a);
                System.out.println("The root is " + x);
            } else {
                System.out.println("The equation has no real roots.");
            }

    }
}
