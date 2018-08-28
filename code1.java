import java.util.Scanner;
class area
{
int l,b;
public void CalculateArea()
{
System.out.println("enter length");
Scanner S=new Scanner(System.in);
l=S.nextInt();
System.out.println("enter breadth");
b=S.nextInt();
System.out.print("Area is:"+l*b);
}
area()
{
l=0;
b=0;
}
}
class mainclass
{
public static void main(String[ ] args)
{
area c=new area();
c.CalculateArea();
}
}