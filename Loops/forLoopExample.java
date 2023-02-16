package Loops ;
import java.util.*;

class forLoop{
    public void multiplicationTable(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(i + " * " + number + " = " + (i * number));
        }
        sc.close();
    }

    public void sumOfNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number : ");
        int number = sc.nextInt();
        int sum = 0 ;
        for(int i = 1 ; i <= number ; i++){
            System.out.println("Sum of numbers is : " + sum + " + " + i);
            sum += i ;
        }
        System.out.println("Sum of numbers is : " + sum);
        sc.close();
    }

    public void factorialNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number : ");
        int number = sc.nextInt();
        int fact = 1 ;
        for(int i = 1 ; i <= number ; i++){
            System.out.println("Factorial numbers is : " + fact + " * " + i);
            fact *= i ;
        }
        System.out.println("Factorial numbers is : " + fact);
        sc.close();
    }
   
}
public class forLoopExample {
   public static void main(String[] args) {
     forLoop s = new forLoop();
       s.multiplicationTable();
       s.sumOfNumbers();
       s.factorialNumber();
   } 
}
