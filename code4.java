class test
{
int r;
static int count;;
static
{
System.out.println("inside static 1");
count=10;
}
static
{
System.out.println(" inside static 2 with count="+count);
}
{
System.out.println("inside non static 1 with count="+count);
r=5;
}
{
System.out.println("inside non static 2 with count="+count+"with id="+r);
}
test()
{
System.out.println("inside constructor");
}
}
class mainclass
{
static
{
System.out.println("inside static main block");
}

public static void main(String[ ] args)
{
System.out.println("inside mainclass");
test t=new test();
test T=new test();

}
}

