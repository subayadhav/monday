import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("enter the first number");
        Scanner sc=new Scanner(System.in);
        int firstinterval=sc.nextInt();
        System.out.println("enter the second number");
        Scanner in=new Scanner(System.in);
        int secondinterval=in.nextInt();
        for(int number = low + 1; number < high; ++number) {
            int digits = 0;
            int result = 0;
            int originalNumber = number;
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber =number;
            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == number)
                System.out.print(number + " ");
        }
    }
}
