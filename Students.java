//Creating a program with class and objects//
class Stud{
     int rollno;
     String name,Grade;
     
    public static void main(String args[])
    {
       System.out.println("Rollno" + "    " + "Name" + "   " + "Grade(50)");
        Stud S1=new Stud();
        Stud S2=new Stud();
        S1.rollno=1;
        S1.name="Rakesh";
        S1.Grade="35";
        S2.rollno=2;
        S2.name="Rupesh";
        S2.Grade="46";
        System.out.println(S1.rollno+"       "+S1.name+"      "+S1.Grade);
        System.out.println(S2.rollno+"       "+S2.name+"      "+S2.Grade);
    }
}
