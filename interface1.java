import java.util.Scanner;

interface student
{
void details1(String sname,int rollno,float cgpa);
}
interface sports
{
void details2(float sportsmark);
}
class result implements student,sports
{

public String name;
public int rollno;
public float cgpa;
float p;
public void details1(String sname,int rollno1,float total)
{
this.name=sname;
this.rollno=rollno1;
this.cgpa=total;
}
public void details2(float sportsmark)
{
p=sportsmark;
}
void display()
{
System.out.println("student name:"+name);
System.out.println("student rollno:"+rollno);
System.out.println("student cgpa:"+cgpa);
System.out.println("student sportsmark:"+p);
}
}

class interface1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("enter the name of the student:");
String name=sc.nextLine();
System.out.println("enter the student rollno:");
int rollno=sc.nextInt();
System.out.println("enter the total mark obtained by the student:");
Float cgpa=sc.nextFloat();
System.out.println("enter the points obtained by the student:");
Float point=sc.nextFloat();

result r=new result();
r.details1(name,rollno,cgpa);
r.details2(point);
r.display();
}
}

