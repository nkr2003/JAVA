import java.util.*;
class SandA {

    
  public static void main(String args[])

{       
    int i,a=0,b=0;
	double avg;
	{
	   
        System.out.println("Input the 5 numbers : ");  
         
	}
		for (i=0;i<5;i++)
		{
		    Scanner in = new Scanner(System.in);
		    a = in.nextInt();
		    
  		b +=a;
	}
	avg=b/5;
	System.out.println("The sum of 5 numbers is : " +b+"\nThe Average is : " +avg);
 
}
}
