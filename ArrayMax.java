import java.io.*;
import java.util.*;

 class ArrayMax
{
   public static void main(String args[])
   {
       int l, size, i;
       int arr[] = new int[50];
       Scanner sc = new Scanner(System.in);
	   
       System.out.println("Enter Array Size : ");
       size = sc.nextInt();
	   
       System.out.println("Enter Array Elements : ");
       for(i=0; i<size; i++)
       {
           arr[i] = sc.nextInt();
       }
	   
       System.out.println("Searching for the Smallest Element....\n\n");
	   
       l = arr[0];
	   
       for(i=0; i<size; i++)
       {
           if(l < arr[i])
           {
               l = arr[i];
           }
           
       }
	   
       System.out.print("largest Element = " + l); 
   }
}
