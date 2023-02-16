package Loops;
import java.util.*;
public class printNumberRem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        while(number > 0){
            int rem = number % 10 ;
            number /= 10 ;
            System.out.println(rem);
        }
    }
}
