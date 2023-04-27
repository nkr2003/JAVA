import java.util.*;
class A
{
float f1;//fill here
}
class prog extends A
{
float i;//fill here
Scanner sc=new Scanner(System.in);
void input()
{
    Scanner ref=new Scanner(System.in);
   f1= ref.nextFloat();
   i=ref.nextFloat();
}
void display()
{
//write your code here to display i value
 System.out.println(f1);
 System.out.println(i);
}
public static void main(String[] args)
{
//write your code here
 prog tt=new prog();
 tt.input();
 tt.display();
}
}
