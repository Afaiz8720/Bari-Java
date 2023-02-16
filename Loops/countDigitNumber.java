package Loops;
import java.util.*;
public class countDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int count = 0 ;
        while(number > 0 ){
            int rem = number % 10 ;
            count++ ;
            number /= 10 ;
        }
        System.out.println("Count is : " + count);
        sc.close();
    }
}
