import java.util.Scanner;
class complex
{
int r,i;
public void display()
{
System.out.println("enter real part");
Scanner S=new Scanner(System.in);
r=S.nextInt();
System.out.println("enter imaginary part");
i=S.nextInt();
System.out.print("Complex number is:"+r+"+"+i+"i");
}
complex()
{
r=0;
i=0;
}
}
class mainclass
{
public static void main(String[ ] args)
{
complex c=new complex();
c.display();
}
}