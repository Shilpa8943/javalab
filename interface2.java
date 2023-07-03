import java.util.Scanner;

interface areaperi1
{
void areaperi(double a ,double b);

}

class rectangle implements areaperi1

{
double l,b;
public void areaperi(double l,double b)
{
this.l=l;
this.b=b;
System.out.println("area of rectangle:"+l*b);
System.out.println("perimeter of rectangle is:"+(2*(l+b)));
}
}
class circle implements areaperi1
{
double r;
double p;
public void areaperi(double r,double pi)
{
this.r=r;
p=pi;
System.out.println(String.format("area of circle is :%,.2f",3.14*r*r));
System.out.println(String.format("perimeter of circle is:%.2f",2*p*r));

}
}

class interface2
{
public static void main(String args[])
{
double l1,b1;
double r1,p1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the length:");
l1=sc.nextDouble();
System.out.println("enter the breadth:");
b1=sc.nextDouble();
System.out.println("enter the radius:");
r1=sc.nextDouble();
System.out.println("enter the value of pi:");
p1=sc. nextDouble();

rectangle r=new rectangle();
r.areaperi(l1,b1);
circle c=new circle();
c.areaperi(r1,p1);
}
}






