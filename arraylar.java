import java.io.*;
import java.util.*;
public clas arraylar
{
public static void main(String args[])
{
int a[]=new int[10];
int largest,n,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
n=sc.nextInt();
System.out.println("enter the array elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
largest=a[0];
for(i=0;i<n;i++)
if(a[i]>largest)
{
largest=a[i];
}
System.out.println("the largest number is"+largest);
}
}

