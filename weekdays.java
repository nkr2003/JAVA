import java.util.*;
class Weekday{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter weekday number : ");
    int weekday = sc.nextInt();
    if(weekday == 1) {
        System.out.println("Monday");
        
    } 
    else if(weekday == 2) {
        System.out.println("DAY: Tuesday");
        
    } 
    else if(weekday == 3) {
        System.out.println("DAY: Wednesday");
    }
    else if(weekday == 4) {
        System.out.println("DAY: Thursday");
        
    } 
    else if(weekday == 5) {
        System.out.println("DAY: Friday");
    } 
    else if(weekday == 6) {
        System.out.println("DAY: Saturday");
    } 
    else if(weekday == 7) {
        System.out.println("DAY: Sunday");
    }
    else {
        System.out.println("Enter weekday number between 1-7");
    }
}
}
