import java.io.*;
class leap
public static void main(String args[])
{
int year=1999;
if(year%4==0)||(year%100!=0)&&(year%400==0)
{
System.out.printnl("leap year");
}
else
{
System.out.println("not a leap year");
}
}
