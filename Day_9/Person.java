/*Create a class called Person with a member variable name. Save it in a file called Person.java 
Create a class called Employee who will inherit the Person class.The other data members of the 
employee class are annual salary (double), the year the employee started to work, and the 
national insurance number which is a String.Save this in a file called Employee.java Your class 
should have a reasonable number of constructors and accessor methods. Write another class 
called TestEmployee, containing a main method to fully test your class definition. */
 

import java.util.*;
class person
{
String name;
person()
{
System.out.println("enter name");

Scanner ob=new Scanner(System.in);
name=ob.next();
//System.out.println("enter name");
}

void show()
{
System.out.println( name);
}
}
class employee extends person
{
double annual_salary;
int year;
String i_num;
employee()
{
Scanner sc=new Scanner(System.in);
System.out.println( " enter annual_salary" );
  annual_salary =sc.nextDouble();
  System.out.println( " enter year" );

 year=sc.nextInt();
 System.out.println( " enter insurance number" );
 i_num =sc.next();
   }
 void disp()
 {
  System.out.println(annual_salary);
  System.out.println(  year);
  System.out.println( i_num );
  }
  }

public class TestEmployee
{
public static void main(String[] args)
{
employee e1=new employee();
e1.show();
e1.disp();
}}
