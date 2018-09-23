import java.io.*;
import java.util.*;
class Main{  
  public static void main(String[] args)  {  
    int result=0,remainder,originalnumber; 
    System.out.println("enter the number");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    
    originalnumber=number;  
    while(number>0)  
    {  
    remainder=number%10;  
    number=number/10;  
    result=result+(remainder*remainder*remainder);  
    }  
    if(originalnumber==result)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
}  
