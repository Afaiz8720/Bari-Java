package Loops;
import java.util.*;
public class arthimeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a :");
        int a = sc.nextInt();
        System.out.println("Enter number d :");
        int d = sc.nextInt();
        System.out.println("Enter number n :");
        int n = sc.nextInt();
        
        int term = a ;
        for (int i = 0 ; i < n ; i++) {
            System.out.print(term + ",");
            term += d ;
        }

    }
}
