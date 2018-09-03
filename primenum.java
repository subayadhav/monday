import java.util.*;
public class primenum {

    public static void main(String[] args) {
        System.out.println("enter the first number");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println("enter the second number");
    Scanner in=new Scanner(System.in);
    int b=in.nextInt();
    while (a< b) {
            boolean flag = false;

            for(int i = 2; i <= a/2; ++i) {
              if(a % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(a+ " ");

            ++a;
        }
    }
}
