import java.io.*;
import java.util.*;
class even
{
public static void main(String args[])
{
int num,i,a;
System.out.println("enter the first number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
System.out.println("enter the second number");
Scanner in=new Scanner(System.in);
a=in.nextInt();
for (i=num+1;i<a;i++)
{
if(i%2==0)
{
System.out.println(i + " ");
}
}
}
