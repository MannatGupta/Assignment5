import java.util.Scanner;
class code5
{
int[ ] arr=new int[10];
public void sort()
{
int a,temp,n=10;
System.out.print("Enter elements:");
Scanner S=new Scanner(System.in);
for(a=0;a<10;a++)
{
  arr[a]=S.nextInt();
}
for(int i=0;i<n;i+=2)
   {
     temp=arr[i];
     arr[i]=arr[i+1];
     arr[i+1]=temp; 
   } 
 for (int i=0; i<n; i++)
      System.out.print(+arr[i]+" ");
}
}
class mainclass
{
public static void main(String[ ] args)
{
code5 c=new code5();
c.sort();
}
}
