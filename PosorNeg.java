import java.util.*;
class NorP {

    
  public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
    if (num > 0)
        {
            System.out.println("The Number is positive");
        }
    else if (num < 0)
        {
            System.out.println("The Number is negative");
        }
        else
        {
            System.out.println("The Number is zero");
        }
    }
}
