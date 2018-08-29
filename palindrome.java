import java.io.*;
class palindrome
{
public static void main(String args[])
{
int reversenumber=0,originalnumber,reaminder;
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
originalnumber=num;
while(num!=0)
{
remainder=num%10;
reversenumber=reversenumber * 10 + remainder;
num/=10;
}
if(originalnumber=reversenumber)
System.out.println("the given number is palindrome");
else
System.out.println("not a palindrome");
}
}
