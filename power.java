import java.io.*;
import java.util.*;
class power
{
public static void main(String args[])
{
System.out.println("enter the base and exponent numbers");
Scanner in=new Scanner(System.in);
int base=in.nextInt();
int exponent=in.nextInt();
int result=1;
while(exponent!=0)
{
result*=base;
--exponent;
}
System.out.println("the power of the numbers are="+result);
}
}
