import java.io.*;
import java.util.*;
class prime
{
public static void main(String args[])
{
int i,num,count=0;
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
for(i=2;i<num;i++)
{
if(num%i==0)
{
count++;
break;
}
}
if(count==0)
{
System.out.println("the given number is a prime number");
}
else
{
System.out.println("not a prime number");
}
}
}
