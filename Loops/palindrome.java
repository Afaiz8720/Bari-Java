package Loops;

import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int ans = 0 ;
        int result = number ;
        while(number != 0){
            int rem = number % 10 ;
            ans = (ans * 10) + rem ;
            number /= 10 ;

           // System.out.println("ans " + ans + " rem " + rem + " number " + number );
        }
        System.out.println("Answer is : " + ans);

        if(ans == result){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}