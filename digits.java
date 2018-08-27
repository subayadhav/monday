import java.io.*;
class digits
public static void main(String args[])
{
  count=0;
  num=6789;
  while(num!=0)
{
  num=num/10;
  ++count;
}
  System.out.println("number of digits='+count);
}
