import java.io.*;
class leapyear
public static void main(String args[])
{
int year=1999;
if(year%4==0)
{
if(year%100==0)
{
if(year%400==0)
{
System.out.println("leap year");
}
}
}
else
{
System.out.println("not a leap year");
}
}
