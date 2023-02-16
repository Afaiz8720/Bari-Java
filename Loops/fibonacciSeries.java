package Loops ;

import java.util.*;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0 , b = 1 ;
        System.out.println("Enter a value of c : ");
        int num = sc.nextInt();
        
        System.out.print(a + ",");
        System.out.print(b + ",");
        for(int i = 1 ; i < num ; i++ ){
            int c = a + b ;
            System.out.print(c + ",");
            a = b ;
            b = c ;
        }
        
    }
    
}